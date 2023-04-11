package com.edu;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Hola mundo con syso+ctrl+espacio");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce su nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Introduce su apellido: ");
		String apellido = sc.nextLine();
		System.out.println("Introduce tu edad: ");
		int edad = 89;
		System.out.println(edad);
		edad ++;
		System.out.println(edad);
		edad += 9;
		System.out.println(edad);
		System.out.println("Buenos días " + nombre + " " + apellido + " tienes " + edad + " años.");
		
	}
	

}
