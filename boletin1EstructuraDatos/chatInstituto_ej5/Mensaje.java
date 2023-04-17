package boletin1EstructuraDatos.chatInstituto_ej5;

import java.time.LocalDateTime;
import java.util.Objects;

public class Mensaje implements Comparable<Mensaje>{

	private static int secuencia = 0;
	private Persona remitente;
	private String texto;
	private LocalDateTime fechaHora;
	private int codigo; 
	
	public Mensaje(Persona remitente, String texto) {
		super();
		this.remitente = remitente;
		this.texto = texto;
		this.fechaHora = LocalDateTime.now();
		this.codigo = secuencia ++;
	}

	@Override
	public boolean equals(Object obj) {
		boolean resultado = false;
		if (this == obj)
			resultado = true;
		if (obj == null)
			resultado = false;
		if (getClass() != obj.getClass())
			resultado = false;
		Mensaje other = (Mensaje) obj;
		return resultado && Objects.equals(fechaHora, other.fechaHora) && Objects.equals(remitente, other.remitente)
				&& Objects.equals(texto, other.texto);
	}

	public boolean contieneFraseMensaje(String frase) {
		return this.texto.contains(frase);
	}
	
	protected int getCodigo() {
		return this.codigo;
	}

	@Override
	public String toString() {
		return String.format("Mensaje %s: De: %s Texto: %s Fecha y hora:" + 
			" %s", this.codigo, this.remitente.getNombre(), this.texto, this.fechaHora);
	}

	@Override
	public int compareTo(Mensaje o) {
		return this.remitente.nombre.compareTo(o.remitente.nombre);
	}
	
	

}
