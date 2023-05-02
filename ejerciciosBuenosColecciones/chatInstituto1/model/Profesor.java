package ejerciciosBuenosColecciones.chatInstituto1.model;

public class Profesor extends Persona {

	public Profesor(String nombre, int edad) {
		super(nombre, edad);
	}

	@Override
	public void enviarMensaje(Persona destinatario, Mensaje mensaje) throws PersonaExceptions {
		destinatario.recibirMensaje(mensaje);
	}

}
