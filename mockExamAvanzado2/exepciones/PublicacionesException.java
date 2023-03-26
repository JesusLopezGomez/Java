package mockExamAvanzado2.exepciones;

public class PublicacionesException extends Exception {

	public PublicacionesException() {
	}

	public PublicacionesException(String message) {
		super(message);
	}

	public PublicacionesException(Throwable cause) {
		super(cause);
	}

	public PublicacionesException(String message, Throwable cause) {
		super(message, cause);
	}

	public PublicacionesException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
