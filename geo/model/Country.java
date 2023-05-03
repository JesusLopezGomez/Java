package geo.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Country {

	private String country_id;
	private String country;
	private List<City> listCity;
	
	public Country(String country_id, String country) throws IOException {
		super();
		this.country_id = country_id;
		this.country = country;
		this.listCity = new ArrayList<>();
		addCity();
		
	}
	
	public void addCity() throws IOException {
		File f = new File("D:\\Donwloads\\city.txt");
		
		BufferedReader buffer = new BufferedReader(new FileReader(f));
		
		String linea = buffer.readLine();
		
		linea = buffer.readLine();
		
		String[] lineaArray;
		while(linea != null) {
			lineaArray = linea.split(",");
			this.listCity.add(new City(lineaArray[0],lineaArray[1]));
			linea = buffer.readLine();
		}
		
	}

	@Override
	public String toString() {
		return String.format("Country id: %s, country: %s, list city: %s ", this.country_id,this.country,this.listCity);
	}
	
	
	

}
