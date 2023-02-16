package com.edu;

public class CifradoCesar {

	public static final String ABECEDARIO = "abcdefghijklmnñopqrstuvwxyz";

	public static char cifrar(char caracter, int desplazamiento) {
		char cifrado = ' ' ;
		
		return ABECEDARIO.charAt((ABECEDARIO.indexOf(caracter) + desplazamiento)%ABECEDARIO.length());
		
	}
	public static String cifrar(String palabra, int desplazamiento) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < palabra.length(); i++){
			sb.append(cifrar(palabra.charAt(i),desplazamiento));
		}
		return sb.toString();	
	}
	
	public static int obtenertNivelCifrado(String palabra1, String palabra2) {
		int desplazamiento = -1;
		boolean equivalentes = false;
		
		while(!equivalentes && desplazamiento < ABECEDARIO.length()) {
			desplazamiento ++;
			equivalentes = palabra2.equalsIgnoreCase(cifrar(palabra1,desplazamiento));
			
		}
			
		return equivalentes?desplazamiento:-1;
	}
}
