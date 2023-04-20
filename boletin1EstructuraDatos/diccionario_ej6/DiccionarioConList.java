package boletin1EstructuraDatos.diccionario_ej6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DiccionarioConList {

	List<Entrada> diccionario;
	
	public DiccionarioConList() {
		super();
		this.diccionario = new ArrayList<>();
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
			for(Entrada e : this.diccionario) {
				if(e.getPalabra().equals(palabra)) {
					this.diccionario.remove(e);
				}
			}
		}
	}
	
	public String listarPalabras(String comienzo) {
		StringBuilder sb = new StringBuilder();
		if(comienzo != null && !comienzo.isEmpty()) {
	        for(Entrada e : this.diccionario) {
	            if(e.getPalabra().startsWith(comienzo)) {
	                sb.append(e + "\n");
	            }
	        }
		}
        return sb.toString();
    }

}
