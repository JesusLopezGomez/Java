package sieteMedia.comparables;

import java.util.Comparator;

import sieteMedia.model.Carta;

public class ComparablePaloCarta implements Comparator<Carta> {

	public ComparablePaloCarta() {
	}

	@Override
	public int compare(Carta o1, Carta o2) {
		int resultado = 0;
		if(o1 != null && o2 != null) {
			resultado = o1.getPalo().toString().compareTo(o2.getPalo().toString());
		}else if(o2 == null){
			resultado = -1;
		}else if(o1 == null) {
			resultado = 1;
		}
		return resultado;
	}

}
