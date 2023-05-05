package ficherosXml.main.java.xml.reader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import ficherosXml.main.java.model.Estudiante;
import ficherosXml.main.java.model.Genero;

public class LectorXML {

	
	public List<Estudiante> cargarEstudiantes(String ruta){
		List<Estudiante> listaEstudiantes = new ArrayList<>();
		
		File fichero = new File(ruta);

		try {
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document documento = builder.parse(fichero);
			documento.getDocumentElement().normalize();
			
			System.out.println(documento.getDocumentElement().getNodeName());
			
			NodeList listaNodosEstudiantes = documento.getElementsByTagName("estudiante");
			
			for(int i = 0; i < listaNodosEstudiantes.getLength() ; i++) {
				Element nodo = (Element)listaNodosEstudiantes.item(i);
				
				String nombre =(nodo.getElementsByTagName("nombre").item(0).getTextContent());
				String apellidos = (nodo.getElementsByTagName("apellidos").item(0).getTextContent());
				String fechaNacimiento = (nodo.getElementsByTagName("fechaNacimiento").item(0).getTextContent());
				Genero genero = Genero.valueOf(nodo.getElementsByTagName("genero").item(0).getTextContent());
				int id = Integer.valueOf(nodo.getAttribute("id"));
				
				Estudiante estudiante = new 
						Estudiante(nombre,apellidos,fechaNacimiento,id,genero);
				
				listaEstudiantes.add(estudiante);

			}
		
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
		}
		
		
		return listaEstudiantes;
	}

}
