package geo;

import java.io.IOException;

import geo.model.City;
import geo.model.Country;

public class Main {

	public static void main(String[] args) {
		
		
		Country country = null;
		City city = null;
		try {
			 city = new City("1", "A Corua La Corua");
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		try {
			country = new Country("1", "Afghanistan");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		
		
		System.out.println("Hola");
		
	}

}
