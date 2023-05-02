package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PrincipalCacharreo {

	public static void main(String[] args) throws IOException {
		//FIleNotFoundException
		
		//File directorioRaiz = new File("/home/estudiante/temporalJava");
		File fichero1 = new File("/home/estudiante/temporalJava/newFichero3");
		//directorioRaiz.listFiles();
		//System.out.println(directorioRaiz.isDirectory());
		//System.out.println(fichero1.isDirectory());
		//System.out.println(Arrays.toString(directorioRaiz.listFiles()));
		
		//Fichero f = new Fichero("/home/estudiante/temporalJava");
		//Fichero f1 = new Fichero("/home/estudiante/temporalJava3");

		//System.out.println(f);
		//System.out.println(f1);

		BufferedReader buffer = new BufferedReader(new FileReader(fichero1));

		String linea = buffer.readLine();
		
		/*
		System.out.println(buffer.readLine());
		System.out.println(buffer.readLine());		
		System.out.println(buffer.readLine());		
		System.out.println(buffer.readLine());		
		System.out.println(buffer.readLine());		
		System.out.println(buffer.readLine());		
		*/
		
		while(linea != null) {
			System.out.println(linea);
			linea = buffer.readLine();
		}
		
		buffer.close();

		
	}

}
