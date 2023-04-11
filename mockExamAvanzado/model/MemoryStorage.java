package mockExamAvanzado.model;

import java.util.Arrays;

import mockExamAvanzado.Excepciones.MemoryStorageException;

public class MemoryStorage {

	private static final int NUM_MAXIMO_USUARIOS = 15;
	private static final int NUM_MAXIMO_PUBLICACIONES = 50;
	
	private int numUsuarioActuales;
	private int numPublicacionesActuales;
	private Usuario[] usuarios = new Usuario[NUM_MAXIMO_USUARIOS];
	private Publicacion[] publicaciones = new Publicacion[NUM_MAXIMO_PUBLICACIONES];
	
	public MemoryStorage() {
	}
	
	private int posicionUsuario(String login) {
		int posicion = 0;
		for(int i = 0; i < NUM_MAXIMO_USUARIOS; i++) {
			if(this.usuarios[i].getLogin().equals(login)) {
				posicion = i;
			}
		}
		return posicion;
	}
	
	public void addUsuario(String login, String pass) throws MemoryStorageException {
		if(NUM_MAXIMO_USUARIOS == this.numUsuarioActuales) {
			throw new MemoryStorageException("Error, no hay espacio"); 
		}
		this.usuarios[this.numUsuarioActuales++] = new Usuario(login,pass);
	}
	
	public void addPublicacion(String texto, String login) throws MemoryStorageException {
		boolean seEncuentra = false;
		Usuario usuario = encontrarUsuario(login);
		if(usuario != null) {
			seEncuentra = true;
		}
		
		if(NUM_MAXIMO_PUBLICACIONES == this.numPublicacionesActuales && seEncuentra) {
			this.publicaciones[0] = new Tweet(texto,usuario); 			
		}else if(seEncuentra) {
			this.publicaciones[this.numPublicacionesActuales++] = new Tweet (texto,usuario);
		}
	}

	public void addPublicacion(String texto, String login, String tema) throws MemoryStorageException {
		boolean seEncuentra = false;
		Usuario usuario = encontrarUsuario(login);
		if(usuario != null) {
			seEncuentra = true;
		}
		
		if(NUM_MAXIMO_PUBLICACIONES == this.numPublicacionesActuales && seEncuentra) {
			this.publicaciones[0] = new Post(texto,usuario,tema); 			
		}
		this.publicaciones[this.numPublicacionesActuales++] = new Post (texto,usuario,tema);
	}
	
	public void addPublicacion(String texto, String login, int numEstrella) throws MemoryStorageException {
		boolean seEncuentra = false;
		Usuario usuario = encontrarUsuario(login);
		if(usuario != null) {
			seEncuentra = true;
		}
		
		if(NUM_MAXIMO_PUBLICACIONES == this.numPublicacionesActuales && seEncuentra) {
			this.publicaciones[0] = new Recomendacion(texto,usuario,numEstrella); 			
		}
		this.publicaciones[this.numPublicacionesActuales++] = new Recomendacion (texto,usuario,numEstrella);
	}
	
	public String mostrarListaPublicaciones() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < NUM_MAXIMO_PUBLICACIONES; i++) {
			if(this.publicaciones[i] != null && (this.publicaciones[i] instanceof Publicacion)) {
				sb.append(this.publicaciones[i]);
			}
		}
		return sb.toString();
	}
	
	public String mostrarTweets() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < NUM_MAXIMO_PUBLICACIONES; i++) {
			if(this.publicaciones[i] != null && (this.publicaciones[i] instanceof Tweet)) {
				sb.append(this.publicaciones[i]);
			}
		}
		return sb.toString();
	}
	
	public String mostrarPosts() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < NUM_MAXIMO_PUBLICACIONES; i++) {
			if(this.publicaciones[i] != null && (this.publicaciones[i] instanceof Post)) {
				sb.append(this.publicaciones[i]);
			}
		}
		return sb.toString();
	}
	
	public String mostrarRecomendacion() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < NUM_MAXIMO_PUBLICACIONES; i++) {
			if(this.publicaciones[i] != null && (this.publicaciones[i] instanceof Recomendacion)) {
				sb.append(this.publicaciones[i]);
			}
		}
		return sb.toString();
	}
	
	private Usuario encontrarUsuario(String login) {
		Usuario usuario = null;
		for(int i = 0; i < NUM_MAXIMO_USUARIOS; i++) {
			if(this.usuarios[i].getLogin().equals(login)) {
				usuario = this.usuarios[i];
			}
		}
		return usuario;
	}
	
	

}
