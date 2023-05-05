package ficherosXml.main.java;

import java.util.List;

import ficherosXml.main.java.model.Estudiante;
import ficherosXml.main.java.writer.EscritorXML;
import ficherosXml.main.java.xml.reader.LectorXML;

public class Principal {

	public static void main(String[] args) {
		String ruta = "./files/estudiantes.xml";
		List<Estudiante> estudiantes = new LectorXML().cargarEstudiantes(ruta);
		
		for(Estudiante e : estudiantes) {
			System.out.println(e);
		}
		
		new EscritorXML().escribirXML(estudiantes, "files/nuevosEstudiantes.xml");	
		
	}

}
