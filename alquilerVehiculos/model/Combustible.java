package alquilerVehiculos.model;

public enum Combustible {
	DIESEL(2.0),GASOLINA(3.5);
	
	private double precio;
	
	private Combustible(double d){
		this.precio = d;
	}
	
	public double getPrecio() {
		return this.precio;
	}
}
