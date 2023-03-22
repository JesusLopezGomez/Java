package parking.model;

import java.util.Arrays;

public class Parking {

	private Vehiculo[] vehiculos = new Vehiculo[50];
	private static int contEntradaSalida = 0;
	
	public String entrarParking(Vehiculo vehiculo) {
		String resultado = null;
		
		if(this.contEntradaSalida == this.vehiculos.length) {
			resultado = "No hay espacio en el parking";
		}else if(this.contEntradaSalida < this.vehiculos.length){
			resultado = "Has entrado al parking";
			this.vehiculos[contEntradaSalida] = vehiculo;
			contEntradaSalida ++;
		}
		return resultado;
		
	}
	
	public String salirParking(Vehiculo vehiculo) {
		String resultado = "El vehiculo no se encuentra en el parking";
		for(Vehiculo v:this.vehiculos) {
			if(v!=null && v.getMatricula().equals(vehiculo.getMatricula())) {
				resultado = "Has salido del parking";
				v = null;
			}
		}
		return resultado;
		
	}

	@Override
	public String toString() {
		return Arrays.toString(this.vehiculos);
	}
	
	

}
