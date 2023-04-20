package boletin1EstructuraDatos.diccionario_ej6;

import java.util.ArrayList;
import java.util.List;

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
	public String toString() {
		return "Entrada [palabra=" + palabra + ", significados=" + significados + "]";
	}
	
	

}
