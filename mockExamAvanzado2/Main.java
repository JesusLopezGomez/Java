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
		Publicacion p = new Publicacion("hola",new Usuario("lopeeh","gomez"));
		System.out.println(p);
		Usuario u = new Usuario("Lopeeh","gomez");
		MemoryStorage m = new MemoryStorage();
		m.addUsuario("Lopeeh", "gomez");
		m.addPublicaion("Locotrones", "Lopeeh");
	}

}
