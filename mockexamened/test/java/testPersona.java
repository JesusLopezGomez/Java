package mockexamened.test.java;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import mockexamened.main.java.model.Persona;
import mockexamened.main.java.model.PersonaException;

class testPersona {

	@Test
	void testPersona() {
	}

	@Test
	void testPersonaStringStringStringCorrecto() {
		try {
			Persona p = new Persona("jesus","lopez","24483609V");
		} catch (PersonaException e) {
			assert(false);
		}
	}
	
	@Test
	void testContructorStringStringStringException() {
		try {
			Persona p = new Persona("jesus2","lopez5","12345711118V");  
		} catch (PersonaException e) {
			assert(true);
		}
	}
	@Test
	void testPersonaStringStringStringLocalDateStringCorrecto() {
		try {
			Persona p1 = new Persona("jesus","gomez","24483609V",LocalDate.of(2003, 11, 19),"HOMBRE");
		} catch (PersonaException e) {
			assert(false);
		}
	}
	
	@Test
	void testPersonaStringStringStringLocalDateStringException() {
		
		try {
			new Persona("jesus","gomez","24483609V",null,"HOMBRE");
		} catch (PersonaException e) {
			assert(true);
		}
		
	}
	
	
	@Test
	void testPersonaStringStringStringLocalDateStringException2() {
		
		try {
			new Persona("loco","gomez","24483609V",LocalDate.of(2024, 11, 19),"HOMBRE");
		} catch (PersonaException e) {
			assert(true);
		}
		
	}

	@Test
	void testValidarDatosPersonalesDniApellidoNombreIncorrecto() {
		Persona p = new Persona();

		assertFalse(p.validarDatos("", "lopez", "24483609V"));
		assertFalse(p.validarDatos("jesus", "", "24483609V"));
		assertFalse(p.validarDatos("jesus", "lopez", ""));
		assertFalse(p.validarDatos("jesus", "lopez", "24483o09V"));
	}
	
	@Test
	void testValidarDatosPersonalesDniApellidoNombreCorrecto() {
		Persona p = new Persona();

		assertTrue(p.validarDatos("jesus", "lopez", "24483609V")); //Compruebo que la persona es correcta
		assertTrue(p.validarDatos("Pepe", "gil", "24483609V")); //Compruebo que la persona es correcta

	}
	
	
	@Test
	void testValidarDatosStringStringStringLocalDateStringIncorrecto() {
		Persona p = new Persona();
		
		assertFalse(p.validarDatos("loco","gomez","24483609V",LocalDate.of(2024, 11, 19),"HOMBRE"));
		assertFalse(p.validarDatos("loco","gomez","24483609V",null,"HOMBRE"));
		assertFalse(p.validarDatos("loco","gomez","24483609V",LocalDate.of(2004, 11, 19),""));
	}

	@Test
	void testBonoJovenDisponibleCorrecto() {
		Persona p = null;
		try {
			p = new Persona("loco","gomez","24483609V",LocalDate.of(2003, 11, 19),"HOMBRE");
		} catch (PersonaException e) {
			assert(false);
		}
		
		assertTrue(p.bonoJovenDisponible());
	}
	
	@Test
	void testBonoJovenDisponibleInCorrecto() {
		Persona p = null;
		try {
			p = new Persona("loco","gomez","24483609V",LocalDate.of(2006, 11, 19),"HOMBRE");
		} catch (PersonaException e) {
			assert(false);
		}
		
		assertFalse(p.bonoJovenDisponible());
	}
	
	@Test
	void testObtenerEdadCorrecto() {
		Persona p = null;
		Persona p1 = null;
		
		try {
			p = new Persona("loco","gomez","24483609V",LocalDate.of(2003, 11, 19),"HOMBRE");
		} catch (PersonaException e) {
			assert(false);
		}
		
		try {
			p1 = new Persona("loco","gomez","24483609V",LocalDate.of(2004, 11, 19),"HOMBRE");
		} catch (PersonaException e) {
			assert(false);
		}
		
		assertTrue(p.obtenerEdad() == 20);
		assertTrue(p1.obtenerEdad() == 19);

	}

	@ParameterizedTest
	@CsvSource(value = {"2004,1","2005,2","2006,3"})
	void testObtenerEdadPara(int annio, int edad) {
		Persona p = null;
		try {
			p = new Persona("loco","gomez","24483609V",LocalDate.of(2003, 11, 19),"HOMBRE");
		} catch (PersonaException e) {
			assert(false);
		}
		assertTrue(p.obtenerEdadPara(annio) == edad);
		
	}
/*	
	@ParameterizedTest
	@MethodSource("anniosList")
	void testObtenerEdadPara2(int annio) {
		Persona p = null;
		try {
			p = new Persona("loco","gomez","24483609V",LocalDate.of(2003, 11, 19),"HOMBRE");
		} catch (PersonaException e) {
			assert(false);
		}
		assertTrue(p.obtenerEdadPara(annio));
	}*/

	
}
