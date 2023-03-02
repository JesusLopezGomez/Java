package arrays;

import java.util.Arrays;
import java.util.Scanner;

import arrays.calculos.CalculosUtil;




public class Main {
	public static int[] desplazarNumeros(int[] numeros) {
		int tmp = numeros[1];
		for(int i = 0; i < numeros.length-1;i++) {
			numeros[i+1] = numeros[i];
			tmp = numeros[i+1];
			
		}
		
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
		
		System.out.println(Arrays.toString(desplazarNumeros(numeros2)) + "- Vector desplazado");
		
		
		//Ejercicio 3

		int [] num = {1,8,9};
		System.out.println(new CalculosUtil().obtenerMedia(num));
 		
		int numero11 = 352;
		String.valueOf(numero11);
		int sizeNumero = String.valueOf(numero11).length();
		String.valueOf(numero11).charAt(sizeNumero-1);
		
		
//		 do{
//			System.out.println("Introduce un número para finalizar introduzca 0: ");
//			numero = Integer.valueOf(sc.nextLine());
//			if(numero >= 1 && numero <= 1000 && numero != 0) {
//				contNumerosIntroducidos ++;
//				sumaNumerosIntroducidos += numero;
//				numeroCadena = String.valueOf(numero);
//				numeroUltimaPosicion = numeroCadena.substring(String.valueOf(numero).length(),String.valueOf(numero).length()+1);
//			}if(numeroUltimaPosicion.equals(0)) {
//				
//			}
//		}while(numero >= 1 && numero <= 1000 && numero != 0);
//		 System.out.println("La media de los números introducidos es de: " +  sumaNumerosIntroducidos/contNumerosIntroducidos);
//		 
	
	}

}
