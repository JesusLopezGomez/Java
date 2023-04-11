package parking2.comparables;

import java.util.Comparator;

import parking2.model.Vehiculo;

public class CompararPorMatricula implements Comparator<Vehiculo> {

	public CompararPorMatricula() {
	}

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		int resultado = 0;
		if(o1 != null && o2 != null) {
			resultado = o1.getMatricula().equals(o2.getMatricula()) ? 0 
					: o1.getMatricula().compareTo(o2.getMatricula());
		}else if(o1 == null) {
			resultado = 1;
		}else if(o2 == null) {
			resultado = -1;
		}
		
		return resultado;
	}

	
}
