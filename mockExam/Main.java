package mockExam;

import java.util.Scanner;

import mockExam.model.Plato;
import mockExam.model.Vino;

public class Main {
	static Plato[] platos = new Plato[10];
	static int contPlato = 0;
	
	static Vino[] vinos = new Vino[10];
	static int contVino = 0;

	public static int posicionPlato(String nombrePlato) {
		int posicion = -1;
		for(int i = 0; i < platos.length; i++ ) {
			if(platos[i] != null && platos[i].getNombre().equals(nombrePlato)) {
				posicion = i;
			}
		}
		
			
		return posicion;
	}
	
	public static int posicionVino(String nombreVino) {
		int posicion = -1;
		for(int i = 0; i < vinos.length; i++ ) {
			if(vinos[i] != null && vinos[i].getNombre().equals(nombreVino)) {
				posicion = i;
			}
		}
		
			
		return posicion;
	}
	
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int opcion = 0;
	
	while(opcion != 6) {
		
		if(opcion == 1) {
			System.out.println("Introduce el nombre del plato");
			String nombre = sc.nextLine();
			System.out.println("Introduce el precio del plato:");
			double precio = Double.valueOf(sc.nextLine());
			if(posicionPlato(nombre) != -1) {
				System.out.println("Error, ese plato ya existe");
			}else {
				platos[contPlato] = new Plato(nombre,precio);
				contPlato ++;
			}
			
		}else if(opcion == 2) {
			System.out.println("Introduce el nombre del plato");
			String nombre = sc.nextLine();
			if(posicionPlato(nombre) != -1) {
				System.out.println("Introduce el nuevo precio del plato: ");
				platos[posicionPlato(nombre)].setPrecio(Double.valueOf(sc.nextLine()));
			}else {
				System.out.println("Error, ese plato no existe");
			}
		}else if(opcion == 3) {
			System.out.println("Introduce el nombre del plato");
			String nombre = sc.nextLine();
			if(posicionPlato(nombre) != -1) {
				System.out.println("Introduce el nombre del vino: ");
				String nombreVino = sc.nextLine();
				System.out.println("Introduce la graduacion del vino: ");
				double graduacionVino = Double.valueOf(sc.nextLine());
				platos[posicionPlato(nombre)].setVinoRecomendado(nombreVino,graduacionVino);
			}else {
				System.out.println("Error");
			}
		}else if(opcion == 4) {
			System.out.println("Introduce el nombre del plato: ");
			String nombre = sc.nextLine();
			if(posicionPlato(nombre) != -1) {
				System.out.println(platos[posicionPlato(nombre)]);
			}else {
				System.out.println("Error, ese plato no existe");
			}
		}else if(opcion == 5) {
			for(int i = 0; i < platos.length; i++) {
				if(platos[i] != null) {
					System.out.println(platos[i]);
				}
			}
		}
		System.out.println("Introduce una opción:");
		opcion = Integer.valueOf(sc.nextLine());
	}
	
	
}

}
