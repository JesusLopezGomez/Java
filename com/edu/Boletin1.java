package com.edu;

import java.util.Scanner;

public class Boletin1 {
	public static double calcularAreaCirculo(double radio) {
		return (radio*radio)*(Math.PI);
	}
	public static double calcularLongitudCirculo(double radio2) {
		return 2*3.1416*radio2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("Ejercicio 1 - Introduce un número:");
		int numero1 = Integer.valueOf(sc.nextLine());
		System.out.println("Ejercicio 1 - Introduce otro número:");
		int numero2 = Integer.valueOf(sc.nextLine());
		if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		System.out.println("Ejercicio 2 - Introduce un día de la semana: ");
		String dia = sc.nextLine();
		switch(dia.toLowerCase()) {
			case "lunes":{
				System.out.println("Base de datos");
				break;
			}case "martes","miercoles","viernes":{
				System.out.println("Programación");
				break;
			}case "jueves":{
				System.out.println("Fol");
				break;
			}
			default:{
				System.out.println("Introduce un día correcto");
				break;
			}
		}
		
		System.out.println("Ejercicio 3 - Introduce un cáracter: ");
		String caracterRecibir = sc.nextLine();
		char c = caracterRecibir.charAt(0);
		
		if(c == 32) {
			System.out.println(c + " es un espacio en blanco.");
		}else if ((c == 40 || c == 41) || (c == 123 || c == 125)) {
			System.out.println(c + " es un parentesis o una llave.");
		}else if(c >= 33 && c <=47) {
			System.out.println(c + " es un simbolo de puntuación.");
		}else if(Character.isLowerCase(c)) {
			System.out.println(c + " es una letra minuscula.");
		}else if(Character.isUpperCase(c)) {
			System.out.println(c + " es una letra mayúscula.");
		}else if(Character.isDigit(c)) {
			System.out.println(c + " es un dígito de 0 al 9.");
		}else{
			System.out.println(c+ " es otro caracter.");
		}
		
		System.out.println("Ejercicio 4 - Calcular calificaciones ");
		
		
		
		System.out.println("Introduce la nota de la parte práctica: ");
		Double notaPractica = Double.valueOf(sc.nextLine());
		while(notaPractica < 0 || notaPractica > 10) {
			System.out.println("Introduce la nota de la parte práctica correctamente: ");
			notaPractica = Double.valueOf(sc.nextLine());
		}
			
		System.out.println("Introduce la nota de la parte de problemas: ");
		Double notaProblemas = Double.valueOf(sc.nextLine());
		while(notaProblemas < 0 || notaProblemas > 10) {
			System.out.println("Introduce la nota de la parte de problemas correctamente: ");
			notaProblemas = Double.valueOf(sc.nextLine());
		}
			
		System.out.println("Introduce la nota de la parte teóricas: ");
		Double notaTeorica = Double.valueOf(sc.nextLine());
		while(notaTeorica < 0 || notaTeorica > 10) {
			System.out.println("Introduce la nota de la parte teórica correctamente: ");
			notaTeorica = Double.valueOf(sc.nextLine());
		
		}
		Double notaFinal = notaPractica * 0.10 + notaProblemas * 0.5 + notaTeorica * 0.4;
		
		System.out.println("La media de todos los anteriores problemas es: " + notaFinal + " lo que equivale a un:  ");
		
		if(notaFinal < 5.0) {
			System.out.println("Insuficiente");
		}else if(notaFinal >= 5.0 && notaFinal < 6.0) {
			System.out.println("Suficiente");
		}else if(notaFinal >= 6.0 && notaFinal < 7.0) {
			System.out.println("Bien");
		}else if(notaFinal >= 7.0 && notaFinal < 9.0) {
			System.out.println("Notable");
		}else if(notaFinal >= 9.0 && notaFinal <= 10.0) {
			System.out.println("Sobresaliente");
		}
		
		System.out.println("Ejercicio 5 - Buenos/Tardes-Días-Noches  ");
		
		System.out.println("Introduce la hora actual en el formato 24h: ");
		
		int hora = Integer.valueOf(sc.nextLine());
		
		if(hora >= 6 && hora <= 12) {
			System.out.println("Hola, buenos días");
		}else if(hora >= 13 && hora <= 20){
			System.out.println("Hola, buenas tardes");
		}else if(hora >= 21 && hora <= 5) {
			System.out.println("Hola, buenas noches");
		}else {
			System.out.println("Introduce la hora de nuevo correctamente");
		}
		
		System.out.println("Ejercicio 6 - Sistema de calefacción");
		
		System.out.println("Introduce el número del mes actual: ");
		int mes = Integer.valueOf(sc.nextLine());
		
		System.out.println("Introduce el día actual: ");
		int dia2 = Integer.valueOf(sc.nextLine());
		
		if ((mes == 3 && dia2 >= 20) || (mes == 6 && dia2 <= 21) || (mes == 4) || (mes == 5))  {
			System.out.println("Primavera, calecfacción a 20 grados.");
		}else if((mes == 6 && dia2 >= 21) || (mes == 9 && dia2 <= 23) || (mes == 7) || (mes == 8))  {
			System.out.println("Verano, calecfacción a 24 grados.");
		}else if((mes == 9 && dia2 >= 23) || (mes == 12 && dia2 <= 21) || (mes == 10) || (mes == 11)) {
			System.out.println("Otoño, calefacción a 19 grados.");
		}else if ((mes == 12 && dia2 >= 21) || (mes == 3 && dia2 <= 20) || (mes == 1) || (mes == 2)) {
			System.out.println("Invierno, calecfacción a 19 grados.");
		}
		
		System.out.println("Ejercicio 7 - Secuencias númericas");
		
		System.out.println("a. Crea un método que muestre los números del 1 al 100");
		
		int contA = 0;
		int contDoA = 0;
		
		while (contA < 100) {
			contA ++;
			System.out.println(contA);
		}
		
		do {
			contDoA ++;
			System.out.println(contDoA);
		}while (contDoA < 100);
			contDoA ++;
			
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
		
		System.out.println("b. Repite el ejercicio anterior, pero en formato descendente, es decir, del 100 al 1.");
		
		int contB = 101;
		int contDoB = 101;
		
		while (contB > 0) {
			contB --;
			System.out.println(contB);
		}
		
		do {
			contDoB --;
			System.out.println(contDoB);
		}while (contDoA > 0);
			contDoB --;
		
		for (int i = 100; i > 0; i--) {
			System.out.println(i);
		}
		
		System.out.println("c. Crea un programa que calcule y escriba los números múltiplos de 5 de 0 a 100.");
		
		int contC = 0;
		int multiplos = 0;
		
		while(multiplos < 100) {
			contC ++;
			multiplos = contC *5;
			System.out.println(multiplos);
		}
		
		
		int contCdo = 0;
		int multiplosDo = 0;
		
		do {
			contCdo ++;
			multiplosDo = contCdo *5;
			System.out.println(multiplosDo);
		}while (multiplosDo < 100);
			contCdo ++;
			
			
		int multiplosFor = 0;
		
		for (int i = 1; i < 21; i++) {
			multiplosFor = i*5;
			System.out.println(multiplosFor);
		}
		
		System.out.println("d. Escribe los números del 320 al 160, contando de 20 en 20 hacia atrás.");
		
		int contD = 320;
		
		while (contD > 160) {
			contD -= 20;
			System.out.println(contD);
		}
		
		int contDdo = 320;
		
		do {
			contDdo -= 20;
			System.out.println(contDdo);
		}while(contDdo > 160);
			contDdo --;
			
			
		for (int i = 320; i > 159 ; i -= 20 ) {
			System.out.println(i);
		}
		
		
		System.out.println("Ejercicio 8 - Método que pida 15 números y realice su suma.");
		
		int suma = 0;
		for(int i = 0; i < 15 ; i++) {
			System.out.println("Introduce un número: ");
			suma += Integer.valueOf(sc.nextLine());
			
		}System.out.println("La suma de todos los números introducidos es: " + suma);
		
		
		System.out.println("Ejercicio 9 - Método que pida 5 números e imprima si alguno es múltiplo de 3");
		
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Introduce un número:");
			int numero = Integer.valueOf(sc.nextLine());
			if(numero % 3 == 0) {
				System.out.println("El número: " + numero + " es múltiplo de 3." );
			}
		}
		
		System.out.println("Ejercicio 10 - Realiza un programa que sume los 100 números siguientes a un número entero y\n"
				+ "positivo introducido por teclado. Se debe comprobar que el dato introducido es\n"
				+ "correcto (que es un número positivo).");
		
		System.out.println("Introduce un número: ");
		
		int num = Integer.valueOf(sc.nextLine());
		
		while(num < 0) {
			System.out.println("Introduce un número positivo: ");
			num = Integer.valueOf(sc.nextLine());
		}
		
		int suma = 0;
		for(int i = num; i < num + 100; i++) {
			suma += i;
			
		}System.out.println(suma);
		
		System.out.println("Ejercicio 11 - Realiza un programa que pida números y muestre su cuadrado, repitiendo el\n"
				+ "proceso hasta que se introduzca un número negativo.");
		
		System.out.println("Introduce número :");
		int num1 = Integer.valueOf(sc.nextLine());
		
		while(num1 > 0) {
			System.out.println("El cuadrado de: " + num1 +" es: " + num1*num1);
			System.out.println("Introduce número :");
			num1 = Integer.valueOf(sc.nextLine());
		}
		
		System.out.println("Ejercicio 12 - Realiza un programa que pida números hasta que se teclee uno negativo y muestre\n"
				+ "cuántos números se han introducido.");
		
		System.out.println("Introduce número: ");
		int num2 = Integer.valueOf(sc.nextLine());
		int cont = 0;
		
		while (num2 > 0) {
			cont ++;
			System.out.println("Introduce número: ");
			num2 = Integer.valueOf(sc.nextLine());
			
		}System.out.println("Se han introducido: " + cont + " números.");
		
		System.out.println("Ejercicio 13 - Programa que reciba 10 números y nos indique el valor máximo y mínimo.");
		
		int cont1 = 0;
		System.out.println("Introduce número: ");
		int num3 = Integer.valueOf(sc.nextLine());
		int max = num3;
		int min = num3;
		
		while(cont1 < 9) {
			cont1 ++;
			System.out.println("Introduce número: ");
			num3 = Integer.valueOf(sc.nextLine());
			if (num3 > max) {
				max = num3;
			}else if(num3 < min) {
				min = num3;
			}
		}System.out.println("El mayor número introducido es: " + max + ", el número menor es: " + min);
		
		System.out.println("Ejercicio 14 - Realiza un programa que vaya pidiendo números hasta que se introduzca un\n"
				+ "número negativo y nos diga cuántos números se han introducido, la media de los\n"
				+ "impares y el mayor de los pares. El número negativo sólo se utiliza para indicar el\n"
				+ "final de la introducción de datos pero no se incluye en el cómputo.");
		
		System.out.println("Introduce número: ");
		int num4 = Integer.valueOf(sc.nextLine()); 
		int cuantosNumeros = 0;
		int cuantosNumerosImpares = 0;
		int mayorDePares = 0;
		int sumaImpares = 0;
		
		while(num4 > 0) {
			cuantosNumeros ++;
			if(num4 % 2 != 0) {
				cuantosNumerosImpares ++;
				sumaImpares += num4;
			}else if((num4 % 2 == 0) && (num4 > mayorDePares))  {
				mayorDePares = num4;
			}System.out.println("Introduce número: ");
			num4 = Integer.valueOf(sc.nextLine()); 
		}System.out.println("Se han introducido: " + cuantosNumeros + " números, la media de los números impares es: " + sumaImpares/cuantosNumerosImpares + " ,y el mayor de los pares es: " + mayorDePares);
		
		System.out.println("Ejercicio 15 - Crea un programa que permita sumar N números. El usuario decide cuándo termina\n"
				+ "de introducir números al indicar la palabra ‘fin’.");
		
		String valorIntroducido = "";
		int numero = 0;
		int suma = 0;
		
		while(!valorIntroducido.equals("fin")){
			System.out.println("Introduce número: ");
			valorIntroducido = sc.nextLine();
			if(!valorIntroducido.equals("fin")) {
				numero = Integer.valueOf(valorIntroducido);
				suma += numero;
			}
			
		}System.out.println("La suma de todos los números introducido es: " + suma);
		
		System.out.println("Ejercicio 16 - Pedir 10 valores numéricos que representan el salario mensual de 10 empleados.\n"
				+ "Mostrar su suma y cuantos hay mayores de 1000€.");
		System.out.println("Introduce su salario: ");
		int salario = Integer.valueOf(sc.nextLine());
		int cont = 0;
		int sumaSalario = 0;
		int totalMayores = 0;
		while (cont < 10) {
			cont ++;
			if(salario > 1000) {
				totalMayores ++;
			}
			sumaSalario += salario;
			System.out.println("Introduce su salario: ");
			salario = Integer.valueOf(sc.nextLine());
		}System.out.println("La suma de todos los salarios es: " + sumaSalario + ", y hay: " + totalMayores + " salarios mayores que 1000.");
		
		
		System.out.println("Ejercicio 17 - Escribe un programa que muestre los N primeros términos de la serie de Fibonacci.\n"
				+ "El primer término de la serie de Fibonacci es 1, el segundo es 1 y el resto se calcula\n"
				+ "sumando los dos anteriores, por lo que tendríamos que los términos son 1, 1, 2, 3, 5,\n"
				+ "8, 13, 21, 34, 55, 89, 144.");
		
		System.out.println("Introduce número la cantidad de número de la serie fibonacci que quieres que aparezca: ");
		int numero = Integer.valueOf(sc.nextLine());
		int num = 0;
		int num1 = 1;
		int suma = 1;
		for(int i = 1; i <= numero; i ++) {
			System.out.println(suma);
			suma = num + num1;		
			num = num1;
			num1 = suma;
		}*/
		
		System.out.println("Ejercicio 18 - Realizar un método llamado calcularAreaCirculo que devuelva el área de un círculo\n"
				+ "y otro llamado calcularLongitudCirculo que devuelva su longitud.");
		
		System.out.println(calcularAreaCirculo(3.0));
		System.out.println(calcularLongitudCirculo(3.0));
		
		
	}
}



