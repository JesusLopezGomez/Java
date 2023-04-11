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
		Vehiculo v1 = new Vehiculo("Leon","Area","1554AJG",Combustible.ELECTRICO,TipoVehiculo.TRANSPORTE_COLECTIVO);
		Vehiculo v2 = new Vehiculo("Aston martin","Bolf 5","2554BJG",Combustible.HIBRIDO,TipoVehiculo.CICLOMOTOR);

		Parking p = new Parking();
		System.out.println(p.entrarParking(v2));
		System.out.println(p.entrarParking(v1));
		System.out.println(p.entrarParking(v));
		System.out.println("Ordenar por fecha de entrada");
		System.out.println(p.compararPorFechaEntrada());	
		System.out.println("Ordenar por marca");
		System.out.println(p.compararPorMarca());
		System.out.println("Ordenar por modelo");
		System.out.println(p.compararPorModelo());
		System.out.println("Ordenar por tipo");
		System.out.println(p.compararPorTipo());
		System.out.println("Ordenar por combustible");
		System.out.println(p.compararPorCombustible());
		System.out.println("Ordenar por matricula");
		System.out.println(p.compararPorMatricula());
	}

}
