package boletin1EstructuraDatos.historialNavegacion_ej4;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ExceptionHistorial {
	
		final String MENU = "1. Nueva página consultada\n2. Consultar historial completo.\n3. Consultar historial de un día.\n4. Borrar todo el historial.\n5. Borrar visitas a una página.\n6. Salir.";
		
		Scanner sc = new Scanner(System.in);
		
		int opcion = 0;
		
		Historial historial = new Historial();
		
		while(opcion != 6) {
			
			System.out.println(MENU);
			System.out.println("----Introduce una opción: ");
			opcion = Integer.valueOf(sc.nextLine());
			
			if(opcion == 1) {
				System.out.println("Introduce el nombre de la página");
				String nombre = sc.nextLine();
				try {
					historial.anniadirPaginaConsultada(new PaginaWeb(nombre));
					System.out.println("Pagina consultada añadida correctamente.");
				}catch (ExceptionHistorial e) {
					e.printStackTrace();
				}
			}else if(opcion == 2) {
				System.out.println(historial.consultarHistorialCompleto());
			}else if(opcion == 3) {
				System.out.println("Introduce el dia en formato número: ");
				try {
					int dia = Integer.valueOf(sc.nextLine());
					System.out.println(historial.consultarHistorialDia(dia));
				}catch (Exception e) {
					System.out.println("Error, intentalo de nuevo, introduciendo un número entero.");
				}
				
			}else if(opcion == 4) {
				historial.borrarHistorial();
				System.out.println("Historial borrado correctamente.");
			}else if(opcion == 5) {
				System.out.println("Introduce el nombre de la página:");
				String nombreWeb = sc.nextLine();
				historial.borrarVisitasPagina(nombreWeb);
				System.out.println("Historial sin rastro de la web " + nombreWeb );
			}
			
		}
		System.out.println("Saliendo del sistema...");
		
		System.out.println("------------Comprobaciones fecha y hora------------");
		
		PaginaWeb p = new PaginaWeb("gogle",LocalDateTime.of(2003, 11, 19, 8, 32, 10));
		PaginaWeb p1 = new PaginaWeb("bing",LocalDateTime.of(2003, 11, 20, 8, 32, 10));
		PaginaWeb p2 = new PaginaWeb("brave",LocalDateTime.of(2003, 11, 18, 8, 32, 10));
		
		Historial h = new Historial();
		h.añadirPaginaConsultada(p2);
		h.añadirPaginaConsultada(p);
		h.añadirPaginaConsultada(p1);
		
		System.out.println(h.consultarHistorialDia(19));

	}

}
