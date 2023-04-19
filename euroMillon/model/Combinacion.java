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
		super();
		this.conjuntoEstrellas = new TreeSet<>();
		this.conjuntoNumeros = new TreeSet<>();
		this.conjuntoEstrellas.add(estrella1);
		this.conjuntoEstrellas.add(estrella2);
		this.conjuntoNumeros.add(numero1);
		this.conjuntoNumeros.add(numero2);
		this.conjuntoNumeros.add(numero3);
		this.conjuntoNumeros.add(numero4);
		this.conjuntoNumeros.add(numero5);
		//Comprobacion de fuera de rango numero
		for(Integer n : conjuntoNumeros) {
			if(n > VALOR_MAXIMO_NUMEROS || n < VALOR_MINIMO) {
				throw new CombinacionException("Error has introducido numero fuera de rango(1-50).");
			}
		}
		//Comprobacion de fuera de rango estrellas
		for(Integer n : conjuntoEstrellas) {
			if(n > VALOR_MAIXIMO_ESTRELLAS || n < VALOR_MINIMO) {
				throw new CombinacionException("Error has introducido estrella fuera de rango(1-12).");
			}
		}
		
		//Comprobacion de no iguales numeros con estrellas
		for(Integer n :  this.conjuntoEstrellas) {
			if(this.conjuntoNumeros.contains(n)) {
				throw new CombinacionException("Error no se pueden repetir números que ya entre estrellas y numeros.");
			}
		}
		
		//Comprobacion de estrellas repetidas
		if(this.conjuntoEstrellas.size() != TOTAL_ESTRELLAS) {
			throw new CombinacionException("Error has introducido estrellas repetidas.");
		//Comprobacion de numeros repetidas
		}if(this.conjuntoNumeros.size() != TOTAL_NUMEROS) {
			throw new CombinacionException("Error has introducido numeros repetidos.");
		}
		
	}
	
	public Combinacion(Set<Integer> conjuntoNumeros, Set<Integer> conjuntoEstrellas) throws CombinacionException {
		super();
		this.conjuntoNumeros = conjuntoNumeros;
		this.conjuntoEstrellas = conjuntoEstrellas;
		if(this.conjuntoEstrellas.size() != TOTAL_ESTRELLAS) {
			throw new CombinacionException("Error has introducido estrellas repetidas.");
		}if(this.conjuntoNumeros.size() != TOTAL_NUMEROS) {
			throw new CombinacionException("Error has introducido numeros repetidos.");
		}
	}
	
	public Set<Integer> getNumeros() {
		return this.conjuntoNumeros;
	}
	
	public Set<Integer> getEstrellas() {
		return this.conjuntoEstrellas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conjuntoEstrellas, conjuntoNumeros);
	}

	@Override
	public boolean equals(Object obj) {
		boolean resultado = false;
		if (this == obj) {
			Combinacion other = (Combinacion) obj;
			resultado = this.hashCode() == other.hashCode();
		}

		return resultado;
	}

	@Override
	public String toString() {
		return String.format("Combinación numeros %s y estrellas %s",this.conjuntoNumeros,this.conjuntoEstrellas);
	}
	
	
	
	
	
}
