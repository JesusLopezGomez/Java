package euroMillon.model;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Combinacion {
	
	
	private static final int VALOR_MINIMO = 1;
	private static final int VALOR_MAXIMO_NUMEROS = 50;
	private static final int VALOR_MAIXIMO_ESTRELLAS = 12;
	private static final int TOTAL_NUMEROS = 5;
	private static final int TOTAL_ESTRELLAS = 2;
	
	private Set<Integer> conjuntoNumeros;
	private Set<Integer> conjuntoEstrellas;
	
	public Combinacion(int numero1, int numero2, int numero3, int numero4, int numero5, int estrella1, int estrella2) throws CombinacionException {
		this(toArrayEnteros(numero1,numero2,numero3,numero4,numero5), toArrayEnteros(estrella1, estrella2));		
	}
	
	public Combinacion(int[] numeros, int[] estrellas) throws CombinacionException {
		super();
		this.conjuntoNumeros = new TreeSet<>();
		this.conjuntoEstrellas = new TreeSet<>();
		
		//Añadir numeros al conjunto de numeros
		for(int n : numeros) {
			this.conjuntoNumeros.add(n);
		}
		//Añadir estrellas al conjunto de estrellas
		for(int e : estrellas) {
			this.conjuntoEstrellas.add(e);
		}
		
		if(this.conjuntoEstrellas.size() != TOTAL_ESTRELLAS) {
			throw new CombinacionException("Error has introducido estrellas repetidas.");
		}
		if(this.conjuntoNumeros.size() != TOTAL_NUMEROS) {
			throw new CombinacionException("Error has introducido numeros repetidos.");
		}
		//Comprobar que no salgan estrellas fuera de rango
		for(int e : this.conjuntoEstrellas) {
			if(e < VALOR_MINIMO || e > VALOR_MAIXIMO_ESTRELLAS) {
				throw new CombinacionException("Error has introducido estrellas fuera de rango(1-12).");
			}
		}
		//Comprobar que no salgan numeros fuera de rango
		for(int n : this.conjuntoNumeros) {
			if(n < VALOR_MINIMO || n > VALOR_MAXIMO_NUMEROS) {
				throw new CombinacionException("Error has introducido numeros fuera de rango(1-50).");
			}
		}
	}
	
	public Set<Integer> getNumeros(){
		return this.conjuntoNumeros;
	}
	
	public Set<Integer> getEstrellas(){
		return this.conjuntoEstrellas;
	}
	
	public int comprobarCobinacion(Combinacion c) throws CombinacionException {
		int contNum = 0;
		int contEstrellas = 0;
		if(c != null) {
			for(Integer n : this.conjuntoEstrellas) {
				for(Integer n2 : c.conjuntoEstrellas) {
					if(n.equals(n2)) {
						contEstrellas ++;
					}
				}
			}
			for(Integer n : this.conjuntoNumeros) {
				for(Integer n2 : c.conjuntoNumeros) {
					if(n.equals(n2)) {
						contNum ++;
					}
				}
			}
		}else {
			throw new CombinacionException("Error, no puedes meter una combinacion nula");
		}

		return contNum + contEstrellas;
	}
	
	public static int[] toArrayEnteros(int...enteros) {
		return enteros;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conjuntoEstrellas, conjuntoNumeros);
	}

	@Override
	public boolean equals(Object obj) {

		return this==obj || obj!=null &&
	            obj instanceof Combinacion
	            && this.hashCode()==((Combinacion)obj).hashCode();
	}

	@Override
	public String toString() {
		return String.format("Combinación numeros %s y estrellas %s",this.conjuntoNumeros,this.conjuntoEstrellas);
	}
	
	
	
	
	
}
