package boletin1EstructuraDatos.chatInstituto_ej5.testAlumno;

import static org.junit.Assert.assertFalse;

import java.io.File;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import boletin1EstructuraDatos.chatInstituto_ej5.model.Alumno;
import boletin1EstructuraDatos.chatInstituto_ej5.model.ExceptionsPersona;
import boletin1EstructuraDatos.chatInstituto_ej5.model.Mensaje;
import boletin1EstructuraDatos.chatInstituto_ej5.model.Profesor;

class TestAlumno {

	Alumno a3 = new Alumno("jose",29);
	Profesor p = new Profesor("Jose manuel",45);
	
	@ParameterizedTest
	@CsvSource(value = {"alumno,17","profesor,19","alumno,20","profesor,15"})
	void testEnviarMensajeCsvSource(String nombre, String edad) {
		Alumno a = new Alumno("pepe",Integer.valueOf(edad));
		Alumno a2 = null;
		Profesor p2 = null;
	
		if(nombre.equals("alumno")) {
			a2 = new Alumno("pepito",Integer.valueOf(edad));
			try {
				a.enviarMensaje(a2, "que haces");
			} catch (ExceptionsPersona e) {
				assert(true);
			}
		}else {
			p2 = new Profesor("pepon",Integer.valueOf(edad));
			try {
				a.enviarMensaje(p2, "No entiendo el ejercicio 99");
			}catch(ExceptionsPersona e) {
				assert(false);
			}
		}			

	} 
	
	@ParameterizedTest
	@CsvFileSource(files  = {"./files/testEnviarMensajeAlumno.csv"})
	void testEnviarMensajeCsvFile(String nombre, String edad) {
		Alumno a = new Alumno("pepe",Integer.valueOf(edad));
		Alumno a2 = null;
		Profesor p2 = null;
		
		if(nombre.equals("alumno")) {
			a2 = new Alumno("pepito",Integer.valueOf(edad));
			try {
				a.enviarMensaje(a2, "que haces");
			} catch (ExceptionsPersona e) {
				assert(true);
			}
		}else {
			p2 = new Profesor("pepon",Integer.valueOf(edad));
			try {
				a.enviarMensaje(p2, "No entiendo el ejercicio 99");
			}catch(ExceptionsPersona e) {
				assert(false);
			}
		}			

	} 
	
	@ParameterizedTest
	@ValueSource(strings = {"Hola que tal","que haces",""})
	void testLeerMensajesBuzonValueSource(String mensaje) {
		
		if(!mensaje.isEmpty()) {
			a3.recibirMensaje(new Mensaje(a3, mensaje));	
		}
		try {
			a3.leerMensajesBuzon();
		} catch (ExceptionsPersona e) {
			assert(true);
		}		
	}

	@ParameterizedTest
	@ValueSource(strings = {"que haces xulon","haciendo test",""})
	void testLeerMensajesBuzonOrdenadorValueSource(String mensaje) {
		
		if(!mensaje.isEmpty()) {
			a3.recibirMensaje(new Mensaje(a3,mensaje));
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
		a3.recibirMensaje(new Mensaje(a3,mensaje));
		
		a3.borrarMensajeBuzon(3);

		try {
			assertFalse(a3.leerMensajesBuzon().isEmpty());
		} catch (ExceptionsPersona e) {
			assert(false);
		}
	}


	@ParameterizedTest
	@ValueSource(strings = {"Hola fran", "que tal","gg","bien"})
	void encontrarMensajeContieneFrase(String mensaje) {
		a3.recibirMensaje(new Mensaje(a3,mensaje));
		
		assertFalse(a3.encontrarMensajeContieneFrase(mensaje).isEmpty());
	}

	

}
