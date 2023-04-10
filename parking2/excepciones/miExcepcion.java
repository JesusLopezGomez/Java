package parking2.excepciones;

public class miExcepcion extends Exception {

	public miExcepcion() {
	}

	public miExcepcion(String message) {
		super(message);
	}

	public miExcepcion(Throwable cause) {
		super(cause);
	}

	public miExcepcion(String message, Throwable cause) {
		super(message, cause);
	}

	public miExcepcion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
