package ejerciciosBuenosColecciones.model;

import java.time.LocalDateTime;

public class Alumno extends Persona {

	public Alumno(String nombre, int edad) {
		super(nombre, edad);
	}

	@Override
	public void enviarMensaje(Persona destinatario, Mensaje mensaje) throws PersonaExceptions {
		if(esMayorDeEdad() || destinatario instanceof Profesor) {
			destinatario.recibirMensaje(mensaje);
		}else {
			throw new PersonaExceptions("Un alumno menor de edad no puede enviar mensaje a otros alumnos.");
		}
	}
	
	public void enviarMensaje(Persona destinatario, String texto) throws PersonaExceptions {
		enviarMensaje(destinatario,new Mensaje(this,destinatario,texto,LocalDateTime.now()));
	}
		

}
