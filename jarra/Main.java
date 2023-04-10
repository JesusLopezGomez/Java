package jarra;

import java.util.Scanner;

import jarra.model.Jarra;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menu = "1.Llenar Jarra\n2.Vaciar Jarra\n3.Volcar jarra A en B\n4.Volcar jarra B en A\n5.Ver estado de las jarras\n6.Salir";
		System.out.println("Introduce la capacidad de la Jarra A: ");
		Jarra a = new Jarra(Integer.valueOf(sc.nextLine()));
		System.out.println("Introduce la capacidad de la Jarra b: ");
		Jarra b = new Jarra(Integer.valueOf(sc.nextLine()));
		int opcion = 0;
		String opcionJarra = "";
		while (opcion != 6) {
			System.out.println(menu);
			System.out.println("Introduce una opcion: ");
			opcion = Integer.valueOf(sc.nextLine());
			
			if(opcion == 1) {
				System.out.println("Selecciona la jarra que quiere llenar A/B: ");
				opcionJarra = sc.nextLine().toLowerCase();
				if(opcionJarra.equals("a")) {
					a.llenarJarraCompleta();
				}else if(opcionJarra.equals("b")) {
					b.llenarJarraCompleta();
				}else {
					System.out.println("Error, no has introducido una jarra correcta.");
				}
			}else if(opcion == 2) {
				System.out.println("Selecciona la jarra que quiere vaciar A/B: ");
				opcionJarra = sc.nextLine().toLowerCase();
				if(opcionJarra.equals("a")) {
					a.vaciarJarraCompleta();
				}else if(opcionJarra.equals("b")) {
					b.vaciarJarraCompleta();
				}else {
					System.out.println("Error, no has introducido una jarra correcta.");
				}
			}else if(opcion == 3) {
				System.out.println(a.volcarContenidoEnOtraJarra(b));
				
			}else if(opcion == 4) {
				System.out.println(b.volcarContenidoEnOtraJarra(a));
			}else if(opcion == 5) {
				System.out.println(a);
				System.out.println(b);
			}
		}System.out.println("La cantidad de agua que se ha gastado llenando la jarras es de: " + Jarra.getCantidadGastaGeneral());
		
	}

}
