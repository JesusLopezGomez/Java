package ejerciciosBuenosColecciones.chatInstituto2.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mensaje implements Comparable<Mensaje>{

	
	private static int secuencia = 1;
	private Persona emisor;
	private Persona destinatario;
	private String texto;
	private LocalDateTime fecha;
	private int codigoMensaje;
	
	
	public Mensaje(String texto, Persona emisor, Persona destinatario) {
		super();
		this.codigoMensaje = secuencia++;
		this.emisor = emisor;
		this.destinatario = destinatario;
		this.texto = texto;
		this.fecha = LocalDateTime.now();
	}


	@Override
	public String toString() {
		return String.format("Mensaje %s: De: %s Texto: %s Fecha y hora: %s"
				, this.codigoMensaje,this.emisor,this.texto,this.fecha.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")));
	}


	public boolean contieneTexto(String texto) {
		return this.texto.contains(texto);
	}
	
	@Override
	public int compareTo(Mensaje o) {
		return this.codigoMensaje - o.codigoMensaje;
	}
	
	public Persona getEmisor() {
		return this.emisor;
	}
	
	public int getId() {
		return this.codigoMensaje;
	}
	

}
