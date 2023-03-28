package mockExamAvanzadoCorregidoEnClase.publicacion;

import mockExamAvanzadoCorregidoEnClase.usuario.Usuario;

public class Recomendacion extends Publicacion {

	private int numEstrellas;
	
	public Recomendacion(String texto, Usuario usuario, int estrellas) throws PublicacionExcepcion {
		super(texto, usuario);
		if(estrellas >= 5 || estrellas <= 1) {
			throw new PublicacionExcepcion("Error, estrellas validas entre 1-5");
		}
		this.numEstrellas = estrellas;
	}

	protected void setTexto(String texto) throws PublicacionExcepcion {
		if(texto.length() >= 200 || texto.length() <= 100 ) {
			throw new PublicacionExcepcion("Error, limite caracteres(100-200), estrellas(1-5)");
		}
		this.texto = texto;
	}

	public String toString() {
		return super.toString().concat("\nNúmero de estrellas: " + this.numEstrellas);
	}
	
}
