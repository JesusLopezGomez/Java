package mockExamAvanzado.model;

import mockExamAvanzado.enumerados.Valoraciones;

public class Post extends Publicacion {

	private int numeroLecturas = 0;
	private String tema;
	
	public Post(String texto, Usuario usuario,String tema) {
		super(texto, usuario);
		this.tema = tema;
	}

	@Override
	public boolean valorar(String valoracion) {
		boolean resultado = false;
		if(valoracion.toUpperCase().equals(Valoraciones.MUYBUENA.toString())){
			resultado = true;
			this.valoracion += 2;
			this.numeroLecturas ++;
		}else if(valoracion.toUpperCase().equals(Valoraciones.NORMAL.toString())) {
			resultado = true;
			this.valoracion += 1;
			this.numeroLecturas ++;
		}else if( valoracion.toUpperCase().equals(Valoraciones.MUYMALA.toString())) {
			resultado = true;
			this.valoracion -= 2;
			this.numeroLecturas ++;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return "Publicación: " + this.texto + "\n" + "Realizada por: " + getLoginUsuario()
		+ "\n" + "Valoración: " + this.valoracion*2 + "\n" + "Fecha publicación: " + getFechaCreacion();
	}
	
	
	
}
