package boletin1EstructuraDatos.chatInstituto_ej5.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Persona {

	protected String nombre;
	protected int edad;
	protected List<Mensaje> listaMensajes;;
	
	protected Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.listaMensajes = new ArrayList<>();
	}
	
	
	public abstract void enviarMensaje(Persona destinatario,String mensaje) throws ExceptionsPersona;
	
	public abstract String leerMensajesBuzon() throws ExceptionsPersona;

	public abstract String leerMensajesBuzonOrdenadorAlfabeticamente() throws ExceptionsPersona;
	
	public abstract void borrarMensajeBuzon(int numMensaje);
	
	public abstract String encontrarMensajeContieneFrase(String frase);
	
	public abstract void recibirMensaje(Mensaje mensaje);
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}

	
}
