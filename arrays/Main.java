package arrays;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Ejercicio 1
		Scanner sc = new Scanner(System.in);
		/*
		int numeros[] = new int[10];
		for(int i = 0; i < numeros.length ; i++) {
			System.out.println("Introduce un número entero:");
			numeros[i] = Integer.valueOf(sc.nextLine());
		}for(int i = numeros.length-1; i >= 0; i--) {
			System.out.println(numeros[i]);
		}
		*/
		//Ejercicio 2
		int numeros2[] = {5,10,2,30,4,15,6,88,3,9};
		StringBuilder vectorOriginal = new StringBuilder();
		StringBuilder vectorDesplazado = new StringBuilder();
		//for(int i = 0; i < numeros2.length; i++) {
			//System.out.println("Introduce el número de la posición " + (i+1) +"/10:");
		//}

		for(int j = 0; j < numeros2.length; j++) {
			
			vectorDesplazado.append(numeros2[j]);
		}System.out.println(vectorOriginal.toString());
		System.out.println(vectorDesplazado.toString());
		
	}

}
