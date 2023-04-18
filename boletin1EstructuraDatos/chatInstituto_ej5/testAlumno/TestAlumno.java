package boletin1EstructuraDatos.chatInstituto_ej5.testAlumno;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import boletin1EstructuraDatos.chatInstituto_ej5.model.Alumno;
import boletin1EstructuraDatos.chatInstituto_ej5.model.ExceptionsPersona;
import boletin1EstructuraDatos.chatInstituto_ej5.model.Mensaje;
import boletin1EstructuraDatos.chatInstituto_ej5.model.Persona;
import boletin1EstructuraDatos.chatInstituto_ej5.model.Profesor;

class TestAlumno {

	
	Profesor p = new Profesor("Jose manuel",45);
	Alumno a = new Alumno("Manuel" , 17);
	Alumno a2 = new Alumno("Jose", 19);
	Mensaje m = new Mensaje(a, "Tengo una duda");
	
	@Test
	void testEnviarMensajeOK() {
		try {
			a.enviarMensaje(p, "No entiendo el ejercicio 99");
		}catch(ExceptionsPersona e) {
			assert(false);
		}
		

	} 
	
	@Test
	void testEnviarMensajeKO() {
		assertThrows(ExceptionsPersona.class, () -> {a.enviarMensaje(a2, "como vas");},"Hay un error");
	}

	@Test
	void testLeerMensajesBuzonOK() {
		a.recibirMensaje(m);
		assertThrows(ExceptionsPersona.class, () -> {a.leerMensajesBuzon();},"Hay un error" );
	}
	
	@Test
	void testLeerMensajesBuzonKO() {
		assertThrows(ExceptionsPersona.class, () -> {a.leerMensajesBuzon();},"Hay un error" );
	}

	@Test
	void testLeerMensajesBuzonOrdenadorAlfabeticamenteOK() {
		try {
			a.recibirMensaje(m);
			a.leerMensajesBuzonOrdenadorAlfabeticamente();
		} catch (ExceptionsPersona e) {
		}	
	}
	
	@Test
	void testLeerMensajesBuzonOrdenadorAlfabeticamenteKO() {
		try {
			a.leerMensajesBuzonOrdenadorAlfabeticamente();
		} catch (ExceptionsPersona e) {
		}	
	}


	@Test
	void testBorrarMensajeBuzonOK() {
		a.recibirMensaje(m);
		a.borrarMensajeBuzon(4);	
	}

	@Test
	void testEncontrarMensajeContieneFraseOK() {
		a.recibirMensaje(m);
		a.encontrarMensajeContieneFrase("una");
	}
	
	@Test
	void testEncontrarMensajeContieneFraseKO() {
		a.encontrarMensajeContieneFrase("una");
		try {
			a.recibirMensaje(m);
			a.leerMensajesBuzon().isEmpty();
		} catch (ExceptionsPersona e) {
		}
	}

	@Test
	void testRecibirMensaje() {
		a.recibirMensaje(m);
	}

}
