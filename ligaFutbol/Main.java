package ligaFutbol;

import java.util.Scanner;

import ligaFutbol.model.Equipo;
import ligaFutbol.model.ExcepcionesLigaFutbol;
import ligaFutbol.model.Partido;

public class Main {

	public static void main(String[] args) throws ExcepcionesLigaFutbol {
		Scanner sc = new Scanner(System.in);
		Equipo local = null;
		Equipo visitante = null;
		
		System.out.println("Introduce el nombre del equipo local: ");
		local = new Equipo(sc.nextLine());
		System.out.println("Introduce el nombre del equipo visitante: ");
		visitante = new Equipo(sc.nextLine());
		//Validación de que los equipos son diferentes
		while(visitante.getNombre().equals(local.getNombre())) {
			System.out.println("Introduce un equipo que sea diferente al local: ");
			visitante = new Equipo(sc.nextLine());
		}
		
		System.out.println("Introduce la jornada en la que juegan los equipos: ");
		int jornada = Integer.valueOf(sc.nextLine());
		//Validación de que la jornada sea correcta
		while(jornada < 1 && jornada > 39) {
			System.out.println("Introduce una jornada correcta (1-38): ");
			jornada = Integer.valueOf(sc.nextLine());
		}Partido p1 = new Partido(jornada,local,visitante);
		System.out.println("Introduce el resultado del partido: ");
		p1.ponerResultado(sc.nextLine());
		p1.AsignarResultadoQuiniela();
		System.out.println(p1);
		
	}

}
