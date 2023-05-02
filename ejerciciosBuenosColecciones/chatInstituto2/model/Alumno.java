package ejerciciosBuenosColecciones.chatInstituto2.model;

public class Alumno extends Persona {

	public Alumno(String nombre, int edad) {
		super(nombre, edad);
	}

	@Override
	public void enviarMensaje(Persona destinatario, String texto) throws PersonaException {
		if(!this.esMayorEdad() && destinatario instanceof Alumno) {
			throw new PersonaException("Error un alumno menor de edad no puede enviar mensajes a otro alumno");
		}
		destinatario.recibirMensaje(new Mensaje(texto,this,destinatario));
	}

}
