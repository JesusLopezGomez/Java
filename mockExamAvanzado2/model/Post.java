package mockExamAvanzado2.model;

import mockExamAvanzado2.enumerados.Valoraciones;
import mockExamAvanzado2.exepciones.PublicacionesException;

public class Post extends Publicacion {

	private int numeroLecturas;
	private String tema;
	
	public Post(String texto, Usuario usuario, String tema) throws PublicacionesException {
		super(texto,usuario);
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

	@Override
	protected void setTexto(String texto) throws PublicacionesException {
		if(texto.isEmpty()) {
			throw new PublicacionesException("El texto no puede estar en blanco");
		}
		this.texto = texto;
	}

}
