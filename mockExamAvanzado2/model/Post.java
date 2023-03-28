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
	
	public boolean valorar(String valoracion) {
		boolean resultado = false;
		try {
			Valoraciones v = Valoraciones.valueOf(valoracion.toUpperCase());
			this.valoracion+=v.getValoracion() * 2;
			resultado = true;
		}catch(Exception e) {
			
		}
		return resultado;
	}
	
	public int getNumeroLecturas(){
		return this.numeroLecturas;
	}

	@Override
	protected void setTexto(String texto) throws PublicacionesException {
		if(texto.isBlank()) {
			throw new PublicacionesException("El texto no puede estar en blanco");
		}
		this.texto = texto;
	}
	
	@Override
	public String toString() {
		return super.toString().concat("\nTema: " + this.tema);
	}

}
