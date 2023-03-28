package mockExamAvanzadoCorregidoEnClase;

import mockExamAvanzadoCorregidoEnClase.publicacion.Post;
import mockExamAvanzadoCorregidoEnClase.publicacion.Publicacion;
import mockExamAvanzadoCorregidoEnClase.publicacion.PublicacionExcepcion;
import mockExamAvanzadoCorregidoEnClase.publicacion.Recomendacion;
import mockExamAvanzadoCorregidoEnClase.publicacion.Tweet;
import mockExamAvanzadoCorregidoEnClase.usuario.Usuario;

public class Main {

	public static void main(String[] args){

		try {
			Publicacion twt = new Tweet("Prueba",new Usuario("Lopeeh","gomez"));
			System.out.println(twt);
		} catch (PublicacionExcepcion e) {
			e.printStackTrace();
		}
		
		try {
			Publicacion post = new Post("Prueba",new Usuario("Lopeeh","gomez"),"lol");
			System.out.println(post);
		} catch (PublicacionExcepcion e) {
			e.printStackTrace();
		}
		
	}

}
