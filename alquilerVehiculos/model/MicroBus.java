package alquilerVehiculos.model;

public class MicroBus extends Vehiculo {

	private int plazas;
	
	public MicroBus(String matricula, Gama gama, int numeroPlazas) {
		super(matricula, gama);
		if(numeroPlazas > 0) {
			this.plazas = numeroPlazas;
			super.precioBase += (numeroPlazas * 5);
		}
	}

	@Override
	public String toString() {
		return super.toString().concat(", numero de plazas " + this.plazas);
	}
	
	

}
