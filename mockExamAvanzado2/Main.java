package mockExamAvanzado2;

import mockExamAvanzado.Excepciones.MemoryStorageException;
import mockExamAvanzado2.enumerados.Valoraciones;
import mockExamAvanzado2.exepciones.PublicacionesException;
import mockExamAvanzado2.model.MemoryStorage;
import mockExamAvanzado2.model.Publicacion;
import mockExamAvanzado2.model.Tweet;
import mockExamAvanzado2.model.Usuario;

public class Main {

	public static void main(String[] args) throws MemoryStorageException, PublicacionesException {
		System.out.println(Valoraciones.BUENA.getValoracion());
		Publicacion p = new Tweet("hola",new Usuario("lopeeh","gomez"));
		p.valorar(Valoraciones.BUENA);
		System.out.println(p);
		Usuario u = new Usuario("Lopeeh","gomez");
		MemoryStorage m = new MemoryStorage();
		m.addUsuario("Lopeeh", "gomez");
		m.addPublicaion("Locotrones asdadsadadasa", "Lopeeh");
		System.out.println(m.mostrarTweets());
		m.mostrarPosts();
	}

}
