package boletin1EstructuraDatos.diccionario_ej6;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Diccionario {

	private Map<String,Collection<String>> diccionario;
	
	public Diccionario() {
		super();
		this.diccionario = new HashMap<>();
	}
	
	public void anniadirPalabraSignificado(String palabra, String significado) {
		boolean encontrada = false;
		if(!this.diccionario.isEmpty()) {
			for(String k: this.diccionario.keySet()) {
				if(k.equals(palabra)) {
					this.diccionario.get(palabra).add(significado);
					encontrada = true;
				}
			}
		}if(!encontrada){
			this.diccionario.put(palabra, new HashSet<String>());
			this.diccionario.get(palabra).add(significado);
		}
		
	}
	
	public String buscarPalabra(String palabra) {
		String resultado = "-1";
		
		if(this.diccionario.containsKey(palabra)) {
			resultado = this.diccionario.get(palabra).toString();
		}
		
		return resultado;
	}
	
	public void borrarPalabra(String palabra) {
		this.diccionario.remove(palabra);
	}

}
