package parking2;

import parking2.enumerados.Combustible;
import parking2.enumerados.TipoVehiculo;
import parking2.excepciones.miExcepcion;
import parking2.model.Parking;
import parking2.model.Vehiculo;

public class Main {

	public static void main(String[] args) throws miExcepcion {
		Vehiculo v2 = new Vehiculo("Leon","FR","CCJ5332",Combustible.GASOIL,TipoVehiculo.TRANSPORTE_COLECTIVO);
		Vehiculo v = new Vehiculo("VolskWagen","Golf 4","CCJ5532",Combustible.GASOIL,TipoVehiculo.AUTOMOVIL);
		Vehiculo v3 = new Vehiculo("Citroen","C4","CCJ5232",Combustible.ELECTRICO,TipoVehiculo.AUTOMOVIL);
		Vehiculo v4 = new Vehiculo("Citroen","A4","ACJ5232",Combustible.GASOIL,TipoVehiculo.AUTOMOVIL);
		Parking p = new Parking();
		p.entrar(v);
		p.entrar(v2);
		p.entrar(v3);
		p.entrar(v4);
		System.out.println(p.ordenarFechaEntrada());
		System.out.println(p.ordenarPorMarcaModelo());
		System.out.println(p.ordenarPorTipoYCombustible());
		System.out.println(p.ordenarPorMatricula());
	}

}
