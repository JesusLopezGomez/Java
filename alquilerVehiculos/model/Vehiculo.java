package alquilerVehiculos.model;


public class Vehiculo {

	private String matricula;
	private Gama gama;
	protected double precioBase;
	
	public Vehiculo(String matricula, Gama gama) {
		super();
		this.matricula = matricula;
		this.gama = gama;
		this.precioBase = gama.getPrecio();
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean resultado = false;
		Vehiculo other = (Vehiculo) obj;

		if (this == obj)
			resultado = this.matricula.equals(other.matricula);
		return resultado;
	}

	@Override
	public String toString() {
		return String.format("%s con matricula %s y de de gama %s", getClass().getSimpleName(),this.matricula,this.gama);
	}
	
	

}
