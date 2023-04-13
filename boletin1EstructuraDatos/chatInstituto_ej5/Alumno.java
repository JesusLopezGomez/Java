package boletin1EstructuraDatos.chatInstituto_ej5;

public class Alumno extends Persona {

	public Alumno(String nombre, int edad) {
		super(nombre, edad);
	}

	@Override
	public void enviarMensaje(Persona destinatario, String mensaje) {

	}

	@Override
	public String leerMensajesBuzon() throws ExceptionsPersona {
		return null;
	}

	@Override
	public String leerMensajesBuzonOrdenadorAlfabeticamente() throws ExceptionsPersona {
		return null;
	}

	@Override
	public void borrarMensajeBuzon(int numMensaje) {

	}

	@Override
	public String encontrarMensajeContieneFrase(String frase) {
		return null;
	}

	@Override
	public void recibirMensaje(Mensaje mensaje) {

	}

}
