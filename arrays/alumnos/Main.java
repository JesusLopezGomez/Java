package arrays.alumnos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		
 		System.out.println("Introduzca el número de alumnos que hay en la clase: ");
 		int alumnos = Integer.valueOf(sc.nextLine());
 		NotasAlumnos n = new NotasAlumnos(alumnos);
 		
 		String nombreAlumno = "";
 		double notaAlumno = 0.0;
 		
 		for(int i = 0; i < alumnos; i++) {
 			System.out.println("Introduzca el nombre del alumno " + (i+1) +":");
 			nombreAlumno = sc.nextLine();
 			System.out.println("Introduzca la nota del alumno " + (i+1) +":");
 			notaAlumno = Double.valueOf(sc.nextLine());
 	 		n.añadirAlumnoNota(nombreAlumno, notaAlumno);
 		}
 		
 		
 		int opcion = 0;
 		
 		do {
 		System.out.println("1. Mostrar el nombre y la nota de los alumnos aprobados.\r\n"
 				+ "2. Mostrar el nombre y la nota los alumnos suspensos.\r\n"
 				+ "3. Mostrar la nota media de la clase.\r\n"
 				+ "4. Mostrar los alumnos que tienen más de una nota X (se solicitará\r\n"
 				+ "X por teclado).\r\n"
 				+ "5. Mostrar el alumno con la nota máxima y mínima.\r\n"
 				+ "6. Mostrar un listado ordenado de forma creciente por la nota.\r\n"
 				+ "7. Salir.");
 		System.out.println("Introduce una opcion: ");
 		opcion = Integer.valueOf(sc.nextLine());
 		
 		if(opcion == 1) {
 			System.out.println(n.getAlumnosNotaAprobada());
 		}else if(opcion == 2) {
 			System.out.println(n.getAlumnosNotaSuspensa());
 		}else if(opcion == 3) {
 			System.out.println(n.getNotaMediaClase());
 		}else if(opcion == 4) {
 			System.out.println("Introduzca la nota por la que quiere filtrar: ");
 			System.out.println(n.getAlumnosConNotaX(Double.valueOf(sc.nextLine())));
 		}else if(opcion == 5) {
 			System.out.println(n.getAlumnoNotaMayorMenor());
 		}else if(opcion == 6) {
 			System.out.println(n.getListadoCrecienteNota());
 		}
 		}while(opcion!=7);
	}

}
