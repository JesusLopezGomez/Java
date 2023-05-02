package ejerciciosBuenosColecciones.chatInstituto2.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class Persona implements Comparable<Persona>{

	private static final int MAYORIA_EDAD = 18;
	private int edad;
	private String nombre;
	private List<Mensaje> buzon;
	
	public Persona(String nombre, int edad) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.buzon = new ArrayList<>();
	}
	
	public boolean esMayorEdad() {
		return this.edad >= MAYORIA_EDAD;
	}
	
	public abstract void enviarMensaje(Persona destinatario, String texto) throws PersonaException;
	
	public void recibirMensaje(Mensaje m) {
		if(m != null) {
			this.buzon.add(m);
		}
	}
	
	public String leerBuzon() throws PersonaException {
		if(this.buzon.isEmpty()) {
			throw new PersonaException("No hay mensajes en el buzon.");
		}
		Collections.sort(this.buzon);
		return imprimirBuzon(this.buzon);
	}
	
	public String leerBuzonAlfabeticamente() throws PersonaException{
		if(this.buzon.isEmpty()) {
			throw new PersonaException("No hay mensajes en el buzon.");
		}
		Collections.sort(this.buzon, new MensajesEmisorAlfabeticamenteComparator());
		return imprimirBuzon(this.buzon);
	}

	private String imprimirBuzon(Collection<Mensaje> buzon) {
		StringBuilder sb = new StringBuilder();
		
		for(Mensaje m :  buzon) {
			sb.append(m).append(System.lineSeparator());
		}
		
		return sb.toString();
	}
	
	public void borrarMensaje(int numeroMensaje) throws PersonaException {
		Iterator<Mensaje> it = this.buzon.iterator();
		
		boolean borrado = false;
		
		while(it.hasNext()) {
			if(it.next().getId() == numeroMensaje) {
				it.remove();
				borrado = true;
			}
		}
		
		if(!borrado){
			throw new PersonaException("Error ese número de mensaje no existe en el buzón.");
		}
	}
	
	public String mensajesContienen(String frase) {
		List<Mensaje> listaMensajeC = new ArrayList<>();
		if(frase != null) {
			for(Mensaje m : this.buzon) {
				if(m.contieneTexto(frase)) {
					listaMensajeC.add(m);
				}
			}
		}
		
		return imprimirBuzon(listaMensajeC);
	}

	@Override
	public String toString() {
		return nombre;
	}
	
	public int compareTo(Persona p) {
		return this.nombre.compareTo(p.nombre);
	}
	
	

}
