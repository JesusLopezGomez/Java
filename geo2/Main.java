package geo2;

import java.io.IOException;

import geo2.model.GeneradorDeFicheros;

public class Main {

	public static void main(String[] args) {
		GeneradorDeFicheros gf = null;
		try {
			gf = new GeneradorDeFicheros();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("hola");
		try {
			gf.generadorFicheroBonitoTexto();
			gf.generarJson();
			gf.toCsv();
			gf.toXml();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
