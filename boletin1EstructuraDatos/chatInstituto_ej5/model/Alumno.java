package boletin1EstructuraDatos.chatInstituto_ej5.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Alumno extends Persona {

	public Alumno(String nombre, int edad) {
		super(nombre, edad);
	}

	@Override
	public void enviarMensaje(Persona destinatario, String mensaje) throws ExceptionsPersona {
		if(this.edad < 18 && destinatario instanceof Alumno) {
			throw new ExceptionsPersona("Error, alumno menor de edad, solo puede enviar mensaje a profesores.");
		}
		destinatario.listaMensajes.add(new Mensaje(this,mensaje));

	}

	@Override
	public String leerMensajesBuzon() throws ExceptionsPersona {
		if(this.listaMensajes.isEmpty()) {
			throw new ExceptionsPersona("Error no hay mensajes en el buzón");
		}
		return this.listaMensajes.toString();
	}

	@Override
	public String leerMensajesBuzonOrdenadorAlfabeticamente() throws ExceptionsPersona {
		if(this.listaMensajes.isEmpty()) {
			throw new ExceptionsPersona("Error no hay mensajes en el buzón");
		}
		Collections.sort(this.listaMensajes);
		return this.listaMensajes.toString();
	}

	@Override
	public void borrarMensajeBuzon(int numMensaje) {
		Iterator<Mensaje> it = this.listaMensajes.iterator();
		while(it.hasNext()) {
			if(it.next().getCodigo() == numMensaje) {
				it.remove();
			}
		}
	}

	@Override
	public String encontrarMensajeContieneFrase(String frase) {
		Iterator<Mensaje> it = this.listaMensajes.iterator();
		List<Mensaje> listaNuevaMensaje = new ArrayList<>();
		Mensaje m = null;
		while(it.hasNext())
			m = it.next();
			if(m.contieneFraseMensaje(frase)) {
				listaNuevaMensaje.add(m);
			}
		return listaNuevaMensaje.toString();
	}

	@Override
	public void recibirMensaje(Mensaje mensaje) {
		this.listaMensajes.add(mensaje);
	}

}
