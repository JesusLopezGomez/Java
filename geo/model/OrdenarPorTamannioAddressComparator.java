package geo.model;

import java.util.Comparator;

public class OrdenarPorTamannioAddressComparator<T> implements Comparator<City> {

	public OrdenarPorTamannioAddressComparator() {
	}

	@Override
	public int compare(City o1, City o2) {
		return o1.getSizeAddres() == o2.getSizeAddres()? o1.getName().compareTo(o2.getName()) :o1.getSizeAddres() - o2.getSizeAddres();
	}

}
