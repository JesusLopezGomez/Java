package plataformaOnline.model;

import java.util.Comparator;

public class OrdenarTemporadaNotaMediaComparator implements Comparator<Temporada> {

	@Override
	public int compare(Temporada o1, Temporada o2) {
		return (int) (o1.getNotaMedia() - o2.getNotaMedia());
	}

}
