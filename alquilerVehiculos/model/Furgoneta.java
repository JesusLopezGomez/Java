package alquilerVehiculos.model;

public class Furgoneta extends Vehiculo {

	private double pesoMaximoAutorizado;
	
	public Furgoneta(String matricula, Gama gama, double pesoMaximoAutorizado) {
		super(matricula, gama);
		if(pesoMaximoAutorizado > 0) {
			this.pesoMaximoAutorizado = pesoMaximoAutorizado;
			super.precioBase += (0.5*pesoMaximoAutorizado);
		}
	}

	@Override
	public String toString() {
		return super.toString().concat(", peso máximo autorizado " + this.pesoMaximoAutorizado);
	}
	
	

}
