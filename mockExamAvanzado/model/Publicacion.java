package mockExamAvanzado.model;

import java.time.LocalDateTime;
import java.util.Objects;

import mockExamAvanzado.enumerados.Valoraciones;
import mockExamAvanzado.interfaces.Valorable;

public class Publicacion implements Valorable,Comparable<Publicacion> {

	protected String texto;
	private LocalDateTime fechaCreacion;
	protected int valoracion;	
	private int codigo;
	private static int codigoSiguiente;
	private Usuario usuario;
	
	public Publicacion(String texto,Usuario usuario) {
		this.texto = texto;
		this.codigoSiguiente++;
		this.usuario = usuario;
		this.fechaCreacion = LocalDateTime.now();
	}

	protected String getTexto() {
		return this.texto;
	}
	
	protected void setTexto(String texto) {
		this.texto = texto; 
	}
	
	public LocalDateTime getFechaCreacion() {
		return this.fechaCreacion;
	}
	
	public int getValoracion() {
		return this.valoracion;
	}
	
	@Override
	public boolean valorar(String valoracion) {
		boolean resultado = false;
		if(valoracion.toUpperCase().equals(Valoraciones.MUYBUENA.toString())){
			resultado = true;
			this.valoracion += 2;
		}else if(valoracion.toUpperCase().equals(Valoraciones.NORMAL.toString())) {
			resultado = true;
			this.valoracion += 1;
		}else if( valoracion.toUpperCase().equals(Valoraciones.MUYMALA.toString())) {
			resultado = true;
			this.valoracion -= 2;
		}
		
		return false;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public String getLoginUsuario() {
		return usuario.getLogin();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(codigo, fechaCreacion, texto, usuario, valoracion);
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
		return resultado && codigo == other.codigo && Objects.equals(fechaCreacion, other.fechaCreacion)
				&& Objects.equals(texto, other.texto) && Objects.equals(usuario, other.usuario)
				&& valoracion == other.valoracion;
	}
	
	
	@Override
	public String toString() {
		return "Publicación: " + this.texto + "\n" + "Realizada por: " + this.usuario.getLogin() 
		+ "\n" + "Valoración: " + this.valoracion + "\n" + "Fecha publicación: " + this.fechaCreacion;
	}

	@Override
	public int compareTo(Publicacion o) {
		return this.valoracion - o.getValoracion();
	}
	
	public boolean isAnterior(Publicacion publicacion) {
		boolean resultado = false;
		if(this.fechaCreacion.compareTo(publicacion.getFechaCreacion()) < 0) {
			resultado = true;
		}
		return resultado;
	}
		

}
