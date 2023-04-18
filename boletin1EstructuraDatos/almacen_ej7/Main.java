package boletin1EstructuraDatos.almacen_ej7;

import java.util.Scanner;

import boletin1EstructuraDatos.almacen_ej7.model.Almacen;
import boletin1EstructuraDatos.almacen_ej7.model.AlmacenExceptions;
import boletin1EstructuraDatos.almacen_ej7.model.Caja;

public class Main {

	public static void main(String[] args) {
		
		final String MENU = "1.Abrir caja\n2.Cerrar caja\n3.Nuevo Cliente\n4.Atender Cliente\n5.Salir";
		
		Scanner sc = new Scanner(System.in);
		
		int opcion = 0;
		
		Almacen a = new Almacen();
		
		Caja caja0 = new Caja(); 
		Caja caja2 = new Caja(); 
		Caja caja3 = new Caja(); 
		Caja caja4 = new Caja(); 
		Caja caja5 = new Caja(); 
		Caja caja6 = new Caja(); 
		Caja caja7 = new Caja(); 
		a.anniadirCaja(caja0);
		a.anniadirCaja(caja2);
		a.anniadirCaja(caja3);
		a.anniadirCaja(caja4);
		a.anniadirCaja(caja5);
		a.anniadirCaja(caja6);
		a.anniadirCaja(caja7);
		
		while(opcion != 5) {
			System.out.println(MENU);
			System.out.println("Introduce una opción: ");
			opcion = Integer.valueOf(sc.nextLine());
			
			if(opcion == 1) {
				System.out.println("Introduce el número de la caja: ");
				int numeroCaja = Integer.valueOf(sc.nextLine());
					try {
						a.abrirCaja(numeroCaja);
						System.out.println("Caja abierta correctamente.");
					} catch (AlmacenExceptions e) {
						e.printStackTrace();
					}
			}else if(opcion == 2) {
				System.out.println("Introduce el número de la caja: ");
				int numeroCaja = Integer.valueOf(sc.nextLine());
				try {
					a.cerrarCaja(numeroCaja);
					System.out.println("Caja cerrada correctamente.");
				} catch (AlmacenExceptions e) {
					e.printStackTrace();
				}
			}else if(opcion == 3) {
				System.out.println(a.nuevoCliente());
			}else if(opcion == 4) {
				System.out.println("Introduce el número de la caja en la que encuentras: ");
				int numeroCaja = Integer.valueOf(sc.nextLine());

				try {
					System.out.println(a.atenderCliente(numeroCaja));
				} catch (AlmacenExceptions e) {
					e.printStackTrace();
				}
			}

		}
		System.out.println("Saliendo del sistema de cajas...");
		
		
	}

}
