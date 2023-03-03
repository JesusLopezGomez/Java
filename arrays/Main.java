package arrays;

import java.util.Arrays;
import java.util.Scanner;

import arrays.calculos.CalculosUtil;
import arrays.fecha.Fecha;

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

		System.out.println(Arrays.toString(numeros2)+ "- Vector original");
		
		System.out.println(Arrays.toString(new CalculosUtil().desplazarNumerosDerecha(numeros2)) + "- Vector desplazado");
		
		//Ejercicio 3

		int [] num = {1,8,9,19,18,29};
		System.out.println(new CalculosUtil().obtenerMedia(num));
 		System.out.println(new CalculosUtil().filtrarPorDigitoFinal(num, '9'));
 		System.out.println(new CalculosUtil().calcularDigitoMasTerminado(num));
 		 
 		//Ejercicio 4
 		
 		System.out.println("Introduce el dia de la fecha: ");
 		int dia = Integer.valueOf(sc.nextLine());
 		System.out.println("Introduce el mes de la fecha: ");
 		int mes = Integer.valueOf(sc.nextLine());
 		System.out.println("Introduce el año de la fecha: ");
 		int annio = Integer.valueOf(sc.nextLine());
 		Fecha f = new Fecha(dia,mes,annio);
 		System.out.println(f);
 		

	 
	
	}

}
