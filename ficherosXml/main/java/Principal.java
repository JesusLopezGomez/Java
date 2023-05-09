package ficherosXml.main.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import ficherosXml.main.java.json.JSONManager;
import ficherosXml.main.java.model.Estudiante;
import ficherosXml.main.java.model.Genero;

public class Principal {

	public static void main(String[] args) {
		/*
		String ruta = "./files/estudiantes.xml";
		List<Estudiante> estudiantes = new LectorXML().cargarEstudiantes(ruta);
		
		for(Estudiante e : estudiantes) {
			System.out.println(e);
		}
		
		new EscritorXML().escribirXML(estudiantes, "files/nuevosEstudiantes.xml");	
		*/
		List<Estudiante> estudiantes = new ArrayList<>(
				List.of(new Estudiante("jesus", "lopez", "19-11-2003", 6, Genero.HOMBRE),
						new Estudiante("kiki", "tutu", "14-05-2001", 1, Genero.HOMBRE)));

		new JSONManager().cargarDatos("./files/estudiantes.json");
		new JSONManager().toJSON(estudiantes,"./files/estudiantesGeneradosToJson.json");

	}

}
