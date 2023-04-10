package sieteMedia.model;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Baraja {

	private final static int MAX_SIZE = 40;
	private Carta[] cartas;
	private Random azar = new Random();
	private int siguiente;
	
	public Baraja() {
		this.cartas = new Carta[MAX_SIZE];
		this.siguiente = 0;
		int posicion = 0;
		for(Palo p:Palo.values()) { //recorremos los palos
			for(int i = 1; i < 13 ; i++) { //recorremos los valores
				if(i != 8 && i != 9) { //limitamos valores válidos
					try {
						this.cartas[posicion++] = new Carta(i,p); //creamos carta asignada a la posicion	
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	public void barajar() {
		int tmpPosicionAnterior = 0;
		int tmpPosicionSiguiente = 0;
		Carta tmpCartaSiguiente = null;
		Carta tmpCartaAnterior = null;
		for(int i = 0; i < cartas.length; i++) {
			tmpPosicionAnterior = generarNumero();
			tmpCartaAnterior = this.cartas[tmpPosicionAnterior];
			
			tmpPosicionSiguiente = generarNumero();
			tmpCartaSiguiente = this.cartas[tmpPosicionSiguiente];
			
			this.cartas[tmpPosicionAnterior] = tmpCartaSiguiente;
			this.cartas[tmpPosicionSiguiente] = tmpCartaAnterior;
		}
		
	}
	
	public Carta getSiguiente() {
		return this.cartas[siguiente++];
	}
	
	private int generarNumero() {
		return ThreadLocalRandom.current().nextInt(0,MAX_SIZE);
	}

	@Override
	public String toString() {
		return Arrays.toString(cartas) ;
	}
	
	

}
