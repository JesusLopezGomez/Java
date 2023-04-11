package mockExamAvanzado.Excepciones;

public class PublicacionExeception extends Exception {

	public PublicacionExeception() {
	}

	public PublicacionExeception(String message) {
		super(message);
	}

	public PublicacionExeception(Throwable cause) {
		super(cause);
	}

	public PublicacionExeception(String message, Throwable cause) {
		super(message, cause);
	}

	public PublicacionExeception(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
