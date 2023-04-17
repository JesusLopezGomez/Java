package boletin1EstructuraDatos.historialNavegacion_ej4.model;

import java.time.LocalDateTime;

public class PaginaWeb {

	private String url;
	private LocalDateTime fechaHora; 
	
	public PaginaWeb(String nombre) {
		super();
		this.url = nombre;
		this.fechaHora = LocalDateTime.now();
	}
	
	public PaginaWeb(String nombre,LocalDateTime fechaHora) { //Este constructor no es necesario
		super();											//pero lo pongo para realizar comprobaciones con fechas
		this.url = nombre;
		this.fechaHora = fechaHora;
	}

	public LocalDateTime getFechaHora() {
		return this.fechaHora;
	}
	
	public String getNombre() {
		return this.url;
	}

	@Override
	public String toString() {
		return String.format("Página web %s, visitada %s", this.url,this.fechaHora);
	}
	
	
}
