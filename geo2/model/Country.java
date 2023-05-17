package geo2.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Country {

	private String country_id;
	private String country;
	private List<City> cities;
	
	public Country(String id, String country) throws IOException {
		super();
		this.country_id = id;
		this.country = country;
		this.cities = new ArrayList<>();
		addCities();
	}
	
	
	public void addCities() throws IOException {
		File f = new File("/Donwloads/city.txt");
		
		FileReader fw = new FileReader(f);
		
		BufferedReader bw = new BufferedReader(fw);
		
		
		String linea = bw.readLine();
		
		linea = bw.readLine();
		
		String[] array;
		
		while(linea != null) {
			array = linea.split(",");

			if(array[2] != null && array[2].equalsIgnoreCase(this.country_id)) {
				this.cities.add(new City(array[0], array[1]));
			}
			
			linea = bw.readLine();
		}
		
		fw.close();
		bw.close();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(country_id, country, cities);
	}

	@Override
	public boolean equals(Object obj) {
		return this==obj || obj!=null &&
				obj instanceof Country
		        && this.hashCode()==((City)obj).hashCode();
		    
	}
	
	private String listToString() {
		StringBuilder sb = new StringBuilder();
		
		for(City c : this.cities) {
			sb.append("		"+c.toString()).append(System.lineSeparator());
		}
		
		return sb.toString();
	}


	@Override
	public String toString() {
		return String.format("Country: %s, id: %s cities: %s %s %s", this.country,this.country_id,System.lineSeparator(),listToString(),System.lineSeparator());
	}


	public String getCountry_id() {
		return this.country_id;
	}


	public String getCountry() {
		return this.country;
	}


	public int getNumCities() {
		return this.cities.size();
	}
	
	
	public List<City> getCiudades(){
		return this.cities;
	}
	
	

}
