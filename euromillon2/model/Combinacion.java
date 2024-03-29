package euromillon2.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Combinacion {

	protected static final int VALOR_MINIMO = 1;
	protected static final int VALOR_MAXIMO_NUMEROS = 50;
	protected static final int VALOR_MAXIMO_ESTRELLAS = 12;
	protected static final int TOTAL_NUMEROS = 5;
	protected static final int TOTAL_ESTRELLAS = 2;
	
	private Set<Integer> conjuntoNumeros; 
	private Set<Integer> conjuntoEstrellas; 

	 
	public Combinacion(int[] numeros, int[] estrellas) throws CombinacionException {
		super();
		this.conjuntoEstrellas = new TreeSet<>();
		this.conjuntoNumeros = new TreeSet<>();
		
		//Añadir numeros
		for(int i : numeros) {
			if(i >= VALOR_MINIMO && i <= VALOR_MAXIMO_NUMEROS) {
				this.conjuntoNumeros.add(i);
			}else {
				throw new CombinacionException("Error has introducido un numero fuera del rango(1-50).");
			}
		}
		
		//Añadir estrellas
		for(int i : estrellas) {
			if(i >= VALOR_MINIMO && i <= VALOR_MAXIMO_ESTRELLAS) {
				this.conjuntoEstrellas.add(i);
			}else {
				throw new CombinacionException("Error has introducido una estrella fuera del rango(1-12).");
			}
		}
		
		if(this.conjuntoEstrellas.size() != TOTAL_ESTRELLAS) {
			throw new CombinacionException("Error, has introducido estrellas repetidas.");
		}
		if(this.conjuntoNumeros.size() != TOTAL_NUMEROS) {
			throw new CombinacionException("Error has introducido numeros repetidos.");
		}
		
	}
	
	public Combinacion(int numero1, int numero2, int numero3, int numero4, int numero5, int estrella1, int estrella2) throws CombinacionException {
		this(toArray(numero1,numero2,numero3,numero4,numero5), toArray(estrella1,estrella2));
	}
	
	public Combinacion(String[] numeros, String[] estrellas) throws CombinacionException {
		this(stringToIntArray(numeros), stringToIntArray(estrellas));
	}
	
	public Set<Integer> getConjuntoNumeros() {
		return conjuntoNumeros;
	}


	public Set<Integer> getConjuntoEstrellas() {
		return conjuntoEstrellas;
	}

	public int comprobarCombinacion(Combinacion c) {
		int resultado = -1;
		
		Set<Integer> nTemp = new HashSet<>(this.conjuntoNumeros);
		Set<Integer> sTemp = new HashSet<>(this.conjuntoEstrellas);

		if(c != null) {
			
			nTemp.retainAll(c.conjuntoNumeros);
			sTemp.retainAll(c.conjuntoEstrellas);
			resultado = sTemp.size()+nTemp.size();
		}
		return resultado;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(conjuntoEstrellas, conjuntoNumeros);
	}

	@Override
	public boolean equals(Object obj) {
		return this == obj || obj != null && 
				obj instanceof Combinacion && 
				this.hashCode() == ((Combinacion)obj).hashCode();
	}

	@Override
	public String toString() {
		return String.format("Numeros: %s, estrellas: %s", this.conjuntoNumeros,this.conjuntoEstrellas);
	}

	private static int[] toArray(int...numeros) {
		return numeros;
	}
	
	private static int[] stringToIntArray(String[] datos) {
		int[] numeros = new int[datos.length];
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.valueOf(datos[i]);
		}
		
		return numeros;
	}

	
	
}
