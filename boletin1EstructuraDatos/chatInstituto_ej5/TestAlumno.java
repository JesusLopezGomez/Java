package boletin1EstructuraDatos.chatInstituto_ej5;

import org.junit.jupiter.api.Test;

class TestAlumno {

	
	Persona p = new Profesor("Jose manuel",45);
	Persona a = new Alumno("Manuel" , 17);
	Persona a2 = new Alumno("Jose", 19);
	Mensaje m = new Mensaje(a, "Tengo una duda");
	
	@Test
	void testEnviarMensajeOK() {
		try {
			a.enviarMensaje(p, "No entiendo el ejercicio 99");
		} catch (ExceptionsPersona e) {
		}
	}
	
	@Test
	void testEnviarMensajeKO() {
		try {
			a.enviarMensaje(a2, "como vas");
		} catch (ExceptionsPersona e) {
		}
	}

	@Test
	void testLeerMensajesBuzonOK() {
		
		try {
			a.recibirMensaje(m);
			a.leerMensajesBuzon();
		} catch (ExceptionsPersona e) {
		}
	}
	
	@Test
	void testLeerMensajesBuzonKO() {
		
		try {
			a.leerMensajesBuzon();
		} catch (ExceptionsPersona e) {
		}
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
