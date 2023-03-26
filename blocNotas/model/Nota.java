package blocNotas.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Nota implements Comparable<Nota> {

	private static int codigoSiguiente = 0;
	
	private int codigo = 0;
	private String texto;
	private LocalDateTime fechaCreacion;
	private LocalDateTime fechaModificacion;	
	
	public Nota(String texto) {
		this.texto = texto;
		this.fechaCreacion = LocalDateTime.now();
		this.codigoSiguiente ++;
		this.codigo = this.codigoSiguiente;
	}
	
	public String getTexto() {
		return this.texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
		this.fechaModificacion = LocalDateTime.now();
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public LocalDateTime getFechaCreacion() {
		return this.fechaCreacion;
	}
	
	public LocalDateTime getFechaModificacion() {
		return this.fechaModificacion;
	}
	
	public boolean isModificado() {
		return this.fechaModificacion != null;
	}
	
	public boolean isEmpty() {
		return this.texto.isEmpty();
	}
	
	public boolean isCreadoAnterior(Nota nota) {
		return this.fechaCreacion.compareTo(nota.getFechaCreacion()) > 0;	
	}
	
	public boolean isModificadoAnterior(Nota nota) {
		return this.fechaModificacion.compareTo(nota.getFechaModificacion()) > 0;	
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaCreacion, texto);
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
		Nota other = (Nota) obj;
		return resultado && Objects.equals(fechaCreacion, other.fechaCreacion) && Objects.equals(texto, other.texto);
	}

	@Override
	public String toString() {
		return String.format("Nota con codigo: %s, fecha de creacion: %s, y texto: %s",
				this.codigo,this.fechaCreacion,this.texto);
	}

	@Override
	public int compareTo(Nota o) {
		return this.texto.compareTo(o.getTexto());
	}
	
	
	
	
	
	

}
