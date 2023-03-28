package mockExamAvanzadoCorregidoEnClase.publicacion;

import mockExamAvanzadoCorregidoEnClase.usuario.Usuario;

public class Post extends Publicacion {

	private int numLecturas;
	private String tema;
	
	public Post(String texto,Usuario usuario, String tema) throws PublicacionExcepcion {
		super(texto,usuario);
		this.tema = tema;
	}
	
	@Override
	protected void setTexto(String texto) throws PublicacionExcepcion {
		if(texto == null || texto.isBlank()) {
			throw new PublicacionExcepcion("El texto no es valido, está vacío.");
		}
		
		this.texto = texto;
	}

	@Override
	public boolean valorar(String valoracion) {
		this.numLecturas ++;
		super.valorar(valoracion);
		return super.valorar(valoracion);
	}

	
	
}
