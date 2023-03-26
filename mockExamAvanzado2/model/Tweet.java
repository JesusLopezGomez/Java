package mockExamAvanzado2.model;

import mockExamAvanzado2.enumerados.Valoraciones;

public class Tweet extends Publicacion {

	public Tweet(String texto, Usuario usuario){
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

}
