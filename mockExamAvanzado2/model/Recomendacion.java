package mockExamAvanzado2.model;

import mockExamAvanzado2.exepciones.PublicacionesException;

public class Recomendacion extends Publicacion {

	private int numEstrellas;
	
	public Recomendacion(String texto, Usuario usuario, int estrellas) throws PublicacionesException {
		super(texto, usuario);
		if(estrellas >= 5 || estrellas <= 1) {
			throw new PublicacionesException("Error estrellas no válidas, tiene que ser entre 1 y 5");
		}
		this.numEstrellas = estrellas;
	}

	@Override
	protected void setTexto(String texto) throws PublicacionesException {
		if(texto.length() >= 200 || texto.length() <= 100) {
			throw new PublicacionesException("Error, limite caracteres(100-200)");
		}
		this.texto = texto;
	}
	
	public int getNumeroDeEstrellas(){
		return this.numEstrellas;
	}
	
	public String toString() {
		return super.toString().concat("\nNúmero de estrellas: " + this.numEstrellas);
	}
	

}
