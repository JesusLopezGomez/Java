package com.edu;

public class Boletin3 {

	public static String cifradoCesar(String cadena,int desplazamiento) {

		int cont = 0;
		String resultado = "";
		String abecedario = "abcdefghijklmnñopqrstuvwxyz";
		while(cont < cadena.length()) {
			resultado += abecedario.substring(abecedario.indexOf(cadena.charAt(cont)+desplazamiento),abecedario.indexOf(cadena.charAt(cont)+desplazamiento)+1);
			cont ++;
		}return resultado;
	}
	public static String imprimirParesImparesFor(String cadena,boolean esPar) {
		StringBuilder resultado = new StringBuilder();
		for(int i = 0; i < cadena.length();i++) {
			if((esPar) && (i % 2 == 0)) {
					resultado.append(cadena.charAt(i));
			}else if((!esPar) && (i % 2 != 0)) {
					resultado.append(cadena.charAt(i));
			}
		}return resultado.toString();
	}
	public static String imprimirParesImparesDoWhile(String cadena, boolean esPar) {
		StringBuilder resultado = new StringBuilder();
		int cont = 0;
		do {
			if((esPar) && (cont % 2 == 0)) {
				resultado.append(cadena.charAt(cont));
			}else if((!esPar) && (cont % 2 != 0)){
				resultado.append(cadena.charAt(cont));
			}cont ++;
		}while(cont < cadena.length());
		return resultado.toString();
	}
	public static String imprimirParesImparesWhile(String cadena, boolean esPar) {
		StringBuilder resultado = new StringBuilder();
		int cont = 0;
		while(cont < cadena.length()) {
			if((esPar) && (cont % 2 == 0)) {
				resultado.append(cadena.charAt(cont));
			}else if((!esPar) && (cont % 2 != 0)){
				resultado.append(cadena.charAt(cont));
			}cont ++;
		}return resultado.toString();
	}
	public static boolean esDivisibleEntreTres(int numero) {

		boolean divisible = false;
		String numeroString = String.valueOf(numero);
		int resultado = 0;
		for(int i = 0;i<numeroString.length();i++) {
			resultado += Integer.valueOf(numeroString.substring(i, i+1));
		}if(resultado%3 == 0) {
			divisible = true;
		}return divisible;
		
	}
	public static int contains(String palabraContar,String frase) {
		int numeroDeVeces = 0;
		int cont = 0;
		int coincidencia = 0;
		while (cont < frase.length()){
		if((palabraContar.charAt(coincidencia)) == (frase.charAt(cont))) {
			coincidencia ++;
		}else {
			coincidencia = 0;
		}if(coincidencia == palabraContar.length()){
			numeroDeVeces ++;
			coincidencia = 0;
		}cont ++;
		}return numeroDeVeces;
	}
	public static boolean startWirth(String palabraContar,String frase) {
		return (frase.substring(0, palabraContar.length()).equals(palabraContar));
	}
	public static boolean endsWhith(String palabraContar,String frase) {
		
		return (frase.substring(frase.indexOf(palabraContar.charAt(0)), frase.length()).equals(palabraContar));
	}
	public static boolean esPalindromo(String palabra) {
		boolean esPalindromo = false;
		
		StringBuilder palabraAlReves = new StringBuilder();
		
		for(int i = palabra.length()-1; i >= 0;i-- ) {
						
			if(Character.isWhitespace(palabra.charAt(i))) {
				palabra = palabra.substring(0,i) + palabra.substring(i+1);
				i--;
			}
			
			palabraAlReves.append(palabra.substring(i,i+1));
			
		}if((palabraAlReves.substring(0)).equals(palabra.substring(0))) {
			esPalindromo = true;
		}
		
		return esPalindromo;
	}
	public static boolean esCapicua(double numero) {
		boolean esCapicua = false;
		
		String numeroCadenaAlReves = "";
		
		String numeroCadena = String.valueOf(numero);
		
		for(int i = numeroCadena.length()-1; i >= 0;i--) {
			
			if(numeroCadena.charAt(i) == '.') {
				
				numeroCadena = numeroCadena.substring(0,i) + numeroCadena.substring(i+1);
				i--;
			}
			
			numeroCadenaAlReves += numeroCadena.substring(i,i+1);
		
		}if(numeroCadenaAlReves.substring(0).equals(numeroCadena.substring(0, numeroCadena.length()))) {
			
			esCapicua = true;
		}
		
		return esCapicua;
	}
	public static boolean containsBooleano(String palabraContar,String frase) {
		int numeroDeVeces = 0;
		int cont = 0;
		int coincidencia = 0;
		boolean contiene = false;
		while (cont < frase.length()){
		if((palabraContar.charAt(coincidencia)) == (frase.charAt(cont))) {
			coincidencia ++;
		}else {
			coincidencia = 0;
		}if(coincidencia == palabraContar.length()){
			numeroDeVeces ++;
			coincidencia = 0;
		}cont ++;
		}if(numeroDeVeces >= 1) {
			contiene = true;
		}
		return contiene;
	}
	public static boolean palabraEnCadena(String palabraBuscar,String frase) {
		boolean encontrada = false;
		int coincidencia = 0;
		for(int i = 0; i < frase.length(); i++) {
			if(coincidencia < palabraBuscar.length()) {
				if((palabraBuscar.charAt(coincidencia)) == frase.charAt(i)) {
				coincidencia ++;
				}
			}if(coincidencia == palabraBuscar.length()) {
				encontrada = true;
				}
		}return encontrada;
		
	}
	public static String reemplazarPalabraEnCadena(String palabraBuscar, String cadena, String palabraReemplazo) {
		StringBuilder resultado = new StringBuilder();
		String tmp = "";
		int ipalabra = 0;
		
		for(int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i) == palabraBuscar.charAt(ipalabra)) {
				tmp += palabraBuscar.charAt(ipalabra);
				ipalabra ++;
				if(palabraBuscar.length() == ipalabra) {
					ipalabra = 0;
					resultado.append(palabraReemplazo);
					tmp = "";
				}
			}else {
				resultado.append(tmp + cadena.charAt(i));
				ipalabra = 0;
			}	
		}
		return resultado.toString();
	}
	public static String numeroDePalabraFraseParrafo(String cadena) {
		int contFrase = 0;
		int contPalabra = 0;
		int contParrafo = 0;
		
	if(cadena.length() > 0) { 
		contParrafo ++;
		for(int i = 0; i < cadena.length();i++) {
			if(i==0 && !cadena.substring(i, i+1).equals(" ")) {
				contPalabra ++;
			}else if(!cadena.substring(i, i+1).isBlank()&&cadena.substring(i-1, i).isBlank()) {
				contPalabra ++;
			}else if(cadena.substring(i, i+1).isBlank()&&cadena.substring(i-1, i).equals(".")) {
				contFrase ++;
			}else if(cadena.substring(i, i+1).equals("\n")) {
				contParrafo++;
			}
			
		}
	}return("En la cadena introducida hay: " + contPalabra + " palabras, " + contFrase + " frases, y " + contParrafo +" párrafos.");
	}
	public static char cifradoCesarCaracter(char caracter,int desplazamiento) {
		String abecedario = "abcdefghijklmnñopqrstuvwxyz";
		char resultado = abecedario.charAt(abecedario.indexOf(caracter+desplazamiento));
		return resultado;
	}
	public static String cifradoCesarComprobar(String cadena, String cadenaEquivalente) {
		int desplazamiento = 0;
		String cadenaDesplazar = cifradoCesar(cadena,desplazamiento);
		int cont = 0;
		String mensaje = "";
		while(cont < cadena.length()) {
			if(cadenaDesplazar.equals(cadenaEquivalente)) {
				mensaje = (cadena + " y " + cadenaEquivalente + " son iguales" + " cifrado: " + desplazamiento);
				cont ++;
			}else{
				if(desplazamiento < cadena.length()) {
					desplazamiento ++;
					cadenaDesplazar = cifradoCesar(cadena,desplazamiento);
					cont ++;
				}
			}
		}
		if(!cadenaDesplazar.equals(cadenaEquivalente)){
			mensaje = (cadena + " y " + cadenaEquivalente + " no son iguales");
		}
		
		return mensaje;
		
	}
	public static void main(String[] args) {

		/* Realiza una funcion que cifre un un carácter según el cifrado César y 
		 * un desplazamiento dado.
		 */
		System.out.println("Ejercicio 1:");
		System.out.println(imprimirParesImparesFor("jesus",true));
		System.out.println(imprimirParesImparesWhile("jesus",false));
		System.out.println(imprimirParesImparesDoWhile("jesus",true));
		System.out.println("Ejercicio 2:");
		System.out.println(esDivisibleEntreTres(156));
		System.out.println("Ejercicio 3:");
		System.out.println(contains("perro","ayer adopté un perro y es más perro que tú."));
		System.out.println("Ejercicio 4:");
		System.out.println(startWirth("jesus","jesus lopez gomez"));
		System.out.println(endsWhith("jesus","lopez gomez jesus"));
		System.out.println(containsBooleano("substrings","increible substrings"));
		System.out.println("Ejercicio 5:");
		System.out.println(esPalindromo("ligar es ser agil"));
		System.out.println("Ejercicio 6:");
		System.out.println(esCapicua(124.21));
		System.out.println("Ejercicio 7:");
		System.out.println(palabraEnCadena("hola","soybahxlna"));
		System.out.println("Ejercicio 8:");
		System.out.println(reemplazarPalabraEnCadena("Loco","Loco te vendieron la moto","Locasa"));
		System.out.println("Ejercicio 9:");
		System.out.println(numeroDePalabraFraseParrafo("Dos palabras una frase. \n y un parrafo"));
		System.out.println("Ejercicio 10:");
		System.out.println(cifradoCesar("jose",3));
		System.out.println(cifradoCesarCaracter('e',3));
		System.out.println(cifradoCesarComprobar("jesus","mhvxv"));
	}

}
