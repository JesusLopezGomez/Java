package boletin1EstructuraDatos.diccionario_ej6;

public class Main {

	public static void main(String[] args) {

		Diccionario d = new Diccionario();
		
		d.anniadirPalabraSignificado("coche", "bmw");
		d.anniadirPalabraSignificado("moto", "jog rr");
		d.anniadirPalabraSignificado("coche", "bmw2");
		System.out.println(d.buscarPalabra("moto"));
		System.out.println(d.buscarPalabra("coche"));
		System.out.println(d.listarPalabras("bwm"));
	}

}
