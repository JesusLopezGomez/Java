package boletin1EstructuraDatos.chatInstituto_ej5.testAlumno;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import boletin1EstructuraDatos.chatInstituto_ej5.model.Mensaje;
import boletin1EstructuraDatos.chatInstituto_ej5.model.Profesor;

class testMensajes {

	Mensaje m = new Mensaje(new Profesor("pepe",19), "hola");

	@Test
	void testContieneFraseMensajeVerdadero() {
		assertTrue(m.contieneFraseMensaje("hola"));
	}
	
	@Test
	void testContieneFraseMensajeFalso() {
		assertFalse(m.contieneFraseMensaje("adios"));
	}

	@Test
	void testToString() {
		assertNotEquals(m.toString(),String.format("Mensaje 0: De: pepe Texto: hola Fecha y hora: 19-10-1999"));
	}

	@Test
	void testCompareTo() {
		assertTrue(m.compareTo(new Mensaje(new Profesor("pepin",18), "Holasa")) < 0);
	}

}
