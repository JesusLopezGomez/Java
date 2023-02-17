package maquinaCafe;

import java.util.Scanner;

import maquinaCafe.model.Maquina;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Maquina m = new Maquina();
	double saldoMaquina = 0.0;
	int opcion = 0;
	double dinero = 0.0;
	String menu = "----------------Menú----------------\n1. Servir café solo (1 euro)\n2. Servir leche (0,8 euros)\n3. Servir café con leche (1,5 euros)\n4. Consultar estado máquina. Aparecen los datos de los depósitos y del monedero\n5. Apagar máquina y salir\n----------------Menú----------------\n";
	do {
		System.out.println("Introduce el saldo inicial de la máquina: ");
		saldoMaquina = Double.valueOf(sc.nextLine());
	}while(saldoMaquina < 0);
	m.setMonedero(saldoMaquina);
	m.llenarDepositos(50, 50, 80);
	while(opcion != 5) {
		System.out.println(menu);
		System.out.println("Introduce una opción:");
		opcion = Integer.valueOf(sc.nextLine());
		if(opcion == 1) {
			System.out.println("Introduce su dinero: ");
			dinero = Double.valueOf(sc.nextLine());
			System.out.println(m.servirCafeSolo(dinero));
		}else if(opcion == 2) {
			System.out.println("Introduce su dinero: ");
			dinero = Double.valueOf(sc.nextLine());
			System.out.println(m.servirLeche(dinero));
		}else if(opcion == 3) {
			System.out.println("Introduce su dinero: ");
			dinero = Double.valueOf(sc.nextLine());
			System.out.println(m.servirCafeConLeche(dinero));
		}else if(opcion == 4) {
			System.out.println(m.getEstado());
		}
	}System.out.println("Apagando el sistema...");
	
	
	}

}
