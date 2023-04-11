package parking2.comparables;

import java.util.Comparator;

import parking2.model.Vehiculo;

public class CompararPorMarcaModelo implements Comparator<Vehiculo> {

	public CompararPorMarcaModelo() {
	}

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		int resultado = 0;
		if(o1 != null && o2 != null) {
			resultado = o1.getMarca().equals(o2.getMarca()) ? o1.getModelo().compareTo(o2.getModelo())
					: o1.getMarca().compareTo(o2.getMarca());
		}else if(o1 == null) {
			resultado = 1;
		}else if(o2 == null) {
			resultado = -1;
		}
		
		return resultado;
	}

}
