package geometria;

import java.util.Scanner;

import geometria.model.Cuenta;
import geometria.model.Rectangulo;

public class Main {

	public static void main(String[] args) {
		Rectangulo r = new Rectangulo();
		Cuenta c = new Cuenta();
		System.out.println(r.calcularPerimetro(10, 1));
		System.out.println(r.calcularArea(9, 10));
		String menu1 = "----------------------Menú-----------------------\n1. Hacer un reintegro.\n2. Hacer un ingreso.\n3. Consultar el saldo y el número de reintegros e ingresos realizados.\n4. Finalizar las operaciones.\n----------------------Menú-----------------------";
		int opcion = 1;
		int saldoCuenta = 0;
		int saldoRetirar = 0;
		int saldoIngresar = 0;
		String salir = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el saldo de tu cuenta: ");
		saldoCuenta = Integer.valueOf(sc.nextLine());
		if(saldoCuenta > 0) {
			c.setBanco(saldoCuenta);
		}
		while(opcion != 0) {
			System.out.println(menu1);
			opcion = Integer.valueOf(sc.nextLine());
			if(opcion == 1) {
				System.out.println("Introduce la cantidad que quieres retirar:");
				saldoRetirar = Integer.valueOf(sc.nextLine());
				c.realizarReintegro(saldoRetirar);
			}else if(opcion == 2) {
				System.out.println("Introduce la cantidad que quieres ingresar:");
				saldoIngresar = Integer.valueOf(sc.nextLine());
				c.realizarIngreso(saldoIngresar);
			}else if(opcion == 3) {
				System.out.println("Saldo disponible: " + c.getBanco() + ", numero de reintegros: " + c.getNumReintegros() + ", numero de ingresos: " + c.getNumIngresos());
			}else if(opcion == 4) {
				System.out.println("¿Quiere salir?(s/n): ");
				salir = sc.nextLine();
				if(salir.equals("s")) {
					System.out.println(c.getBanco());
					opcion = 0;
				}
			}
			
		}
	
	}

}
