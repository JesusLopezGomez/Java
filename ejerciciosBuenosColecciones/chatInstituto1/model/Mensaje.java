package ejerciciosBuenosColecciones.chatInstituto1.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mensaje implements Comparable<Mensaje>{

	private Persona emisor;
	private Persona destinatario;
	private String texto;
	private LocalDateTime fechaHora;
	private String id;
	private static int codigoSiguiente = 1;
	
	
	public Mensaje(Persona emisor, Persona destinatario, String texto, LocalDateTime fecha) {
		super();
		this.emisor = emisor;
		this.destinatario = destinatario;
		this.texto = texto;
		this.fechaHora = fecha;
		this.id = ""+codigoSiguiente++;
		
		
	}
	
	public boolean contieneTexto(String texto) {
		return texto != null && texto.isEmpty() && this.texto.contains(texto);
	}
	
	@Override
	public String toString() {
		return String.format("Mensaje %s: De %s Texto: %s Fecha y hora: %s",
				this.id, this.emisor,this.texto,
				this.fechaHora.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")));
	}
	
	public Persona getEmisor() {
		return this.emisor;
	}
	
	public String getId() {
		return this.id;
	}
	
	@Override
	public int compareTo(Mensaje o) {
		return this.id.compareTo(o.id);
	}
	

}
