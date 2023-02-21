package com.ej1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Avion a = new Avion();
		int opcion = 2;
		String opcion2 = "";
		String identificador = "";
		String companyia = "";
		String companyiaAntigua = "";
		String companyiaNueva = "";
		int capacidad = 0;
		int capacidadVuelo = 0;
		double kmVuelo = 0.0;
		Scanner sc = new Scanner(System.in);
		String menu1 = "----------------------Menú-----------------------\n1. Crear avión sólo con el identificador.\n2. Crear avión con el identificador y la compañía.\n----------------------Menú-----------------------";
		String menu2 = "----------------------Menú-----------------------\na. Asignar Vuelo\nb. Obtener el número de vuelos\nc. Obtener el número de kilómetros\nd. Obtener la media de kilómetros por vuelo\ne. Cambio de compañía\nf. Mostrar información del avión\ng. Salir\n----------------------Menú-----------------------";
		System.out.println(menu1);
		
		System.out.println("Introduce una opción: ");
		opcion = Integer.valueOf(sc.nextLine());
		if(opcion == 1) {
			System.out.println("Introduzca el indentificador del avión: ");
			identificador = sc.nextLine();
			System.out.println("Introduce la capacidad del avion:");
			capacidad = Integer.valueOf(sc.nextLine());
			a = new Avion(identificador,capacidad);
		}else if(opcion == 2){
			System.out.println("Introduzca el indentificador del avión: ");
			identificador = sc.nextLine();
			System.out.println("Introduzca el nombre de la compañia: ");
			companyia = sc.nextLine();
			System.out.println("Introduce la capacidad del avion:");
			capacidad = Integer.valueOf(sc.nextLine());
			a = new Avion(identificador,capacidad,companyia);
		}
		while(!opcion2.equals("g")){
			System.out.println(menu2);
			opcion2 = sc.nextLine();
			if(opcion2.equals("a")) {
				System.out.println("Introduce la cantidad de cantidad de asientos ocupados: ");
				capacidadVuelo = Integer.valueOf(sc.nextLine());
				System.out.println("Introduce los kilometros que recorrerá en vuelo: ");
				kmVuelo = Double.valueOf(sc.nextLine());
				System.out.println(a.asignarVuelo(capacidadVuelo, kmVuelo));
			}else if(opcion2.equals("b")){
				System.out.println(a.getNumeroVuelos());
			}else if(opcion2.equals("c")) {
				System.out.println(a.getTotalKm());
			}else if(opcion2.equals("d")) {
				System.out.println(a.getMediaKm());
			}else if(opcion2.equals("e")) {
				System.out.println("Introduce el nombre de la antigua compañia: ");
				companyiaAntigua = sc.nextLine();
				if(companyiaAntigua.equals(a.getCompanyia())) {
					System.out.println("Introduzca el nombre de la nueva compañia");
					companyiaNueva = sc.nextLine();
					a.setCompanyia(companyiaNueva);
				}else {
					System.out.println("Lo siento no hemos encontrado la antigua compañia.");
				}	
			}else if(opcion2.equals("f")) {
				System.out.println("Avión con id: " + a.getIdAvion() + " de la compañía "+ a.getCompanyia() +" ha realizado " +a.getNumeroVuelos() + " vuelos, con un total de " + a.getTotalKm() + " km y una media de "+ a.getMediaKm() +" km por vuelo.");
			
		}
		
	}System.out.println("Finalizando...");

	}
}