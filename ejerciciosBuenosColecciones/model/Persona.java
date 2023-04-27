package ejerciciosBuenosColecciones.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class Persona implements Comparable<Persona>{

	private String nombre;
	private int edad;
	private List<Mensaje> buzon;
	
	public Persona(String nombre, int edad) {
		super();
		this.buzon = new ArrayList<>();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	private int getEdad() {
		return this.edad;
	}
	
	protected boolean esMayorDeEdad() {
		return getEdad() >= 18;
	}
	
	public String leerBuzon() {
		Collections.sort(this.buzon);
		return imprimirBuzon(this.buzon);
	}
	
	public String leerBuzonAlfabeticamenteNombreRemitente() {
		Collections.sort(this.buzon, new MensajeRemitenteComparator());
		return imprimirBuzon(this.buzon);
	}

	
	private String imprimirBuzon(Collection<Mensaje> imprimir) {
		StringBuilder sb = new StringBuilder();
		for(Mensaje m : imprimir) {
			sb.append(m).append(System.lineSeparator());
		}
		return sb.toString();
	}
	
	public String buscarMensajeConFrase(String frase) {
		List<Mensaje> encontrados = new ArrayList<>();
		for(Mensaje m : this.buzon) {
			if(m.contieneTexto(frase)) {
				encontrados.add(m);
			}
		}
		return imprimirBuzon(encontrados);
	}
	
	public void enviarMensaje(Persona destinatario, String mensaje) throws PersonaExceptions {
		destinatario.recibirMensaje(new Mensaje(this,destinatario,mensaje,LocalDateTime.now()));
	}
	
	abstract public void enviarMensaje(Persona destinatario, Mensaje mensaje) throws PersonaExceptions;
	
	public void borrarMensaje(String numeroMensaje) throws PersonaExceptions{
		Iterator<Mensaje> it = this.buzon.iterator();
		
		Mensaje m = null;
		
		while(it.hasNext()) {
			m = it.next();
			if(m.getId().equals(numeroMensaje)) {
				it.remove();
			}
		}	
	}

	public void recibirMensaje(Mensaje mensaje) {
		this.buzon.add(mensaje);
	}
	
	public String toString() {
		return this.nombre;
	}
	
	@Override
	public int compareTo(Persona p) {
		return this.nombre.compareTo(p.nombre);
	}
	

}
