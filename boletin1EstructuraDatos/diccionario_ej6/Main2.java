package boletin1EstructuraDatos.diccionario_ej6;

public class Main2 {

	public static void main(String[] args) {
		
		DiccionarioConList dl = new DiccionarioConList();
		
		Entrada e = new Entrada("Hola","Saludos");
		
		dl.anniadirPalabraSignificado("Hola", "Saluditos");
		dl.anniadirPalabraSignificado("Hola", "Saludos");
		
		dl.anniadirPalabraSignificado("Holita", "Saluditas");
		dl.anniadirPalabraSignificado("Halita", "Saluditas");

		dl.borrarPalabra("Hola");
				
		System.out.println(dl.listarPalabras("H"));

		
	}

}
