package ficheros.model;

import java.io.File;
import java.time.LocalDateTime;

public class Fichero {

	private String nombre;
	private String ruta;
	private long tamannio;
	private String permisos;
	private boolean esDirectorio;
	private String ficheroHijos;
	private String directoriosHijos;
	private File file;
	
	
	public Fichero(String rutaAbsoluta) {
		file = new File(rutaAbsoluta);
		this.ficheroHijos = "0";
		this.directoriosHijos = "0";

		if(this.file.exists()) {
			this.ruta = file.getPath();
			this.nombre = file.getName();
			this.tamannio = file.getUsableSpace();
			this.permisos = this.file.canRead() ? "con permisos de escritura" : "";
			this.esDirectorio = file.isDirectory();
		}else {
			file.mkdir();
			this.ruta = file.getPath();
			this.nombre = file.getName();
			this.tamannio = file.getUsableSpace();
			this.permisos = this.file.canRead() ? "con permisos de escritura" : "";
			this.esDirectorio = file.isDirectory();
		}

		if(this.file.listFiles() != null) {
			for(File hijos : this.file.listFiles()){
				if(hijos.isDirectory()) {
					this.directoriosHijos += hijos.toString() + " ";
				}else {
					this.ficheroHijos += hijos.toString() + " ";
				}
			}
		}
		
	}


	@Override
	public String toString() {
		return String.format("Ruta %s, nombre %s, tamaño %s, permisos %s, es directorio %s, "
				+ "directorios hijos %s, ficheros hijos %s "
				, this.ruta,this.nombre,this.tamannio,this.permisos,this.esDirectorio,this.directoriosHijos,this.ficheroHijos);
	}
	
	

}
