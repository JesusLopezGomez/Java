package geo;

import java.io.IOException;

import geo.model.City;
import geo.model.Country;

public class Main {

	public static void main(String[] args) {
		
		
		Country country = null;
		City city = null;

		try {
			country = new Country("1", "Afghanistan");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		try {
			city = new City("10","Akishima");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Hola");
		
	}

}
