package casetasFeria.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.google.gson.Gson;

public class Feria {

	private List<Caseta> listaCasetas;
	
	public Feria(String ruta) {
		super();
		this.listaCasetas = cargarCasetas(ruta);
	}
	
	public List<Caseta> cargarCasetas(String ruta){
		List<Caseta> casetas = new ArrayList<>();
		
		File fichero = new File(ruta);
		try {
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document documento = builder.parse(fichero);
			documento.getDocumentElement().normalize();
			
			NodeList listaNodoCaseta = documento.getElementsByTagName("DatosLeidos");
			
			for(int i = 0; i < listaNodoCaseta.getLength(); i++) {
				
				Element nodo = (Element)listaNodoCaseta.item(i);
				
				String titulo = nodo.getElementsByTagName("TITULO").item(0).getTextContent();
				String calle = nodo.getElementsByTagName("CALLE").item(0).getTextContent();
				String numero = nodo.getElementsByTagName("NUMERO").item(0).getTextContent();
				String modulo = nodo.getElementsByTagName("MODULOS").item(0).getTextContent();
				String clase = nodo.getElementsByTagName("CLASE").item(0).getTextContent();
				String id = nodo.getElementsByTagName("ID").item(0).getTextContent();
				String id_calle = nodo.getElementsByTagName("ID_CALLE").item(0).getTextContent();
				
				casetas.add(new Caseta(titulo, calle, numero, modulo, clase, id, id_calle));
			}
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
		
		return casetas;
	}
	
	public String obtenerCasetasEnCalle(String calle) {
		StringBuilder sb = new StringBuilder();
		for(Caseta c : this.listaCasetas) {
			if(c.getCalle().equals(calle.toUpperCase())) {
				sb.append("       "+c.toString()).append(System.lineSeparator());
			}
		}
		return sb.toString();
	}
	
	
	public String obtenerCasetasDistrito() {
		StringBuilder sb = new StringBuilder();
		for(Caseta c : this.listaCasetas) {
			if(c.getClase().equals("distrito".toUpperCase())) {
				sb.append("       "+c.toString()).append(System.lineSeparator());
			}
		}
		return sb.toString();
	}
	
	public String obtenerCasetasFamiliares() {
		StringBuilder sb = new StringBuilder();
		for(Caseta c : this.listaCasetas) {
			if(c.getClase().equals("familiar".toUpperCase())) {
				sb.append("       "+c.toString()).append(System.lineSeparator());
			}
		}
		return sb.toString();
	}
	
	public String obtenerCasetasNoFamiliaresNoDistrito() {
		StringBuilder sb = new StringBuilder();
		for(Caseta c : this.listaCasetas) {
			if(!c.getClase().equals("distrito".toUpperCase()) && !(c.getClase().equals("familiar".toUpperCase()))) {
				sb.append("       "+c.toString()).append(System.lineSeparator());
			}
		}
		return sb.toString();
	}
	
	public String callesConCasetasFamiliares() {
		Map<String, Integer> callesFamiliares = new HashMap<>();

		for(Caseta c : this.listaCasetas) {
			if(!callesFamiliares.containsKey(c.getCalle())){
				callesFamiliares.put(c.getCalle(), 0);
			}if(c.getClase().equals("familiar".toUpperCase())){
				callesFamiliares.replace(c.getCalle(),callesFamiliares.get(c.getCalle()) , callesFamiliares.get(c.getCalle())+1);
			}
		}
		
		return callesFamiliares.toString();
	}
	
	public String callesConCasetasDistrito() {
		Map<String, Integer> callesFamiliares = new HashMap<>();

		for(Caseta c : this.listaCasetas) {
			if(!callesFamiliares.containsKey(c.getCalle())){
				callesFamiliares.put(c.getCalle(), 0);
			}if(c.getClase().equals("distrito".toUpperCase())){
				callesFamiliares.replace(c.getCalle(),callesFamiliares.get(c.getCalle()) , callesFamiliares.get(c.getCalle())+1);
			}
		}
		
		return callesFamiliares.toString();
	}
	
	public void eliminarCaseta(String calle, String numeroCaseta) throws Exception {
		Iterator<Caseta> it = this.listaCasetas.iterator();
		Caseta c = null;
		int moduloBorrado = 0;
		boolean borrado = false;
		while(it.hasNext()) {
			c = it.next();
			if(c.getCalle().equals(calle) && c.getNumero().equals(numeroCaseta)) {
				it.remove();
				moduloBorrado = Integer.valueOf(c.getModulo());
				borrado = true;
			}else if (c.getCalle().equals(calle) && Integer.parseInt(c.getNumero()) > Integer.parseInt(numeroCaseta)) {
				c.restarNumero(moduloBorrado);
			}
		}
		
		if(!borrado) {
			throw new Exception("La calle o el número no existe");
		}
	}
	
	public void exportarJson() throws IOException {
		File exportadoJsonCaseta = new File("./files/casetas.json");
		exportadoJsonCaseta.createNewFile();
		Gson gson = new Gson();
		String datos = gson.toJson(this.listaCasetas);
		FileWriter fw = new FileWriter(exportadoJsonCaseta);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.append(datos);
		bw.close();
		fw.close();
	}

}
