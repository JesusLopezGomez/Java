package enums;

import java.time.LocalDate;
import java.util.Scanner;

import enums.model.Genero;
import enums.model.Persona;

public class Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		Genero genero = null;
		LocalDate fechaNacimiento = null;
		do {
			try {
				System.out.println("Introduce género: ");
				String generoString = sc.nextLine();
				genero = genero.valueOf(generoString.toUpperCase());

			}catch(Exception exception) {
				System.out.println("Genero introducido incorrecto. (HOMBRE/MUJER)");
			}
			
		}while(genero == null);
		
		do {
			try {
				System.out.println("Introduce el año de la fecha: ");
				int annio = Integer.valueOf(sc.nextLine());
				System.out.println("Introduce el mes de la fecha: ");
				int mes = Integer.valueOf(sc.nextLine());
				System.out.println("Introduce el dia de la fecha: ");
				int dia = Integer.valueOf(sc.nextLine());	
				fechaNacimiento = LocalDate.of(annio, mes, dia);
			}catch(Exception exception) {
				System.out.println("La fecha introducida es incorrecta");
			}
		}while(fechaNacimiento == null);
		
		Persona p = new Persona("joselito","loco",genero,fechaNacimiento);
		System.out.println(p);
		System.out.println(p.getEdad());
		
		
	}

}
