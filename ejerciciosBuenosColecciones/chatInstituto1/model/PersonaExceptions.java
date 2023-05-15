package ejerciciosBuenosColecciones.chatInstituto1.model;

public class PersonaExceptions extends Exception {

	public PersonaExceptions() {
	}

	public PersonaExceptions(String message) {
		super(message);
	}

	public PersonaExceptions(Throwable cause) {
		super(cause);
	}

	public PersonaExceptions(String message, Throwable cause) {
		super(message, cause);
	}

	public PersonaExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
