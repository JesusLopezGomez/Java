package ficherosXml.main.java.json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import ficherosXml.main.java.model.Estudiante;



public class JSONManager {


	
	public List<Estudiante> cargarDatos(String ruta){
		
		List<Estudiante> estudiantes = null;
		
		Gson gson = new GsonBuilder().create();
		
		try {
			
			Estudiante[] array = 
					gson.fromJson(new FileReader(new File(ruta)), Estudiante[].class);
			
			estudiantes = new ArrayList(Arrays.asList(array));
			
		} catch (JsonSyntaxException | JsonIOException | FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		return estudiantes;
	}
	
	public void toJSON(List<Estudiante> estudiantes, String ruta) {
		
		Gson gson = new GsonBuilder().setPrettyPrinting().enableComplexMapKeySerialization().create();
		
		try {
			File archivo = new File(ruta);
			archivo.createNewFile();
			FileWriter writer = new FileWriter(archivo);
			
			gson.toJson(estudiantes, writer);
			
			writer.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}

}
