package alquilerVehiculos;

import java.util.Scanner;

import alquilerVehiculos.model.Coche;
import alquilerVehiculos.model.Combustible;
import alquilerVehiculos.model.Empresa;
import alquilerVehiculos.model.Furgoneta;
import alquilerVehiculos.model.Gama;
import alquilerVehiculos.model.MicroBus;

public class Main {

	public static void main(String[] args) {

		final String MENU = "1. Alta de vehículo\r\n"
				+ "2. Cálculo de precio de alquiler\r\n"
				+ "3. Salir.";
		
		int opcion = 1;
		
		Scanner sc = new Scanner(System.in);	
		
		Empresa em = new Empresa();
		while(opcion != 3) {
			System.out.println(MENU);
			System.out.println("Introduce una opción: ");
			opcion = Integer.valueOf(sc.nextLine());
			
			if(opcion == 1) {
				String tipoVehiculo;
				System.out.println("Introduce el tipo de vehiculo: ");
				tipoVehiculo = sc.nextLine();
				
				String matricula;
				System.out.println("Introduce la matricula del vehiculo: ");
				matricula = sc.nextLine();
				
				Gama gama = null;
				
				do {
					try {
						System.out.println("Introduce la gama del vehiculo: ");
						gama = gama.valueOf(sc.nextLine().toUpperCase());
					}catch(Exception e) {
						System.out.println("Error gama incorrecta.");
					}
				}while(gama == null);
				
				if(tipoVehiculo.equalsIgnoreCase("coche")) { //COCHE
					Combustible combustible = null;
					
					do {
						try {
							System.out.println("Introduce el tipo de combustible: ");
							combustible = combustible.valueOf(sc.nextLine().toUpperCase());
						}catch(Exception e) {
							System.out.println("Error combustible incorrecto.");
						}
					}while(combustible == null);
					
					em.altaVehiculo(new Coche(matricula,gama,combustible));
					System.out.println("Se ha dado de alta correctamente.");
					
				}else if(tipoVehiculo.equalsIgnoreCase("microbus")) { //MICROBUS
					int plazas;
					System.out.println("Introduce el número de plazas: ");
					plazas = Integer.valueOf(sc.nextLine());
					em.altaVehiculo(new MicroBus(matricula,gama,plazas));
					System.out.println("Se ha dado de alta correctamente.");
				}else if(tipoVehiculo.equalsIgnoreCase("furgoneta")) {
					double cargaMaximaAutorizada;
					System.out.println("Introduce la carga maxima autorizada: ");
					cargaMaximaAutorizada = Double.valueOf(sc.nextLine());
					em.altaVehiculo(new Furgoneta(matricula,gama,cargaMaximaAutorizada));
					System.out.println("Se ha dado de alta correctamente.");
				}
			}else if(opcion == 2) {
				String matricula;
				System.out.println("Introduce la matricula");
				matricula = sc.nextLine();
				
				int dias;
				System.out.println("Introduce el número de dias del alquiler: ");
				dias = Integer.valueOf(sc.nextLine());
				
				System.out.println(em.calcularPrecioAlquiler(matricula, dias));
				
			}
		}
		System.out.println("Saliendo del sistema...");
	}

}
