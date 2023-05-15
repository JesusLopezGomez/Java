package ficherosXml.main.java.writer;

import java.io.File;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import ficherosXml.main.java.model.Estudiante;

public class EscritorXML {

	
	
	public void escribirXML(List<Estudiante> estudiantes, String ruta) {
		
		try {
			Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			
			//Nodo raiz
			Element nodoRaiz = doc.createElement("estudiantes");
			doc.appendChild(nodoRaiz);
				
			for(Estudiante e : estudiantes) {
				//El primer nodo que cuelga de nodo raiz
				Element primerNodoHIjo = doc.createElement("estudiante");
				
				Attr atributoId = doc.createAttribute("id");
				atributoId.setValue(String.valueOf(e.getId()));
				primerNodoHIjo.setAttributeNode(atributoId);
				
				nodoRaiz.appendChild(primerNodoHIjo);

						
						//Los elementos que cuelgan de primer nodo hijo
						Element nombreEstudiante = doc.createElement("nombre");
						nombreEstudiante.appendChild(doc.createTextNode(e.getNombre()));
						primerNodoHIjo.appendChild(nombreEstudiante);
						
						Element apellidoEstudainte = doc.createElement("apellido");
						apellidoEstudainte.appendChild(doc.createTextNode(e.getApellidos()));
						primerNodoHIjo.appendChild(apellidoEstudainte);
						
						Element fechaNacimientoEstudiante = doc.createElement("fecha_nacimiento");
						fechaNacimientoEstudiante.appendChild(doc.createTextNode(e.getFechaNacimiento()));
						primerNodoHIjo.appendChild(fechaNacimientoEstudiante);
						
						Element generoEstudiante = doc.createElement("genero");
						generoEstudiante.appendChild(doc.createTextNode(e.getGenero().toString()));
						primerNodoHIjo.appendChild(generoEstudiante);
			}

			
			
			Transformer optimus = TransformerFactory.newInstance().newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(ruta));
			
			optimus.setOutputProperty(OutputKeys.INDENT, "yes");
			
			optimus.transform(source, result);
		
		} catch (ParserConfigurationException | 
				TransformerException | 
				TransformerFactoryConfigurationError e) {
			e.printStackTrace();
		}
		
	}

}
