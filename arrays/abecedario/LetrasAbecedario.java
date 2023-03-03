package arrays.abecedario;

import java.util.Arrays;

public class LetrasAbecedario {

	final static private String ABECEDARIO = "abcdefghijklmnñopqrstuvwxyz" ;

	private int[] contadores = new int[ABECEDARIO.length()];

	public void vecesLetraEnFrase(String frase) {
		for(int i = 0; i < frase.length(); i++) {
			if(ABECEDARIO.indexOf(frase.charAt(i)) != -1) {
				String posicionString = String.valueOf(ABECEDARIO.indexOf(frase.charAt(i)));
				contadores[Integer.valueOf(posicionString)] ++;
			}
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < ABECEDARIO.length(); i++) {
			if(contadores[i] >= 1) {
				sb.append("La letra " + ABECEDARIO.charAt(i) + " aparace: " + contadores[i] + " veces\n");
			}	
		}
		return sb.toString();
	}
	
	

}
