package alquilerVehiculos.model;

public class Empresa {

	private static final int MAX_VEHICULOS = 200;
	
	Vehiculo[] alquiler;
	
	private double precio;	
	
	public Empresa() {
		super();
		this.alquiler = new Vehiculo[MAX_VEHICULOS];
	}
	
	public void altaVehiculo(Vehiculo vehiculo) {
		boolean alta = false;
		for(int i = 0; i < MAX_VEHICULOS && !alta ;i++) {
			if(this.alquiler[i] == null) {
				this.alquiler[i] = vehiculo;
			}
		}
	}
	
	public double calcularPrecioAlquiler(String matricula,int dias) {
		int posicionVehiculo = posicionVehiculo(matricula);
		
		if(posicionVehiculo != -1) {
			this.precio = this.alquiler[posicionVehiculo].precioBase * dias;
		}
		
		return this.precio;
	}
	
	
	private int posicionVehiculo(String matricula) {
		int pos = -1;
		for(int i = 0; i < MAX_VEHICULOS && pos == -1; i++) {
			if(this.alquiler[i].getMatricula().equals(matricula)) {
				pos = i;
			}
		}
		return pos;
	}

}
