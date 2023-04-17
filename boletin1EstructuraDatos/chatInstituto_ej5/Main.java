package boletin1EstructuraDatos.chatInstituto_ej5;

import boletin1EstructuraDatos.chatInstituto_ej5.model.Alumno;
import boletin1EstructuraDatos.chatInstituto_ej5.model.ExceptionsPersona;
import boletin1EstructuraDatos.chatInstituto_ej5.model.Mensaje;
import boletin1EstructuraDatos.chatInstituto_ej5.model.Persona;
import boletin1EstructuraDatos.chatInstituto_ej5.model.Profesor;

public class Main {

	public static void main(String[] args) {
		Persona p = new Profesor("Pepe",19);
		Persona p1 = new Profesor("Jose",20);
		Mensaje m = new Mensaje(new Profesor("Jesus",26),"Hola que tal");
		Persona a = new Alumno("Jesus",17);
		Persona a1 = new Alumno("Juan",19);
		try {
			p1.enviarMensaje(p, "Hola que tal pepe");
			p.enviarMensaje(p1, "Bien jose");
			a.enviarMensaje(p, "Hola");
		} catch (ExceptionsPersona e1) {
			e1.printStackTrace();
		}
		try {
			System.out.println(p1.leerMensajesBuzon());
			System.out.println(p.leerMensajesBuzon());
			System.out.println(p1.encontrarMensajeContieneFrase("jose"));
			p.recibirMensaje(m);
			System.out.println(p.leerMensajesBuzon());
			System.out.println(p.leerMensajesBuzonOrdenadorAlfabeticamente());
			
			p.borrarMensajeBuzon(0);
			System.out.println(p.leerMensajesBuzon());
		} catch (ExceptionsPersona e) {
			e.printStackTrace();
		}
	}

}
