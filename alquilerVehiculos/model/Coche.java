package alquilerVehiculos.model;

public class Coche extends Vehiculo {

	private Combustible combustible;
	
	public Coche(String matricula, Gama gama, Combustible combustible) {
		super(matricula, gama);
		this.combustible = combustible;
		super.precioBase += combustible.getPrecio();
	}
	

	@Override
	public String toString() {
		return super.toString().concat(", tipo de combustible " + this.combustible);
	}

	
	
}
