package ejerciciosBuenosColecciones.chatInstituto2.model;

public class Profesor extends Persona {

	public Profesor(String nombre, int edad) {
		super(nombre, edad);
	}

	@Override
	public void enviarMensaje(Persona destinatario, String texto) throws PersonaException {
		destinatario.recibirMensaje(new Mensaje(texto,this,destinatario));
	}



}
