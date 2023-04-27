package ejerciciosBuenosColecciones;

import java.time.LocalDate;

import ejerciciosBuenosColecciones.model.Alumno;
import ejerciciosBuenosColecciones.model.Persona;
import ejerciciosBuenosColecciones.model.PersonaExceptions;
import ejerciciosBuenosColecciones.model.Profesor;

public class Main {

	public static void main(String[] args) {
		Persona pa = new Alumno("alumno",15);
		Persona pf = new Profesor("jms", 40);
		Persona pa2 = new Alumno("balumno", 23);

		try {
			pa2.enviarMensaje(pa2, "Cortesía de alguno");
			//pa.enviarMensaje(pa2, "Ola, ke ase?");
			pf.enviarMensaje(pa2, "Otro mensaje");
			pf.enviarMensaje(pa, "Y otro mensaje");
			pf.enviarMensaje(pf, "Y ahora hablando conmigo mismo");
			pf.enviarMensaje(pf, "Como en whatsapp");
			pa2.enviarMensaje(pf, "Cortesía de alguno");
	

		} catch (PersonaExceptions e) {
			System.out.println(e.getMessage());
		}
		System.out.println(pa2.leerBuzonAlfabeticamenteNombreRemitente());
		System.out.println("Mensajes del buzón del profesor: ");
		System.out.println(pf.leerBuzon());;
		
		System.out.println("Mensajes del buzón del alumno: ");
		System.out.println(pa.leerBuzon());;

	}

}
