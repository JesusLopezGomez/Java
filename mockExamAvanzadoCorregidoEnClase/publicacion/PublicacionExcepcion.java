package mockExamAvanzadoCorregidoEnClase.publicacion;

public class PublicacionExcepcion extends Exception {

	public PublicacionExcepcion() {
	}

	public PublicacionExcepcion(String message) {
		super(message);
	}

	public PublicacionExcepcion(Throwable cause) {
		super(cause);
	}

	public PublicacionExcepcion(String message, Throwable cause) {
		super(message, cause);
	}

	public PublicacionExcepcion(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
