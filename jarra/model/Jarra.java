package jarra.model;

public class Jarra {
	
	private static double cantidadGastaGeneral;
	private double capacidad;
	private double cantidadAgua;
		
	public Jarra() {
	this.cantidadAgua = 0.0;
	}

	public Jarra(double capacidad) {
		super();
		this.capacidad = capacidad;
		this.cantidadAgua = 0.0;
	}

	public static double getCantidadGastaGeneral(){
		return cantidadGastaGeneral;
	}
	
	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public double getCantidadAgua() {
		return cantidadAgua;
	}

	public void setCantidadAgua(double cantidadAgua) {
		this.cantidadAgua = cantidadAgua;
	}
	
	public double getCantidadDeAguaGastada() {
		return cantidadGastaGeneral;
	}


	public void llenarJarraCompleta() {
		this.cantidadAgua = this.capacidad;
		cantidadGastaGeneral += this.capacidad;
	}
	
	public void vaciarJarraCompleta(){
		this.cantidadAgua = 0;
	}
	
	public boolean volcarContenidoEnOtraJarra(Jarra b) {
		boolean resultado = false;
		if(this.cantidadAgua + b.cantidadAgua <= b.capacidad) {
			b.cantidadAgua += this.cantidadAgua;
			this.cantidadAgua = 0.0;
			resultado = true;
		}
		
		return resultado;
	}

	@Override
	public String toString() {
		return "Jarra, total de agua: " + this.cantidadAgua + ", capacidad de la jarra: " + this.capacidad +
				", cantidad de agua gastada: " + cantidadGastaGeneral;
	}
	
	
	
	

}
