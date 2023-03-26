package mockExamAvanzado2.model;

import mockExamAvanzado2.enumerados.Valoraciones;

public class Post extends Publicacion {

	private int numeroLecturas;
	private String tema;
	
	public Post(String texto, Usuario usuario, String tema) {
		super(texto, usuario);
		this.tema = tema;
	}
	
	public boolean valorar(Valoraciones valoracion) {
		this.valoracion = valoracion.getValoracion()*2;
		this.numeroLecturas ++;
		return true;
	}
	
	public int getNumeroLecturas(){
		return this.numeroLecturas;
	}

}
