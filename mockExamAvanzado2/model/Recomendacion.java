package mockExamAvanzado2.model;

import mockExamAvanzado2.exepciones.PublicacionesException;

public class Recomendacion extends Publicacion {

	private int numEstrellas;
	
	public Recomendacion(String texto, Usuario usuario, int estrellas) throws PublicacionesException {
		super(texto, usuario);
		this.numEstrellas = estrellas;
	}

	@Override
	protected void setTexto(String texto) throws PublicacionesException {
		if(texto.length() >= 200 && texto.length() <= 100 && this.numEstrellas >= 5 && this.numEstrellas <= 1) {
			throw new PublicacionesException("Error, limite caracteres(100-200), estrellas(1-5)");
		}
		this.texto = texto;
	}
	
	public int getNumeroDeEstrellas(){
		return this.numEstrellas;
	}
	
	public String toString() {
		return String.format("Publicación: %s\r\n"
				+ "Realizada por: %s\r\n"
				+ "Valoración: %s\r\n"
				+ "Fecha de publicación: %s\n"
				+ "Número de estrellas: %s", this.texto,getLoginUsuario(),getValoracion(),getFechaCreacion(),getNumeroDeEstrellas());
	}
	

}
