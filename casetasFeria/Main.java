package casetasFeria;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import casetasFeria.model.Caseta;
import casetasFeria.model.Feria;

public class Main {

	public static void main(String[] args) {		
		Feria f = new Feria("./files/casetasferia.xml");
		f.leerJson();
		String menu = "1. Mostrar todas las casetas existentes en una calle.\r\n"
				+ "2. Mostrar todas las casetas de tipo familiar.\r\n"
				+ "3. Mostrar todas las casetas de tipo Distrito\r\n"
				+ "4. Mostrar todas las casetas que no sean ni familiares ni distritos.\r\n"
				+ "5. Mostrar para cada una de las calles del recinto ferial el número de casetas de tipo familiar\r\n"
				+ "que existen.\r\n"
				+ "6. Mostrar para cada una de las calles del recinto ferial el número de casetas de tipo Distrito\r\n"
				+ "que existen.\r\n"
				+ "7. Eliminar caseta.\r\n"
				+ "8. Salir.";
		
		int opcion = 0;
		Scanner sc = new Scanner(System.in);
		
		
		
		while(opcion != 8) {
			System.out.println(menu);
			System.out.println("\r\nIntroduce una opción: ");
			opcion = Integer.valueOf(sc.nextLine());
			
			if(opcion == 1) {
				System.out.println("Introduce calle: ");
				String calle = sc.nextLine();
				System.out.println("Casetas en la calle: " + calle + "\r\n");
				System.out.println(f.obtenerCasetasEnCalle(calle));
				System.out.println(" ");
			}else if(opcion == 2) {
				System.out.println("Casetas de tipo familiar:");
				System.out.println(" ");
				System.out.println(f.obtenerCasetasFamiliares());
				System.out.println(" ");
			}else if(opcion == 3) {
				System.out.println("Casetas de tipo distrito:");
				System.out.println(" ");
				System.out.println(f.obtenerCasetasDistrito());
				System.out.println(" ");
			}else if(opcion == 4) {
				System.out.println("Casetas diferentes de distrito y familiar:");
				System.out.println(" ");
				System.out.println(f.obtenerCasetasNoFamiliaresNoDistrito());
				System.out.println(" ");
			}else if(opcion == 5) {
				System.out.println("Calles con casetas de tipo familiar: :");
				System.out.println(" ");
				System.out.println(f.callesConCasetasFamiliares());
				System.out.println(" ");
			}else if(opcion == 6) {
				System.out.println("Calles con casetas de tipo distrito: ");
				System.out.println(" ");
				System.out.println(f.callesConCasetasDistrito());
				System.out.println(" ");
			}else if(opcion == 7) {
				System.out.println("Introduce calle: ");
				String calle = sc.nextLine();
				System.out.println("Introduce el número de caseta; ");
				String numeroCaseta = sc.nextLine();
				System.out.println(" ");
				try {
					f.eliminarCaseta(calle, numeroCaseta);
				} catch (Exception e) {
					System.out.println(e.getMessage());
					
				}
				System.out.println(" ");
			}
		}
		
	}

}
