package practicaChatGpt.model;

public class OrdenadorPortatil extends ProductoElectronico {

	private int memoriaRam;
	
	
	public OrdenadorPortatil() {
	}

	public OrdenadorPortatil(double precio, String marca, String modelo, int memoriaRam) {
		super(precio, marca, modelo);
		this.memoriaRam = memoriaRam;
	}
	
	@Override
	public String toString() {
		return "Ordenador Pórtatil de la marca " + marca + " y modelo " + modelo + " con precio de " + precio + " con memoria ram " + memoriaRam;
	}
	
	public String vender() {
		return "Se ha vendido el Ordenador Pórtatil de la marca " + marca + ".";
	}

}
