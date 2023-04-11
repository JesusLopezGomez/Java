package com.edu;

import java.util.Scanner;

// Tipo primitivo --> minusculas, int, byte, long, char...

public class ejemplo12enero {
	
	static int temperatura;
	static String nombre;
	static char c=99;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		byte temp = (byte)temperatura;
		System.out.println(temperatura);
		System.out.println(temp);
		// Al ser diferentes tipos, tienen limites y si se pasa de un número a otro perdemos datos.
		System.out.println(c);
		
		//Ejercicio puerta abierta o cerrada
		System.out.println("abierta = true - cerrado = false, introduce como se encuentra la puerta:");
		boolean abierto = Boolean.valueOf(sc.nextLine());
		
		if (abierto) {
			System.out.println("Puede pasar.");
		}else {
			System.out.println("En otra ocasión.");
		}
		
		//Ejercicio dias de la semana
		System.out.println("Introduce un día con su numero:");
		int dia = Integer.valueOf(sc.nextLine());
		
		if (dia == 1) {
			System.out.println("Lunes");
		}else if(dia == 2) {
			System.out.println("Martes");
		}else if (dia == 3) {
			System.out.println("Miércoles");
		}else if (dia == 4) {
			System.out.println("Jueves");
		}else if(dia == 5) {
			System.out.println("Viernes");
		}else if(dia == 6) {
			System.out.println("Sábado");
		}else if(dia == 7) {
			System.out.println("Domingo");
		}else {
			System.out.println("Introduce un dia correcto.");
		}
		
		//Ejercicio mayor de edad
		System.out.println("Introduce tu edad: ");
		int edad = Integer.valueOf(sc.nextLine());
		
		if (edad >= 18) {
			System.out.println("Eres mayor de edad.");
		}else {
			System.out.println("No eres mayor de edad");
		}
		
		//Niño,Adulto,Anciano
		
		if(edad < 18){
			System.out.println("Eres niño");
		}else if(edad >= 18 && edad < 65) {
			System.out.println("Eres adulto.");
		}else if (edad >= 65) {
			System.out.println("Eres anciano");
		}
		
		//Día, mes
		
		System.out.println("Introduce un año: ");
		int año = Integer.valueOf(sc.nextLine());
		
		System.out.println("Introduce un mes: ");
		int mes = Integer.valueOf(sc.nextLine());
		
		boolean bisiesto = false;
		
		if((año % 4 == 0 && año % 100 == 0) || (año % 400 == 0)); 
			bisiesto = true;
		
		if(mes == 1) {
			System.out.println("El mes tiene 31 días.");
		}else if(mes == 2) {
			if (bisiesto == true) {
				System.out.println("El mes tiene 28 días.");
			}else {
				System.out.println("El mes tiene 29 días.");
			}
		}else if(mes == 3) {
			System.out.println("El mes tiene 31 días.");
		}else if(mes == 4) {
			System.out.println("El mes tiene 30 días.");
		}else if(mes == 5) {
			System.out.println("El mes tiene 31 días.");
		}else if(mes == 6) {
			System.out.println("El mes tiene 30 días.");
		}else if(mes == 7) {
			System.out.println("El mes tiene 31 días.");
		}else if(mes == 8) {
			System.out.println("El mes tiene 31 días.");
		}else if(mes == 9) {
			System.out.println("El mes tiene 30 días.");
		}else if(mes == 10) {
			System.out.println("El mes tiene 31 días.");
		}else if(mes == 11) {
			System.out.println("El mes tiene 30 días.");
		}else if(mes == 12) {
			System.out.println("El mes tiene 31 días.");
		}else {
			System.out.println("Introduce un mes correcto.");
		}
		
		switch (mes) {
		case 1:{
			System.out.println("El mes tiene 31 días.");
			break;
		}case 2:{
			if (bisiesto == true) {
				System.out.println("El mes tiene 28 días.");
			}else {
				System.out.println("El mes tiene 29 días.");
			}
			break;
		}case 3:{
			System.out.println("El mes tiene 31 días.");
			break;
		}case 4:{
			System.out.println("El mes tiene 30 días.");
			break;
		}case 5:{
			System.out.println("El mes tiene 31 días.");
			break;
		}case 6:{
			System.out.println("El mes tiene 30 días.");
			break;
		}case 7:{
			System.out.println("El mes tiene 31 días.");
			break;
		}case 8:{
			System.out.println("El mes tiene 31 días.");
			break;
		}case 9:{
			System.out.println("El mes tiene 30 días.");
			break;
		}case 10:{
			System.out.println("El mes tiene 31 días.");
			break;
		}case 11:{
			System.out.println("El mes tiene 30 días.");
			break;
		}case 12:{
			System.out.println("El mes tiene 31 días.");
			break;
		}default:
			System.out.println("Introduce un mes correcto.");
			break;
		}
	}

}
