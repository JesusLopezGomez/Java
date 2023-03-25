package practicaChatGpt;

import java.util.Scanner;

import practicaChatGpt.model.Coche;
import practicaChatGpt.model.Moto;
import practicaChatGpt.model.OrdenadorPortatil;
import practicaChatGpt.model.Tablet;
import practicaChatGpt.model.TelefonoMovil;
import practicaChatGpt.model.Vehiculo;

public class Main {

	
	static TelefonoMovil[] tlfs = new TelefonoMovil[10];
	static int contTlf = 0;
	
	public static int buscarTlf(String marca) {
		int posicion = -1;
		for(int i = 0; i < tlfs.length && posicion == -1; i++) {
			if(tlfs[i] != null && tlfs[i].getMarca().equals(marca)) {
				posicion = i;
			}
		}
		return posicion;
	}
	
	public static void main(String[] args) {
		
		Coche pruebaCoche = new Coche(4,5,"gasolina");
		System.out.println(pruebaCoche);
		Moto pruebaMoto = new Moto(2,2,"Automatica");
		System.out.println(pruebaMoto);
		System.out.println(pruebaMoto.arrancar());
		System.out.println(pruebaCoche.arrancar());
		System.out.println(pruebaCoche.parar());
		
		TelefonoMovil tl1 = new TelefonoMovil(300.0,"Samsung","Galaxy S21",128);
		OrdenadorPortatil op1 = new OrdenadorPortatil(800.0,"HP","Pavilon",8);
		Tablet tab1 = new Tablet(500,"Apple","Ipad",256,10.5);
		
		System.out.println(tl1.vender());
		System.out.println(op1.vender());
		System.out.println(tab1.vender());
		System.out.println(tl1);
		System.out.println(op1);
		System.out.println(tab1);
		
		System.out.println("------Separación------");
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		
		
		while(opcion!=5) {
			
			if(opcion == 1) {
				System.out.println("Introduce el precio del tlf: ");
				double precioTlf = Double.valueOf(sc.nextLine());
				System.out.println("Introduce la marca del tlf: ");
				String marcaTlf = sc.nextLine();
				System.out.println("Introduce el modelo del tlf: ");
				String modeloTlf = sc.nextLine();
				System.out.println("Introduce la capacidad del tlf: ");
				int capacidadTlf = Integer.valueOf(sc.nextLine());
				if(buscarTlf(marcaTlf) != -1) {
					System.out.println("Error, esa marca ya existe.");
				}else {
					tlfs[contTlf]=new TelefonoMovil(precioTlf,marcaTlf,modeloTlf,capacidadTlf);
					System.out.println("Telefono guardado.");
				}
				
			}else if(opcion == 2) {
				System.out.println("Introduce la marca del télefono: ");
				String marcaTlf = sc.nextLine();
				if(buscarTlf(marcaTlf) != 1) {
					System.out.println("Introduce el nuevo precio del télofono: ");
					double precioTlf = Double.valueOf(sc.nextLine());
					tlfs[buscarTlf(marcaTlf)].setPrecio(precioTlf);
				}
			}else if(opcion == 3) {
				for(int i = 0; i < tlfs.length; i++) {
					if(tlfs[i] != null) {
						System.out.println(tlfs[i]);
					}
				}
			}else if(opcion == 4) {
				System.out.println("Introduce la marca que quieres comprar: ");
				String marca = sc.nextLine();
				if(buscarTlf(marca) != -1) {
					tlfs[buscarTlf(marca)] = null;
				}
			}
			
			System.out.println("Introduce una opción: ");
			opcion = Integer.valueOf(sc.nextLine());
		}
		
		
	}

}
