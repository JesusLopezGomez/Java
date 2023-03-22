package parking;

import java.time.LocalDateTime;

import parking.model.Combustible;
import parking.model.Parking;
import parking.model.TipoVehiculo;
import parking.model.Vehiculo;

public class Main {

	public static void main(String[] args) {
		System.out.println(LocalDateTime.now());
		Vehiculo v = new Vehiculo("Volkswagen","Golf 4","5554DJG",Combustible.GASOIL,TipoVehiculo.AUTOMOVIL);
		Vehiculo v1 = new Vehiculo("Volkswagen","Golf 5","1554DJG",Combustible.GASOIL,TipoVehiculo.AUTOMOVIL);

		Parking p = new Parking();
		
		p.entrarParking(v);
		System.out.println(p.toString());
		System.out.println(p.salirParking(v1));
	}

}
