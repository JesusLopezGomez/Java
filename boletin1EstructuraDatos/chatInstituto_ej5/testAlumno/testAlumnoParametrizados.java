package boletin1EstructuraDatos.chatInstituto_ej5.testAlumno;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import boletin1EstructuraDatos.chatInstituto_ej5.model.Alumno;
import boletin1EstructuraDatos.chatInstituto_ej5.model.ExceptionsPersona;
import boletin1EstructuraDatos.chatInstituto_ej5.model.Profesor;

class testAlumnoParametrizados {

	Alumno a = new Alumno("jose", 19);
	Alumno a1= new Alumno("manue", 17);
	Profesor p1 = new Profesor("lolo",29);
	
	@ParameterizedTest
	@CsvSource({"18,hola amigos","17, como estas","19,","-1,que tal","40, que haces"})
	void testEnviarMensaje(String edad, String mensaje) {
		Alumno pedro = new Alumno("pedro",Integer.valueOf(edad));
		try {
			pedro.enviarMensaje(a, mensaje);
			pedro.enviarMensaje(p1, mensaje);
			assertTrue(!a.leerMensajesBuzon().isEmpty());
			assertTrue(!p1.leerMensajesBuzon().isEmpty());
		} catch (ExceptionsPersona e) {
			assert(true);
		}
	}

	@Test
	void testLeerMensajesBuzon() {
	}

	@Test
	void testLeerMensajesBuzonOrdenadorAlfabeticamente() {
	}

	@Test
	void testBorrarMensajeBuzon() {
	}

	@Test
	void testEncontrarMensajeContieneFrase() {
	}

	@Test
	void testRecibirMensaje() {
	}

}
