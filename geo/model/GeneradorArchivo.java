package geo.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class GeneradorArchivo {

	private Set<Country> country;
	
	public GeneradorArchivo() throws IOException {
		super();
		this.country = new HashSet<>();
		addCountry();
	}
	
	private void addCountry() throws IOException {
		File f = new File("/home/estudiante/Downloads/country.txt");
		
		BufferedReader buffer = new BufferedReader(new FileReader(f));
		
		String linea = buffer.readLine();
		
		linea = buffer.readLine();
		
		String[] arrayLinea;
		
		while(linea != null) {
			arrayLinea = linea.split(",");
			
			this.country.add(new Country(arrayLinea[0], arrayLinea[1]));
			
			linea = buffer.readLine();
		}
	}
	
	public void geneadorArchivo() throws IOException {
		File f = new File("/home/estudiante/Downloads/generado.txt");
		
		f.createNewFile();
		
		FileWriter writer = new FileWriter(f);
		
		BufferedWriter bufferWriter = new BufferedWriter(writer);
		
		for(Country c : this.country) {
			bufferWriter.append(c.toString());
			bufferWriter.newLine();
		}
		
		bufferWriter.close();
		writer.close();
		
		
	}

}
