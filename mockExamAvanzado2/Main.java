package mockExamAvanzado2;

import mockExamAvanzado.Excepciones.MemoryStorageException;
import mockExamAvanzado2.enumerados.Valoraciones;
import mockExamAvanzado2.exepciones.PublicacionesException;
import mockExamAvanzado2.model.MemoryStorage;
import mockExamAvanzado2.model.Publicacion;
import mockExamAvanzado2.model.Recomendacion;
import mockExamAvanzado2.model.Tweet;
import mockExamAvanzado2.model.Usuario;

public class Main {

	public static void main(String[] args) throws MemoryStorageException, PublicacionesException {
		System.out.println(Valoraciones.BUENA.getValoracion());
		Publicacion p = new Recomendacion("holaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",new Usuario("lopeeh","gomez"),4);
		p.valorar("buena");
		System.out.println(p);
		Usuario u = new Usuario("Lopeeh","gomez");
		Publicacion p1 = new Tweet("Locotrones asdadsadadasa",u);
		p1.valorar("MUYBUENA");
		System.out.println(p1.getValoracion());
		MemoryStorage m = new MemoryStorage();
		m.addUsuario("Lopeeh", "gomez");
		m.addPublicaion("Locotrones asdadsadadasa", "Lopeeh");
		System.out.println(m.mostrarTweets());
		System.out.println(m.mostrarPosts());
		
	}

}
