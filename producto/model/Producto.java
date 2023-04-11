package producto.model;

import java.util.Objects;

public class Producto {
	
	private String descripcion;
	private double precioSinIva;
	
	final static double IVA = 0.2;
	
	public Producto() {
		
	}
	
	public Producto(String descripcion, double precioSinIVA) {
		super();
		this.descripcion = descripcion;
		this.precioSinIva = precioSinIVA;
	}
	
	public double precioVenta() {
		return this.precioSinIva+(this.precioSinIva * IVA);
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioSinIva() {
		return precioSinIva;
	}

	public void setPrecioSinIva(double precioSinIva) {
		this.precioSinIva = precioSinIva;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(descripcion, precioSinIva);
	}

	@Override
	public String toString() {
		return "El producto con descripción: " + descripcion + ", codigo: "+ hashCode()  + ", el precio de venta sin IVA es de: " + precioSinIva ;
	}
	
	

}
