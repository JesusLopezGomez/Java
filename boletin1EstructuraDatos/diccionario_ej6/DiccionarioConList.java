package boletin1EstructuraDatos.diccionario_ej6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DiccionarioConList {

	Set<Entrada> diccionario;
	
	public DiccionarioConList() {
		super();
		this.diccionario = new HashSet<>();
	}
	
	public void anniadirPalabraSignificado(String palabra, String significado) {
		boolean significadoAnniadido = false;
		if(palabra != null && significado != null && !palabra.isEmpty() && !significado.isEmpty()) {
			for(Entrada e : this.diccionario) {
				if(e.getPalabra().equals(palabra)) {
					e.anniadirSignificado(significado);
					significadoAnniadido = true;
				}
			}
			if(!significadoAnniadido) {
				this.diccionario.add(new Entrada(palabra,significado));
			}
		}
	}
	
	public String buscarPalabra(String palabra) {
		StringBuilder sb = new StringBuilder();
		if(palabra != null && !palabra.isEmpty()) {
				for(Entrada e : this.diccionario) {
					if(e.getPalabra().equals(palabra)) {
						sb.append(e.getSignificados().toString());
					}
				}
		}
		return sb.toString();
	}
	
	public void borrarPalabra(String palabra) {
		if(palabra != null && !palabra.isEmpty()) {
			Iterator<Entrada> it = this.diccionario.iterator();
			Entrada e = null;
			while(it.hasNext()) {
				e = it.next();
				if(e.getPalabra().equals(palabra)) {
					it.remove();
				}
			}
		}
	}
	
	public List<String> listarPalabras(String comienzo) {
		List<String> palabras = new ArrayList<>();
		if(comienzo != null && !comienzo.isEmpty()) {
	        for(Entrada e : this.diccionario) {
	            if(e.getPalabra().startsWith(comienzo)) {
	               palabras.add(e.getPalabra());
	            }
	        }
		}
		Collections.sort(palabras);
        return palabras;
    }

}
