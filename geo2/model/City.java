package geo2.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class City {

	private String city_id;
	private String city;
	private List<Address> listaAddress;
	
	public City(String id, String city) throws IOException {
		super();
		this.city = city;
		this.city_id = id;
		this.listaAddress = new ArrayList<>();
		addAddress();
	}
	
	
	public void addAddress() throws IOException {
		File f = new File("/Donwloads/address.txt");
		
		FileReader fw = new FileReader(f);
		
		BufferedReader bw = new BufferedReader(fw);
		
		String linea = bw.readLine();
			
		linea = bw.readLine();
		String[] array;
		while(linea != null) {
				
			array = linea.split(",");
			try {
				if(array[2] != null && array[4].equalsIgnoreCase(this.city_id)) {
					this.listaAddress.add(new Address(array[0],array[1]));
				}
			}catch (Exception e) {
				
			}	
			
			linea = bw.readLine();
			
		}
		
		fw.close();
		bw.close();

	}
	
	public List<Address> getAddress(){
		return this.listaAddress;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(city_id, city, listaAddress);
	}

	@Override
	public boolean equals(Object obj) {
		return this==obj || obj!=null &&
				obj instanceof City
		        && this.hashCode()==((City)obj).hashCode();
		    
	}

	@Override
	public String toString() {
		return String.format("City: %s, id: %s, address: %s",this.city,this.city_id,this.listaAddress.size() );
	}
	
	public String getNombre() {
		return this.city;
	}
	
	public String getId() {
		return this.city_id;
	}

}
