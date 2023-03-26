package mockExamAvanzado2.model;

public class Recomendacion extends Publicacion {

	private int numEstrellas;
	
	public Recomendacion(String texto, Usuario usuario, int estrellas) {
		super(texto, usuario);
		this.numEstrellas = estrellas;
	}
	

}
