package ficheros;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import ficheros.model.Fichero;

public class PrincipalCacharreo {

	public static void main(String[] args) throws IOException {
		//FIleNotFoundException
		
		File directorioRaiz = new File("/home/estudiante/temporalJava");
		File fichero1 = new File("/home/estudiante/temporalJava/newFichero3.txt");
		directorioRaiz.listFiles();
		System.out.println(directorioRaiz.isDirectory());
		System.out.println(fichero1.isDirectory());
		System.out.println(Arrays.toString(directorioRaiz.listFiles()));
		
		Fichero f = new Fichero("/home/estudiante/temporalJava");
		Fichero f1 = new Fichero("/home/estudiante/temporalJava3");

		System.out.println(f);
		System.out.println(f1);


		
		
	}

}
