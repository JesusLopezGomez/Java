package com.mockExamn;

import java.util.Arrays;
import java.util.Scanner;

import com.mockExamn.model.Plato;
import com.mockExamn.model.Vino;

public class Main {

	public static int posicionPlato(Plato[] plato,String nombre) {
		int posicion = -1;
		
		for(int i = 0; i < plato.length && posicion == -1; i++) {
			if(plato[i] != null && plato[i].getNombre().equals(nombre)) {
				posicion = i;
			}
		}
		return posicion;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Plato[] platos = new Plato[10];
		int contPlato = 0;
	
		
		int opcion = 0;
		
		while(opcion != 6) {
		
			System.out.println("Introduce una opción: ");
			opcion = Integer.valueOf(sc.nextLine());
		
			if(opcion == 1) {
				System.out.println("Introduce el nombre del plato: ");
				String nombre = sc.nextLine();
				System.out.println("Introduce el precio del plato: ");
				double precio = Double.valueOf(sc.nextLine());
				
				if(posicionPlato(platos,nombre) != -1) {
					System.out.println("Error,el plato ya existe");
				}else {
					platos[contPlato%platos.length] = new Plato(nombre,precio);
					contPlato ++;
					System.out.println("Plato guardado!");
				}
			}else if(opcion == 2) {
				System.out.println("Introduce el nombre del plato");
				String nombre = sc.nextLine();
				
				if(posicionPlato(platos,nombre) != -1) {
					
					System.out.println("Introduce el nuevo precio del plato: ");
					double precio = Double.valueOf(sc.nextLine());
					platos[posicionPlato(platos,nombre)].setPrecio(precio);
					
				}else {
					System.out.println("Error,el plato no existe");
				}
			}else if(opcion == 3) {
				System.out.println("Introduce el nombre del plato: ");
				String nombre = sc.nextLine();
				if(posicionPlato(platos,nombre) != -1) {
					
					System.out.println("Introduce el nombre del vino: ");
					String nombreVino = sc.nextLine();
					System.out.println("Introduce la graduación del vino: ");
					double graduacionVino = Double.valueOf(sc.nextLine());
					platos[posicionPlato(platos,nombre)].setVinoRecomendado(nombreVino, graduacionVino);
					System.out.println("Vino guardado!");
				
				}else {
					System.out.println("Error,el plato no existe");
	
				}
				
			}else if(opcion == 4) {
				System.out.println("Introduce el nombre del plato");
				String nombre = sc.nextLine();
				
				if(posicionPlato(platos,nombre) != -1) {
					System.out.println(platos[posicionPlato(platos,nombre)]);
				}else {
					System.out.println("Error,el plato no existe");
				}
			}else if(opcion == 5) {
				for(int i = 0; i < platos.length;i++) {
					if(platos[i] != null) {
						System.out.println(platos[i]);
					}
				}
			}
		}System.out.println("Finalizando...");
		
	}
	
}
