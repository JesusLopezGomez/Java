package mockExamAvanzado.model;

public class Recomendacion extends Publicacion {

	private int numDeEstrella;
	
	public Recomendacion(String texto, Usuario usuario,int numEstrella) {
		super(texto, usuario);
		this.numDeEstrella = numEstrella;
	}
	
	public int getNumeroDeEstrellas() {
		return this.numDeEstrella;
	}
	
	@Override
	public String toString() {
		return "Publicación: " + this.texto + "\n" + "Realizada por: " + getLoginUsuario()
		+ "\n" + "Valoración: " + this.valoracion + "\n" + "Fecha publicación: " + getFechaCreacion()
		+ "\n" + "Numero de estrellas: " + this.numDeEstrella;
	}

}
