package mockExamAvanzado.model;

public class Tweet extends Publicacion {

	public Tweet(String texto, Usuario usuario) {
		super(texto, usuario);
	}
	
	@Override
	public String toString() {
		return "Publicación: " + this.texto + "\n" + "Realizada por: " + getLoginUsuario()
		+ "\n" + "Valoración: " + this.valoracion*2 + "\n" + "Fecha publicación: " + getFechaCreacion();
	}
	
	
	
}
