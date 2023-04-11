package sieteMedia;

import java.util.Arrays;
import java.util.Scanner;

import sieteMedia.model.Baraja;
import sieteMedia.model.Carta;
import sieteMedia.model.Palo;

public class Main {

	public static void main(String[] args) {
		Carta c;
		try {
			c = new Carta(7,Palo.COPAS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Baraja baraja = new Baraja();
		System.out.println(baraja);
		baraja.barajar();
		Scanner sc = new Scanner(System.in);
		String sn = null;
		double valorJugador = 0.0;
		double valorBanca = 0.0;
		do {
			System.out.println("¿Quieres cartas jugador? s/n:");
			sn = sc.nextLine().toLowerCase();
			
			if(sn.equals("s")) {
				Carta carta = baraja.getSiguiente();
				System.out.println(carta);
				valorJugador += carta.getValor();
			}if(valorJugador > 7.5) {
				sn = "n";
			}
			
		}while(sn.equals("s")); 
		
		do {
			System.out.println("¿Quieres cartas banca? s/n:");
			sn = sc.nextLine().toLowerCase();
			
			if(sn.equals("s")) {
				Carta carta = baraja.getSiguiente();
				System.out.println(carta);
				valorBanca += carta.getValor();
			}if(valorBanca > 7.5) {
				sn = "n";
			}
			
		}while(sn.equals("s"));
		
		if(valorJugador == valorBanca)  { //Gana banca empate
			System.out.println("Empate, gana banca " + valorBanca);
		}else if(valorBanca > 7.5 && valorJugador > 7.5) {
			System.out.println("Gana banca, se han pasado los dos " + valorBanca);
		}else if(valorJugador <= 7.5 && valorBanca > 7.5){ //Gana jugador por 7.5 y banca se pasa
			System.out.println("Gana jugador banca se pasa " + valorBanca);
		}else if(valorBanca <= 7.5 && valorJugador > 7.5) {
			System.out.println("Gana banca jugador se pasa " + valorJugador);//Gana banca por 7.5 y jugador se pasa
		}else if(valorBanca > valorJugador) {
			System.out.println("Gana banca " + valorBanca);
		}else if(valorJugador > valorBanca) {
			System.out.println("Gana jugador " + valorJugador);
		}

	}	
}
	

