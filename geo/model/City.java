package geo.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class City {

	private String cityId;
	private String city;
	private List<Address> listAddress;
	
	public City(String id, String city) throws IOException {
		super();
		this.cityId = id;
		this.city = city;
		this.listAddress = new ArrayList<>();
		addAddress();
	}
	
	public void addAddress() throws IOException {
		File f = new File("/home/estudiante/Downloads/address.txt");
		
		BufferedReader buffer = new BufferedReader(new FileReader(f));
			
		String linea = buffer.readLine();
		
		linea = buffer.readLine();
		
		while(linea != null) {
			String[] arrayLinea = linea.split(",");
			try {
				if(arrayLinea[3] != null && arrayLinea[3].equals(this.city)) {
					this.listAddress.add(new Address(arrayLinea[0], arrayLinea[1]));
				}
			}catch(ArrayIndexOutOfBoundsException e) {
				
			}
			linea = buffer.readLine();

			
		}
	}
	
	
	@Override
	public String toString() {
		return String.format("City id: %s, city: %s, list address: %s ", this.cityId,this.city,this.listAddress);
	}

}
