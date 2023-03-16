package clasesAbstractas.model;

public abstract class Figura {

	private double lados;
	
	public abstract double calcularArea();
	
	public abstract double calcularPerimetro();
	
	public String toString() {
		return String.format("Figura con tipo %s, área %s, y perímetro %s", 
				getClass().getSimpleName(),calcularArea(),calcularPerimetro());
	}
	
	

}
