package practicaChatGpt.model;

public class Tablet extends TelefonoMovil {
	
	
	private double tamannioPantalla;
	
	public Tablet() {
	}

	public Tablet(double precio, String marca, String modelo, double capacidad, double tamannioPantalla) {
		super(precio, marca, modelo, capacidad);
		this.tamannioPantalla = tamannioPantalla;
	}
	
	public String toString() {
		return "Tablet de la marca " + marca + " y modelo " + modelo + " con precio de " + precio + " con capacidad de " + capacidad + " y tamaño de pantalla de " + tamannioPantalla;
	}
	
	public String vender() {
		return "Se ha vendido la Tablet de la marca " + marca + ".";
	}

}
