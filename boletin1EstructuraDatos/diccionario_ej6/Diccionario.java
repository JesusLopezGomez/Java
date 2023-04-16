package boletin1EstructuraDatos.diccionario_ej6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Diccionario {

	private Map<String,Collection<String>> diccionario;
	
	public Diccionario() {
		super();
		this.diccionario = new HashMap<>();
	}
	
	public void anniadirPalabraSignificado(String palabra, String significado) {
		if(this.diccionario.containsKey(palabra)) {
			this.diccionario.get(palabra).add(significado);
		}else {
			this.diccionario.put(palabra, new HashSet<String>());
			this.diccionario.get(palabra).add(significado);
		}
		
	}
	
	public String buscarPalabra(String palabra) {
		return palabra!=null && this.diccionario.containsKey(palabra)?this.diccionario.get(palabra).toString():null;
	}
	
	public void borrarPalabra(String palabra) {
		this.diccionario.remove(palabra);
	}
	
	public String listarPalabras(String comienzo) {
        StringBuilder sb = new StringBuilder();

        for (String key : this.diccionario.keySet()) {
            if(key.toLowerCase().startsWith(comienzo.toLowerCase())) {
                sb.append(key + "\n");
            }
        }
        return sb.toString();
    }

	

}
