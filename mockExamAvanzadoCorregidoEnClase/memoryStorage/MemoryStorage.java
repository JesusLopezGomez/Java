package mockExamAvanzadoCorregidoEnClase.memoryStorage;

import mockExamAvanzadoCorregidoEnClase.publicacion.Publicacion;
import mockExamAvanzadoCorregidoEnClase.publicacion.PublicacionExcepcion;
import mockExamAvanzadoCorregidoEnClase.publicacion.Tweet;
import mockExamAvanzadoCorregidoEnClase.usuario.Usuario;

public class MemoryStorage {

	private static final int NUM_MAXIMO_USUARIOS 			= 15;
	private static final int NUM_MAXIMO_PUBLICACIONES 		= 50;

	private int numUsuariosActuales = 0;
	private int numPublicacionesActuales;

	private Usuario[] usuarios;	
	private Publicacion[] publicaciones;
	
	public MemoryStorage() {
		super();
		usuarios = new Usuario[NUM_MAXIMO_USUARIOS];
		publicaciones = new Publicacion[NUM_MAXIMO_PUBLICACIONES];
	}
	
	private int posicionUsuario(String login) {
		int posicion = -1;
		
		for(int i = 0; i < usuarios.length && posicion == -1; i ++) {
			if(this.usuarios[i] != null && this.usuarios[i].getLogin().equals(login)) {
				posicion = i;
			}
		}
		
		return posicion;
	}
	
	public void addUsuario(String login, String pass) {
		int posicion = posicionUsuario(login);
		if(posicion == -1) {
			this.usuarios[this.numUsuariosActuales++%NUM_MAXIMO_USUARIOS] = new Usuario(login,pass);
		}
	}
	
	public void addPublicacion(String texto, String login) throws PublicacionExcepcion {
		int posicion = posicionUsuario(login);
		if(posicion != -1) {
			this.publicaciones[this.numPublicacionesActuales++%NUM_MAXIMO_PUBLICACIONES] = 
					new Tweet(texto, this.usuarios[posicion]);
		}
	}
	
	public void addPublicacion(String texto, String login,String tema) {
		
	}
	
	public void addPublicacion(String texto, String login, int estrellas) {
		
	}
	
	public String mostrarListaPublicaciones() {
		return "";
	}
	
	public String mostrarTweets() {
		return "";
	}
	
	public String mostrarPoot() {
		return "";
	}
	
	public String mostrarRecomendaciones() {
		return "";
	}

}
