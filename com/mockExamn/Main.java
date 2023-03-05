package com.mockExamn;

import java.util.Arrays;
import java.util.Scanner;

import com.mockExamn.model.Plato;
import com.mockExamn.model.Vino;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Vino v = new Vino(16.65,"vino blanco");
		Vino v1 = new Vino(26.4,"vino loco");
		Vino v2 = new Vino(27.3,"vino portugues");
		Vino v3 = new Vino(32.65,"vino andaluz");

		Plato p = new Plato("Luna llena",19.00);
		
		System.out.println(p);
		
		String menu = "1. Dar de alta un plato\n2. Modificar el precio de un plato\n3. Asignar un vino a un plato\n4. Mostrar información de un plato\n5. Mostrar información de todos los platos\n6. Salir";
		
		int contador = 0;
		Plato[] nombrePlatos = new Plato[10];
		for(int i = 0; i < nombrePlatos.length; i++) {
			nombrePlatos[i] = new Plato("prueba",1);
		}
		
		Vino[] nombreVino = {v,v1,v2,v3};
		
		int opcion = 0;
		
		do {
			System.out.println(menu);
			System.out.println("Introduce una opcion: ");
			opcion = Integer.valueOf(sc.nextLine());
			
			if(opcion == 1) {
				
				System.out.println("Introduce el nombre del plato: ");
				String nombre = sc.nextLine();
				
				System.out.println("Introduce el precio del plato: ");
				double precioPlato = Double.valueOf(sc.nextLine());
				
				boolean esta = false;
				for(int i = 0; i < nombrePlatos.length && !esta;i++) {
					esta = nombrePlatos[i].getNombre().equalsIgnoreCase(nombre);
				}
				if(!esta) {
					nombrePlatos[contador] = new Plato(nombre,precioPlato);
					contador ++;
				}else {
					System.out.println("El plato ya existe");
				}
				
			}else if(opcion == 2){
				System.out.println("Introduzca el nombre del plato para cambiar el precio");
				String nombre = sc.nextLine();
				boolean esta = false;
				int posicion = 0;
				for(int i = 0; i < nombrePlatos.length && !esta;i++) {
					esta = nombrePlatos[i].getNombre().equalsIgnoreCase(nombre);
					if(esta) {
						posicion = i;
					}
				}
				
				if(esta) {
					System.out.println("Introduzca el nuevo precio del plato:");
					double precioPlato = Double.valueOf(sc.nextLine());
					nombrePlatos[posicion].setPrecio(precioPlato);
				}else {
					System.out.println("Error, el plato no existe");
				}

			}else if(opcion == 3) {
				System.out.println("Introduce el nombre del plato: ");
				String nombre = sc.nextLine();
				boolean estaPlato = false;
				for(int i = 0; i < nombrePlatos.length && !estaPlato;i++) {
					estaPlato = nombrePlatos[i].getNombre().equalsIgnoreCase(nombre);
					
				}if(estaPlato) {
					System.out.println("Introduce el nombre del vino:");
					String nombreV = sc.nextLine();
					System.out.println("Introduce la graduacion del vino: ");
					double graduacionV = Double.valueOf(sc.nextLine());
					boolean estaVino = false;
					for(int i = 0; i < nombreVino.length && !estaVino;i++) {
						estaVino = nombreVino[i].getNombre().equalsIgnoreCase(nombreV) && nombreVino[i].getGraduacion()==graduacionV ;
					}if(estaPlato && estaVino) {
						System.out.println("Vino asignado al plato.");
					}else {
						System.out.println("Error el vino no existe.");
					}
				}else {
					System.out.println("Error el plato no existe.");
				}
			}else if(opcion == 4) {
				System.out.println("Introduzca el nombre del plato para cambiar el precio");
				String nombre = sc.nextLine();
				boolean esta = false;
				int posicion = 0;
				for(int i = 0; i < nombrePlatos.length && !esta;i++) {
					esta = nombrePlatos[i].getNombre().equalsIgnoreCase(nombre);
					if(esta) {
						posicion = i;
					}
				}
				
				if(esta) {
					System.out.println(nombrePlatos[posicion]);;
				}else {
					System.out.println("Error, el plato no existe");
				}
			}else if(opcion == 5) {
				System.out.println(Arrays.toString(nombrePlatos));
			}
			
		}while(opcion != 6);
	}
}
