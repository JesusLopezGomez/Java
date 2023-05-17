package geo2.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GeneradorDeFicheros {

	private List<Country> countries;
	
	public GeneradorDeFicheros() throws IOException {
		this.countries = new ArrayList<>();
		addCountries();
	}
	
	public void addCountries() throws IOException {
		File f = new File("/Donwloads/country.txt");
		
		FileReader fw = new FileReader(f);
		
		BufferedReader bw = new BufferedReader(fw);
		
		String linea = bw.readLine();
		
		linea = bw.readLine();
		
		String[] array;
		
		while(linea != null) {
			array = linea.split(",");
			
			this.countries.add(new Country(array[0], array[1]));
			
			linea = bw.readLine();
		}
		
		fw.close();
		bw.close();
	}
	
	public void generadorFicheroBonitoTexto() throws IOException {
		File f = new File("./files/ficheroBonito.txt");
		
		f.createNewFile();
		
		PrintWriter pw = new PrintWriter(f);
		
		for(Country co : this.countries) {
			pw.write(co.toString());
		}
		
	}
	
	public void generarJson() throws IOException {
		File f = new File("./files/ficheroJson.json");
		
		f.createNewFile();

		PrintWriter pw = new PrintWriter(f);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().enableComplexMapKeySerialization().create();
		
		gson.toJson(this.countries,pw);
		
		pw.close();
	}
	
	public void toCsv() throws IOException {
		File f = new File("./files/countries.csv");
		
		f.createNewFile();
		
		PrintWriter pw = new PrintWriter(f);
		
		pw.println("country_id,country,numCities");
		pw.println("----------------------");
		
		for(Country c : this.countries) {
			pw.println(String .format("%s,%s,%s", c.getCountry_id(),c.getCountry(),c.getNumCities()));
		}

		pw.close();
	}
	
	public void toXml() throws IOException {
		try {
			Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			
			Element nodoRaiz = doc.createElement("countries");
			
			doc.appendChild(nodoRaiz);
			
			for(Country c : this.countries) {
				Element countryGeneral = doc.createElement("country");
				countryGeneral.setAttribute("id", c.getCountry_id());
				
				Element nombre = doc.createElement("nombre");
				nombre.appendChild(doc.createTextNode(c.getCountry()));
				countryGeneral.appendChild(nombre);
				
				Element numCities = doc.createElement("num_cities");
				numCities.appendChild(doc.createTextNode(String.valueOf(c.getNumCities())));
				countryGeneral.appendChild(numCities);
				
				nodoRaiz.appendChild(countryGeneral);
				
				Element ciudades = doc.createElement("ciudades");
				countryGeneral.appendChild(ciudades);
				
				for(City c2 : c.getCiudades()) {
					Element ciudad = doc.createElement("ciudad");
					ciudades.appendChild(ciudad);
					ciudad.setAttribute("id", c2.getId());
					
					Element nombreC = doc.createElement("nombre");
					nombreC.appendChild(doc.createTextNode(c2.getNombre()));
					ciudad.appendChild(nombreC);
					
					Element direcciones = doc.createElement("direcciones");
					ciudad.appendChild(direcciones);
					for(Address a : c2.getAddress()) {
						
						Element direccion = doc.createElement("direccion");
						direcciones.appendChild(direccion);
						direccion.setAttribute("id", a.getId());
						direccion.appendChild(doc.createTextNode(a.toString()));
						
					}
					
				}
			}
			
			Transformer tr = TransformerFactory.newInstance().newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult stream = new StreamResult(new File("./files/cities.xml"));
			
			tr.setOutputProperty(OutputKeys.INDENT, "yes");
			tr.transform(source, stream);
		} catch (ParserConfigurationException | TransformerException | TransformerFactoryConfigurationError e) {
		}
		
	}

}
