package enums.model;

import java.util.Arrays;

import sieteMedia.comparables.ComparablePaloCarta;
import sieteMedia.model.Carta;
import sieteMedia.model.Palo;

public class MainPruebaCompareToComparable {

	public static void main(String[] args) throws Exception {
		Carta[] cartas = new Carta[3];
		cartas[0] = new Carta(3,Palo.OROS);
		cartas[1] = new Carta(1,Palo.ESPADAS);
		cartas[2] = new Carta(5,Palo.COPAS);		
		System.out.println("Comparable por numero: ");
		Arrays.sort(cartas);
		System.out.println(Arrays.toString(cartas));
		System.out.println("Comparable por palo: ");
		Arrays.sort(cartas,new ComparablePaloCarta());
		System.out.println(Arrays.toString(cartas));
	}

}
