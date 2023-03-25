package arrays;

import java.util.Arrays;
import java.util.Scanner;

import arrays.abecedario.LetrasAbecedario;
import arrays.alumnos.NotasAlumnos;
import arrays.calculos.CalculoUtils;
import arrays.cartas.Cartas;
import arrays.fecha.Fecha;


public class Main {

	public static int[] desplazarNumerosDerecha(int[] numeros) {
		int ultimo = numeros[numeros.length-1];
		
		for(int i = numeros.length-2; i>=0; i--) {
			numeros[i+1] = numeros[i];
		}
		numeros[0] = ultimo;
		
		return numeros;
	}
	public static int[] desplazarNumerosIzquierda(int[] numeros) {
		int primero = numeros[0];
		
		for(int i = 1; i<numeros.length; i++) {
			numeros[i-1] = numeros[i];
		}
		numeros[numeros.length-1] = primero;
		
		return numeros;
	}
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

		System.out.println(Arrays.toString(numeros2)+ "- Vector original");
		
		System.out.println(Arrays.toString(desplazarNumerosDerecha(numeros2)) + "- Vector desplazado");
 		System.out.println("----Separación-----");
		//Ejercicio 3

		int [] num = {1,8,9,19,18,29};
		CalculoUtils c = new CalculoUtils(num);
		System.out.println(c.computeAverage());
 		System.out.println(c.filtrarPorDigitoFinal('9'));
 		System.out.println(c.obtenerMasRepetido());
 		//Ejercicio 4
 		
 		/*System.out.println("Introduce el dia de la fecha: ");
 		int dia = Integer.valueOf(sc.nextLine());
 		System.out.println("Introduce el mes de la fecha: ");
 		int mes = Integer.valueOf(sc.nextLine());
 		System.out.println("Introduce el año de la fecha: ");
 		int annio = Integer.valueOf(sc.nextLine());
 		Fecha f = new Fecha(dia,mes,annio);
 		System.out.println(f);
 		*/
 		
 		//Ejercicio 5
 		
 		/*System.out.println("¿Cuántas cartas en reparto?: ");
 		Cartas c2 = new Cartas(Integer.valueOf(sc.nextLine()));
 		c2.repartoDeCartasJugadores();
 		c2.comprobarRepetidasEnCadaMano();
 		//Me falta que en ambas manos las cartas no se repitan...
 		System.out.println(c2);
 		*/
 		System.out.println("----Separación-----"); 		
 		//Ejercicio 6
 		LetrasAbecedario l = new LetrasAbecedario();
 		l.vecesLetraEnFrase("jesus lopez gomez");
 		System.out.println(l);
 		System.out.println("----Separación-----"); 		
 		//Ejercicio 7
 		//Este ejercicio esta realizado en el main de alumnos
 		
 		//Ejercicio 8
	}

}
