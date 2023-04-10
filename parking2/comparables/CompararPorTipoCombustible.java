package parking2.comparables;

import java.util.Comparator;

import parking2.model.Vehiculo;

public class CompararPorTipoCombustible implements Comparator<Vehiculo> {

	public CompararPorTipoCombustible() {
	}

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		int resultado = 0;
		
		if(o1 != null && o2 != null) {
			resultado = o1.getTipoVehiculo().equals(o2.getTipoVehiculo()) ? o1.getCombustible().compareTo(o2.getCombustible())
					: o1.getTipoVehiculo().compareTo(o2.getTipoVehiculo());
		}else if(o1 == null) {
			resultado = 1;
		}else if(o2 == null) {
			resultado = -1;
		}
		
		return resultado;
	}
	
	

}
