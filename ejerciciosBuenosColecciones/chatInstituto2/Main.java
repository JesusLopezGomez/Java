package ejerciciosBuenosColecciones.chatInstituto2;

import java.time.LocalDateTime;

import ejerciciosBuenosColecciones.chatInstituto2.model.Alumno;
import ejerciciosBuenosColecciones.chatInstituto2.model.Persona;
import ejerciciosBuenosColecciones.chatInstituto2.model.PersonaException;
import ejerciciosBuenosColecciones.chatInstituto2.model.Profesor;

public class Main {

	public static void main(String[] args) {
		Persona pa = new Alumno("alumno", 15);
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
		} catch (PersonaException e) {
			System.out.println(e.getMessage());
		}
		try {
			pf.borrarMensaje(4);
			System.out.println(pa2.leerBuzonAlfabeticamente());
			System.out.println("Mensajes del buzón del profesor: ");
			System.out.println(pf.leerBuzon());;
			
			System.out.println("Mensajes del buzón del alumno: ");
			System.out.println(pa.leerBuzon());;
		} catch (PersonaException e) {
			System.out.println(e.getMessage());
		}
	}

}
