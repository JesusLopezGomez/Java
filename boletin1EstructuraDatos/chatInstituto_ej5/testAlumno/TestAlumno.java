package boletin1EstructuraDatos.chatInstituto_ej5.testAlumno;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import boletin1EstructuraDatos.chatInstituto_ej5.model.Alumno;
import boletin1EstructuraDatos.chatInstituto_ej5.model.ExceptionsPersona;
import boletin1EstructuraDatos.chatInstituto_ej5.model.Mensaje;
import boletin1EstructuraDatos.chatInstituto_ej5.model.Profesor;

class TestAlumno {

	Alumno a2 = new Alumno("pepe",19);
	Alumno a3 = new Alumno("jose",29);
	Profesor p = new Profesor("Jose manuel",45);
	
	@ParameterizedTest
	@CsvSource(value = {"Manuel,17","Jorge,19","Juan,20"})
	void testEnviarMensajeCsvSource(String nombre, String edad) {
		Alumno a = new Alumno(nombre, Integer.valueOf(edad));
		try {
			a.enviarMensaje(p, "No entiendo el ejercicio 99");
		}catch(ExceptionsPersona e) {
			assert(false);
		}
		
		try {
			a.enviarMensaje(a, "que haces");
		} catch (ExceptionsPersona e) {
			assert(true);
		}
		
	} 
	
	@ParameterizedTest
	@ValueSource(strings = {"Hola que tal","que haces","de locos"})
	void testLeerMensajesBuzonValueSource(String mensaje) {
		a2.recibirMensaje(new Mensaje(a2, mensaje));
		try {
			a2.leerMensajesBuzon().isEmpty();
		} catch (ExceptionsPersona e) {
			assert(false);
		}
		
		try {
			a3.leerMensajesBuzon();
		} catch (ExceptionsPersona e) {
			assert(true);
		}
		
		
		
	}

	@ParameterizedTest
	@ValueSource(strings = {"que haces xulon","haciendo test","flama"})
	void testLeerMensajesBuzonOrdenadorValueSource(String mensaje) {
		a2.recibirMensaje(new Mensaje(a2,mensaje));
		
		try {
			a2.leerMensajesBuzonOrdenadorAlfabeticamente();
		} catch (ExceptionsPersona e) {
			assert(false);
		}
		
		try {
			a3.leerMensajesBuzonOrdenadorAlfabeticamente();
		} catch (ExceptionsPersona e) {
			assert(true);
		}
		
		
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"haciendo test","flama"})
	void borrarMensajeBuzonValueSource(String mensaje) {
		a2.recibirMensaje(new Mensaje(a2,mensaje));
		
		a2.borrarMensajeBuzon(3);

		try {
			assertFalse(a2.leerMensajesBuzon().isEmpty());
		} catch (ExceptionsPersona e) {
			assert(false);
		}
	}


	@ParameterizedTest
	@ValueSource(strings = {"Hola fran", "que tal","gg","bien"})
	void encontrarMensajeContieneFrase(String mensaje) {
		a2.recibirMensaje(new Mensaje(a2,mensaje));
		
		assertFalse(a2.encontrarMensajeContieneFrase(mensaje).isEmpty());
	}

	

}
