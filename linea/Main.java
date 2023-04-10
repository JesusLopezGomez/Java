package linea;

import java.util.Scanner;

import linea.model.Linea;
import linea.model.Punto;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double xPA = 0.0;
		double yPA = 0.0;
		double xPB = 0.0;
		double yPB = 0.0;
		
		System.out.println("Inserta x del puntoA 1: ");
		xPA = Double.valueOf(sc.nextLine());
		System.out.println("Inserta y del puntoA 1: ");
		yPA = Double.valueOf(sc.nextLine());
		System.out.println("Inserta x del puntoB 2: ");
		xPB = Double.valueOf(sc.nextLine());
		System.out.println("Inserta y del puntoB 2: ");
		yPB = Double.valueOf(sc.nextLine());
		
		Punto puntoA1 = new Punto(xPA,yPA);
		Punto puntoB1 = new Punto(xPB,yPB);	
		
		Linea linea1 = new Linea(puntoA1, puntoB1);
		
		String menu = "1. Mover línea: Solicitará el movimiento (A-arriba, B-ABajo, I-Izquierda, DDerecha) y realice el movimiento\n"
				+ "2. Mostrar línea\n"
				+ "3. Salir";
		int opcion = 0;
		String movimiento = "";
		double cantidadMovimiento = 0.0;
		
		while(opcion != 3) {
			
			System.out.println(menu);
			System.out.println("Introduce una opción: ");
			opcion = Integer.valueOf(sc.nextLine());
			
			if(opcion == 1) {
				System.out.println("Introduce el movimiento (a-b-i-d): ");
				movimiento = sc.nextLine().toLowerCase();
				if (movimiento.equals("a")) {
					System.out.println("Introduce la cantidad de movimiento: ");
					cantidadMovimiento = Double.valueOf(sc.nextLine());
					linea1.moverArriba(cantidadMovimiento);
				}else if (movimiento.equals("b")) {
					System.out.println("Introduce la cantidad de movimiento: ");
					cantidadMovimiento = Double.valueOf(sc.nextLine());
					linea1.moverAbajo(cantidadMovimiento);
				}else if (movimiento.equals("i")) {
					System.out.println("Introduce la cantidad de movimiento: ");
					cantidadMovimiento = Double.valueOf(sc.nextLine());
					linea1.moverIzquierda(cantidadMovimiento);
				}else if (movimiento.equals("d")) {
					System.out.println("Introduce la cantidad de movimiento: ");
					cantidadMovimiento = Double.valueOf(sc.nextLine());
					linea1.moverDerecha(cantidadMovimiento);
				}
			}else if(opcion == 2) {
				System.out.println(linea1);
			}
		}System.out.println("Finalizando...");

	}

}
