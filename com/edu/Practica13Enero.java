package com.edu;

import java.util.Scanner;

public class Practica13Enero {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un dia de la semana:");
		int dia = Integer.valueOf(sc.nextLine());
		
		switch (dia) {
		case 1:{
			System.out.println("Lunes");
			break;
		}case 2: {
			System.out.println("Martes");
			break;
		}case 3: {
			System.out.println("Miércoles");
			break;
		}case 4: {
			System.out.println("Jueves");
			break;
		}case 5: {
			System.out.println("Viernes");
			break;
		}case 6: {
			System.out.println("Sábado");
			break;
		}case 7: {
			System.out.println("Domingo");
			break;
		}default:
			System.out.println("El día introducido no es válido.");
			break;
		}
		
		//numero par o impar con while
		  int numero = 0; 
		  do{ 
			  System.out.println("Introduzca un número:"); 
			  numero =Integer.valueOf(sc.nextLine()); 
			  if(numero%2==0) {
				  System.out.println("El número: " + numero + " es par.");
			  }else {
				  System.out.println("El número: " + numero + " es impar."); 
		  }
		  }while(numero>0);
		  
		 
		//numero par o impar con for
		  for (;numero>0;) {
			  System.out.println("Introduzca un número: "); 
			  numero = Integer.valueOf(sc.nextLine()); 
			  if(numero%2==0) {
				  System.out.println("El número: " + numero + " es par."); 
			  }else {
				  System.out.println("El número: " + numero + " es impar."); 
				  } 
			  }
		//fibonacci 
		int serie = 14, num1 = 0, num2 = 1, suma = 1;        
		System.out.println(num1);
		for (int i = 1; i < serie; i++) {
		    System.out.println(suma);

		    suma = num1 + num2;
		    num1 = num2;
		    num2 = suma;
		}
	}

}
