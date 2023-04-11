package arrays.cartas;

import java.util.Arrays;
import java.util.Random;

public class Cartas {

	private Random azar = new Random();
	final static String[] nombreCartas = {"oros","espadas","copas","bastos"};
	final static int[] numerosPosibleCartas = {1,2,3,4,5,6,7,8,9,10,11,12};
	
	String[] jugador1 = new String[1];
	String[] jugador2 = new String[1];
	
	public Cartas(int cantidadCartas) {	
		this.jugador1 = new String[cantidadCartas];
		this.jugador2 = new String[cantidadCartas];

	}
	
	public void repartoDeCartasJugadores() {
		for(int i = 0; i < jugador1.length; i++) {
			jugador1[i] = numerosPosibleCartas[azar.nextInt(numerosPosibleCartas.length)] + " de " + nombreCartas[azar.nextInt(nombreCartas.length)];
			jugador2[i] = numerosPosibleCartas[azar.nextInt(numerosPosibleCartas.length)] + " de " + nombreCartas[azar.nextInt(nombreCartas.length)];
		}
	}
	
	public void comprobarRepetidasEnCadaMano() {
		for(String uno:jugador1) {
			for(int i = 0; i < jugador1.length;i++) {
				if(uno.equals(jugador1[i])) {
					jugador1[i] = numerosPosibleCartas[azar.nextInt(numerosPosibleCartas.length)] + " de " + nombreCartas[azar.nextInt(nombreCartas.length)];
				}
			}
		}for(String dos:jugador2) {
			for(int i = 0; i < jugador2.length;i++) {
				if(dos.equals(jugador2[i])) {
					jugador2[i] = numerosPosibleCartas[azar.nextInt(numerosPosibleCartas.length)] + " de " + nombreCartas[azar.nextInt(nombreCartas.length)];
				}
			}
		}
	}

	@Override
	public String toString() {
		return "Cartas del jugador 1:\n" + Arrays.toString(jugador1) + "\nCartas del jugador 2:\n" + Arrays.toString(jugador2) ;
	}
	
	

	
	

}
