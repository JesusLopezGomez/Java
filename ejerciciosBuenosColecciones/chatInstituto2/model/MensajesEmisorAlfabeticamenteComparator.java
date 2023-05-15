package ejerciciosBuenosColecciones.chatInstituto2.model;

import java.util.Comparator;

public class MensajesEmisorAlfabeticamenteComparator implements Comparator<Mensaje> {

	@Override
	public int compare(Mensaje o1, Mensaje o2) {
		return o1.getEmisor().toString().compareTo(o2.getEmisor().toString());
	}

}
