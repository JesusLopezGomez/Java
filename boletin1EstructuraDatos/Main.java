package boletin1EstructuraDatos;

import java.util.Arrays;

public class Main {

	public static <T> T[] reverse (T[] arrayOriginal) {
		T[] arrayAuxiliar = arrayOriginal.clone();
		for(int i = 0, indice = arrayOriginal.length-1; i < arrayOriginal.length && indice >= 0; i++) {
			arrayAuxiliar[i] = arrayOriginal[indice];
			indice --;
		}
		
		return arrayAuxiliar;
	}
	
	public static <T> void main(String[] args) {
		Integer[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12};
		System.out.println(Arrays.toString((T[]) reverse(numeros)));
		
		
		Alumno a1 = new Alumno("Pedro", "12345656V");
		Alumno a2 = new Alumno("Mario", "21345656G");
		Alumno a3 = new Alumno("Marcos", "12345516A");
		Alumno a4 = new Alumno("Dario", "18291011L");
		Alumno a5 = new Alumno("kiki", "12312656V");
		Alumno a6 = new Alumno("kikiri", "1278126V");

		Equipo betis = new Equipo("Betis");
		Equipo sevilla = new Equipo("Sevilla");
		
		try {
			//Añadir alumnos
			betis.añadirAlumno(a1);
			betis.añadirAlumno(a2);
			betis.añadirAlumno(a3);
			sevilla.añadirAlumno(a4);
			sevilla.añadirAlumno(a5);
			//Borrar alumnos
			sevilla.delAlumno(a4);
			//Añadir alumnos dario al betis
			betis.añadirAlumno(a4);
			//Comprobar alumno
			System.out.println(betis.existeAlumno(a4));
			//Unir equipos
			System.out.println(betis.unionEquipo(sevilla));
			//Intersect equipos
			sevilla.añadirAlumno(a1);
			sevilla.añadirAlumno(a2);
			System.out.println(sevilla.intersectEquipo(betis));
			
		} catch (AlumnoException e) {
			e.printStackTrace();
		}
		

	}

}
