package mockExam.model;

import java.util.Objects;

public class Plato {

	private static double iva = 0.21;
	private String nombre;
	private double precio;
	private Vino vinoRecomendado;
	
	public Plato(String nombre) {
		this.nombre = nombre;
	}

	public Plato(String nombre, double precio) {
		this(nombre);
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if(precio > 0) {
			this.precio = precio;
		}
	}
	
	public void incrementarPrecio(double incremento) {
		if(incremento>0) {
			this.precio += incremento;
		}
	}

	public static double getIva() {
		return iva;
	}

	public String getNombre() {
		return nombre;
	}
	
	public double getPrecioVentaPublico() {
		return (precio * iva) + precio;
	}
	
	public Vino getVinoRecomendado() {
		return vinoRecomendado;
	}
	
	public void setVinoRecomendado(Vino vino) {
		this.vinoRecomendado = vino;
	}
	
	public void setVinoRecomendado(String nombre, double graduacion) {
		Vino vino = new Vino(nombre,graduacion);
		this.vinoRecomendado = vino;
	}
	
	public double getGradoVinoRecomendado() {
		return this.vinoRecomendado.getGraduacion();
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
		Plato other = (Plato) obj;
		return resultado && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		String resultado = this.nombre + ", precio sin iva " + this.precio + ", precio de venta al público " + getPrecioVentaPublico()
		+ " , vino " + this.vinoRecomendado;
		if(vinoRecomendado == null) {
			resultado = this.nombre + ", precio sin iva " + this.precio + ", precio de venta al público " + getPrecioVentaPublico()
			+ " sin vino recomendado";
		}
		return resultado;
	}
	
	
	
	
	
	
	
	

}
