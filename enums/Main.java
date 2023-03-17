package enums;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

import enums.model.Genero;
import enums.model.Persona;

public class Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		Genero genero = null;
		LocalDate fechaNacimiento = null;
		/*do {
			try {
				System.out.println("Introduce género: ");
				String generoString = sc.nextLine();
				genero = genero.valueOf(generoString.toUpperCase());

			}catch(Exception exception) {
				System.out.println("Genero introducido incorrecto. (HOMBRE/MUJER)");
			}
			
		}while(genero == null);*/
		/*
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
		}while(fechaNacimiento == null);*/
		
		Persona joselito = new Persona("joselito","loco",Genero.HOMBRE,LocalDate.now());
		Persona juan = new Persona("Juan","primo",Genero.MUJER,LocalDate.now());
		Persona manuel = new Persona("Manuel","perez",Genero.MUJER,LocalDate.now());
		Persona josemi = new Persona("josemi","perez",Genero.HOMBRE,LocalDate.now());

		Persona[] grupo = new Persona[4];
		grupo[0] = joselito;
		grupo[1] = juan;
		grupo[2] = manuel;
		grupo[3] = josemi;

		System.out.println(Arrays.toString(grupo));
		
		Arrays.sort(grupo);
		
		System.out.println(Arrays.toString(grupo));
		
		System.out.println(juan);
		System.out.println(juan.getEdad());
		
	}

}
