package boletin1EstructuraDatos.diccionario_ej6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import euroMillon.model.Combinacion;

public class Entrada {
	
	private String palabra;
	private List<String> significados;
	
	public Entrada(String palabra, String significado) {
		super();
		this.palabra = palabra;
		this.significados = new ArrayList<>();
		anniadirSignificado(significado);
	}
	
	public String getPalabra() {
		return this.palabra;
	}
	
	public List<String> getSignificados() {
		return this.significados;
	}
	
	public void anniadirSignificado(String significado){
		this.significados.add(significado);
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(palabra);
	}

	@Override
	public boolean equals(Object obj) {
		return this==obj || obj!=null &&
	            obj instanceof Entrada
	            && this.hashCode()==((Entrada)obj).hashCode();
	}

	@Override
	public String toString() {
		return "Entrada [palabra=" + palabra + ", significados=" + significados + "]";
	}
	
	

}
