package mockExamAvanzadoCorregidoEnClase.publicacion;

import java.time.LocalDateTime;
import java.util.Objects;

import mockExamAvanzadoCorregidoEnClase.usuario.Usuario;

public abstract class Publicacion implements Valorable,Comparable<Publicacion> {

	private Usuario usuario;
	
	protected String texto;
	private LocalDateTime fechaCreacion;
	protected int valoracion;
	private int codigo;
	private static int codigoSiguiente = 0;
	
	public Publicacion(String texto,Usuario usuario) throws PublicacionExcepcion {
		super();	
		this.usuario = usuario;
		this.codigo = codigoSiguiente ++;
		this.fechaCreacion = LocalDateTime.now();
		setTexto(texto);
	}
	
	protected abstract void setTexto(String texto) throws PublicacionExcepcion;
	
	protected String getTexto() {
		return this.texto;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public int getValoracion() {
		return valoracion;
	}

	public int getCodigo() {
		return codigo;
	}
	
	public String getLoginUsuario() {
		return this.usuario.getLogin();
	}

	public boolean isAnterio(Publicacion publicacion) {
		return this.fechaCreacion.isBefore(publicacion.getFechaCreacion());
	}
	
	public boolean valorar(String valoracion) {
		boolean esPosibleValorar = false;
		try {
			Valoraciones valoraciones = Valoraciones.valueOf(valoracion.toUpperCase());	
			this.valoracion += valoraciones.getValoracion();
			esPosibleValorar = true;
		}catch(Exception e) {
			
		}
		return esPosibleValorar;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(codigo, fechaCreacion, texto, usuario, valoracion);
	}

	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = this == obj;

		if(!sonIguales && obj != null && obj instanceof Publicacion) {
			Publicacion other = (Publicacion)obj;
			
			sonIguales = other.hashCode()==this.hashCode(); //Alternativa utilizando hashCode
			sonIguales =codigo == other.codigo && Objects.equals(fechaCreacion, other.fechaCreacion)
					&& Objects.equals(texto, other.texto) && Objects.equals(usuario, other.usuario)
					&& valoracion == other.valoracion;
		}
		
		return sonIguales;
	} 
	@Override
	public int compareTo(Publicacion p) {
		return this.valoracion==p.valoracion ? this.fechaCreacion.compareTo(p.fechaCreacion) : this.valoracion-p.valoracion;
	}
	
	@Override
	public String toString() {
		return String.format("%s. \n"
				+ "Publicacion: %s \n"
				+ "Realizada por: %s \n"
				+ "Valoracion: %s \n"
				+ "Fecha de publicacion: %s",
							this.getClass().getSimpleName(),getTexto(),
							getLoginUsuario(),getValoracion(),getFechaCreacion());
	}
	
	
	

}
