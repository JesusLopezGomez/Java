package boletin1EstructuraDatos.ampliacion_equipos_ej8;

import java.util.HashMap;
import java.util.Map;

import boletin1EstructuraDatos.ampliacion_equipos_ej8.model.Alumno;
import boletin1EstructuraDatos.ampliacion_equipos_ej8.model.AlumnoException;
import boletin1EstructuraDatos.ampliacion_equipos_ej8.model.Equipo;

public class Main {

	public static void main(String[] args) {
		Alumno a1 = new Alumno("Pedro", "12345656V",19,'H',"Sevilla");
		Alumno a2 = new Alumno("Maria", "21345656G",20,'M',"Madrid");
		Alumno a3 = new Alumno("Marcos", "12345516A",25,'H',"Sevilla");
		Alumno a4 = new Alumno("Daria", "18291011L",35,'M',"Valencia");
		Alumno a5 = new Alumno("kikia", "12312656V",54,'M',"Sevilla");
		Alumno a6 = new Alumno("kikiri", "1278126V",67,'H',"Córdoba");
		Alumno a7 = new Alumno("Pedrito", "1234125656V",17,'H',"Málaga");

		
		Equipo betis = new Equipo("Betis");
		Equipo betisFemenino = new Equipo("Betis femenino");
		
		try {
			betis.anniadirAlumno(a1);
			betis.anniadirAlumno(a2);
			betis.anniadirAlumno(a3);
			betis.anniadirAlumno(a4);
			betis.anniadirAlumno(a5);
			betis.anniadirAlumno(a6);
			betis.anniadirAlumno(a7);
			betisFemenino.anniadirAlumno(a4);
			betisFemenino.anniadirAlumno(a5);
		} catch (AlumnoException e) {
			e.printStackTrace();
		}
		
		System.out.println(betis.listadoMasculinoMayoresOrdenEdad());
		System.out.println(betis.esFemenino());
		System.out.println(betisFemenino.esFemenino());
		System.out.println(betis.numeroJugadorasMayores());
		System.out.println(betis.jugadorMayor());
		System.out.println(betis.dniJugadoresMenorEdad());
		System.out.println(betis.nombreJugadorasAscendente());
		System.out.println(betis.existeJugadoraMayorEdad());
		System.out.println(betis.ciudadesDistintasJugadores());
		
		
		
	}

}
