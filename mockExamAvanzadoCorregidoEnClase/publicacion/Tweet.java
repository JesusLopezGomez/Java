package mockExamAvanzadoCorregidoEnClase.publicacion;

import mockExamAvanzado2.exepciones.PublicacionesException;
import mockExamAvanzadoCorregidoEnClase.usuario.Usuario;

public class Tweet extends Publicacion {

	public Tweet(String texto, Usuario usuario) throws PublicacionExcepcion {
		super(texto,usuario);
	}

	@Override
	protected void setTexto(String texto) throws PublicacionExcepcion {
		if(texto.length() >= 50 && texto != null) {
			throw new PublicacionExcepcion("Mucho texto tiene que ser menor que 50");
		}
		this.texto = texto;
	}

	@Override
	public boolean valorar(String valoracion) {
		super.valorar(valoracion);
		return super.valorar(valoracion);
	}
	
	
}
