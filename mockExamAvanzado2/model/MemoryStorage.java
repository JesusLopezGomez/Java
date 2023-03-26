package mockExamAvanzado2.model;

import mockExamAvanzado.Excepciones.MemoryStorageException;
import mockExamAvanzado2.exepciones.PublicacionesException;

public class MemoryStorage {

	private static final int NUM_MAXIMO_USUARIOS = 15;
	private static final int NUM_MAXIMO_PUBLICACIONES = 50;
	
	private Usuario[] usuarios = new Usuario[NUM_MAXIMO_USUARIOS];
	private Publicacion[] publicaciones = new Publicacion[NUM_MAXIMO_PUBLICACIONES];
	
	private int numUsuariosActuales;
	private int numPublicacionesActuales;
	
	public MemoryStorage() {
	
	}
	
	private int posicionUsuario(String login) {
		int posicion = -1;
		for(int i = 0; i < NUM_MAXIMO_USUARIOS; i++) {
			if(this.usuarios[i] != null && this.usuarios[i].getLogin().equals(login)) {
				posicion = i;
			}
		}
		return posicion;
	}
	
	public void addUsuario(String login,String pass) throws MemoryStorageException {
		if(this.numUsuariosActuales == NUM_MAXIMO_USUARIOS) {
			throw new MemoryStorageException("Error no hay espacio para el usuario");
		}
		this.usuarios[numUsuariosActuales++]= new Usuario(login,pass);
	}
	
	public void addPublicaion(String texto, String login) throws PublicacionesException {
		if(texto.length() > 50) {
			throw new PublicacionesException("Error has sobrepasado, el máximo de caracteres(50).");
		}
		if(this.numPublicacionesActuales == NUM_MAXIMO_PUBLICACIONES) {
			if(posicionUsuario(login)!= -1) {
				this.publicaciones[0] = new Tweet(texto,this.usuarios[posicionUsuario(login)]);
			}
		}else {
			if(posicionUsuario(login)!= -1) {
				this.publicaciones[this.numPublicacionesActuales++] = new Tweet(texto,this.usuarios[posicionUsuario(login)]);
			}
		}
	}
	
	public void addPublicacion(String texto,String login,String tema) throws PublicacionesException {
		if(texto.equals("")) {
			throw new PublicacionesException("Error, no se puede dejar en blanco.");
		}
		if(this.numPublicacionesActuales == NUM_MAXIMO_PUBLICACIONES) {
			if(posicionUsuario(login)!= -1) {
				this.publicaciones[0] = new Post(texto,this.usuarios[posicionUsuario(login)],tema);
			}
		}else {
			if(posicionUsuario(login)!= -1) {
				this.publicaciones[this.numPublicacionesActuales++] = new Post(texto,this.usuarios[posicionUsuario(login)],tema);
			}
		}
	}
	
	public void addPublicaion(String texto, String login,int estrellas) throws PublicacionesException {
		if(texto.length() >= 200 && texto.length() <= 100 && estrellas >= 5 && estrellas <= 1) {
			throw new PublicacionesException("Error, limite caracteres(100-200), estrellas(1-5)");
		}
		if(this.numPublicacionesActuales == NUM_MAXIMO_PUBLICACIONES) {
			if(posicionUsuario(login)!= -1) {
				this.publicaciones[0] = new Recomendacion(texto,this.usuarios[posicionUsuario(login)],estrellas);
			}
		}else {
			if(posicionUsuario(login)!= -1) {
				this.publicaciones[this.numPublicacionesActuales++] = new Recomendacion(texto,this.usuarios[posicionUsuario(login)],estrellas);
			}
		}
	}
	
	public String mostrarListaPublicaciones() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < NUM_MAXIMO_PUBLICACIONES; i++) {
			if(this.publicaciones[i] != null) {
				sb.append(this.publicaciones[i]).append("\n");
			}
		}
		return sb.toString();
	}
	
	public String mostrarTweets() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < NUM_MAXIMO_PUBLICACIONES; i++) {
			if(this.publicaciones[i] != null && this.publicaciones[i] instanceof Tweet) {
				sb.append(this.publicaciones[i]).append("\n");
			}
		}
		return sb.toString();
	}
	
	public String mostrarPosts() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < NUM_MAXIMO_PUBLICACIONES; i++) {
			if(this.publicaciones[i] != null && this.publicaciones[i] instanceof Post) {
				sb.append(this.publicaciones[i]).append("\n");
			}
		}
		return sb.toString();
	}
	
	public String mostrarRecomendacion() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < NUM_MAXIMO_PUBLICACIONES; i++) {
			if(this.publicaciones[i] != null && this.publicaciones[i] instanceof Recomendacion) {
				sb.append(this.publicaciones[i]).append("\n");
			}
		}
		return sb.toString();
	}

}
