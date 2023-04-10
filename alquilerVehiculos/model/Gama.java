package alquilerVehiculos.model;

public enum Gama {

	ALTA(50) ,MEDIA(40), BAJA(30);
	
	private int precio;
	
	private Gama(int g){
		this.precio = g;
	}
	
	public int getPrecio() {
		return this.precio;
	}
}
