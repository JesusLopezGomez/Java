package practicaChatGpt.model;

import java.util.Objects;

public class TelefonoMovil extends ProductoElectronico {

	
	protected double capacidad;
	
	
	public TelefonoMovil() {
	}

	public TelefonoMovil(double precio, String marca, String modelo, double capacidad) {
		super(precio, marca, modelo);
		this.capacidad = capacidad;
		
	}

	@Override
	public String toString() {
		return "Telefono de la marca " + marca + " y modelo " + modelo + " con precio de " + precio + " con capacidad de " + capacidad;
	}
	
	public String vender() {
		return "Se ha vendido el Telefono de la marca " + marca + ".";
	}

	@Override
	public int hashCode() {
		return Objects.hash(capacidad);
	}

	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = this==obj;
		if (obj != null && !sonIguales && obj instanceof TelefonoMovil) {
			TelefonoMovil other = (TelefonoMovil) obj;
			sonIguales = Double.doubleToLongBits(capacidad) == Double.doubleToLongBits(other.capacidad);
		}
		
		return sonIguales;
	}
	
	
}
