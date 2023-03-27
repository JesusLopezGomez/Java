package mockExamAvanzado2.model;

import mockExamAvanzado2.enumerados.Valoraciones;
import mockExamAvanzado2.exepciones.PublicacionesException;

public class Tweet extends Publicacion {

	public Tweet(String texto, Usuario usuario) throws PublicacionesException{
		super(texto,usuario);
	}
	
	public boolean valorar(Valoraciones valoracion) {
		this.valoracion = valoracion.getValoracion()*2;
		return true;
	}
	
	@Override
	public String toString() {
		return String.format("Publicación: %s\r\n"
				+ "Realizada por: %s\r\n"
				+ "Valoración: %s\r\n"
				+ "Fecha de publicación: %s", this.texto,getLoginUsuario(),getValoracion(),getFechaCreacion());
	}

	@Override
	protected void setTexto(String texto) throws PublicacionesException {
		if(texto.length() >= 50 && texto != null) {
			throw new PublicacionesException("Mucho texto tiene que ser menor que 50");
		}
		this.texto = texto;
	}

}
