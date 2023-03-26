package mockExamAvanzado2.model;

import java.time.LocalDateTime;
import java.util.Objects;

import mockExamAvanzado2.enumerados.Valoraciones;
import mockExamAvanzado2.interfaces.Valorable;

public class Publicacion implements Valorable,Comparable<Publicacion>{

	protected String texto;
	private LocalDateTime fechaCreacion;
	protected int valoracion;
	private static int codigo = 0;
	private int codigoSiguiente;
	private Usuario usuario;
	
	public Publicacion(String texto, Usuario usuario) {
		super();
		this.texto = texto;
		this.usuario = usuario;
		this.codigo ++;
		this.fechaCreacion = LocalDateTime.now();
	}
	
	protected String getTexto() {
		return this.getTexto();
	}
	
	protected void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoSiguiente, fechaCreacion, texto, usuario, valoracion);
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
		Publicacion other = (Publicacion) obj;
		return resultado && codigoSiguiente == other.codigoSiguiente && Objects.equals(fechaCreacion, other.fechaCreacion)
				&& Objects.equals(texto, other.texto) && Objects.equals(usuario, other.usuario)
				&& valoracion == other.valoracion;
	}
	
	public LocalDateTime getFechaCreacion() {
		return this.fechaCreacion;
	}
	
	public int getValoracion() {
		return this.valoracion;
	}

	@Override
	public boolean valorar(Valoraciones valoracion) {
		this.valoracion = valoracion.getValoracion();
		return true;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public String getLoginUsuario() {
		return this.usuario.getLogin();
	}

	@Override
	public String toString() {
		return String.format("Publicación: %s\r\n"
				+ "Realizada por: %s\r\n"
				+ "Valoración: %s\r\n"
				+ "Fecha de publicación: %s", this.texto,getLoginUsuario(),getValoracion(),getFechaCreacion());
	}

	@Override
	public int compareTo(Publicacion o) {
		return this.fechaCreacion.compareTo(o.getFechaCreacion());
	}
	
	
	public boolean isAnterior(Publicacion publicacion) {
		return (this.fechaCreacion.compareTo(publicacion.getFechaCreacion()) > 0)? true : false;
	}
	

}
