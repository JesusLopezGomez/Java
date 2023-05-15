package mockexameneddos.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import mockexameneddos.main.java.model.Persona;
import mockexameneddos.main.java.model.PersonaException;

class testPersona {

	@Test
	void testPersonaStringStringStringCorrectamente() {
		
		try {
			Persona p = new Persona("jesus","lopez","24483609V");
		} catch (PersonaException e) {
			assert(false);
		}
		
	}
	
	@Test
	void testPersonaStringStringStringInCorrecto() {
		
		try {
			Persona p = new Persona("jesus","lopez","24413609V");
		} catch (PersonaException e) {
			assert(true);
		}
		
	}
	
	@Test
	void testPersonaStringStringStringInCorrecto2() {
		
		try {
			Persona p = new Persona("jesus","","24483609V");
		} catch (PersonaException e) {
			assert(true);
		}
		
	}

	@Test
	void testPersonaStringStringStringLocalDateStringCorrectamente() {
		try {
			Persona p = new Persona("jesus", "lopez", "24483609V", LocalDate.of(2003, 11, 19), "HOMBRE");
		} catch (PersonaException e) {
			assert(false);
		}
	}
	
	@Test
	void testPersonaStringStringStringLocalDateStringInCorrecto() {
		try {
			Persona p = new Persona("jesus", "lopez", "24483609V", LocalDate.of(2024, 11, 19), "HOMBRE");
		} catch (PersonaException e) {
			assert(true);
		}
	}
	
	@Test
	void testPersonaStringStringStringLocalDateStringInCorrecto2() {
		try {
			Persona p = new Persona("jesus", "lopez", "24483609V", LocalDate.of(2003, 11, 19), "loco");
		} catch (PersonaException e) {
			assert(true);
		}
	}

	@Test
	void testValidarDatosStringStringStringCorrectamente() {
		Persona p = new Persona();
		
		assertTrue(p.validarDatos("jesus", "lopez", "24483609V"));
		assertTrue(p.validarDatos("locotron", "loquillo", "24483609V"));
	}	
	
	@Test
	void testValidarDatosStringStringStringInCorrecto() {
		Persona p = new Persona();
		
		assertFalse(p.validarDatos("jesus", "lopez", "24413609V"));
		assertFalse(p.validarDatos("locotron", "", "24483609V"));
		assertFalse(p.validarDatos("locotron", null, "24483609V"));
		assertFalse(p.validarDatos("", "lo", "24483609V"));
		assertFalse(p.validarDatos(null, "lo", "24483609V"));
		assertFalse(p.validarDatos("louelo", "lo", ""));
		assertFalse(p.validarDatos("louelo", "lo", null));
		assertFalse(p.validarDatos("", "lo", "244836a9V"));

	}

	@Test
	void testValidarDatosStringStringStringLocalDateStringCorrecto() {
		Persona p = new Persona();
		assertTrue(p.validarDatos("jesus", "lopez", "24483609V", LocalDate.of(2003, 10, 21), "hombre"));
		assertTrue(p.validarDatos("maria", "lopez", "24483609V", LocalDate.of(2005, 10, 22), "mujer"));
	}

	@Test
	void testValidarDatosStringStringStringLocalDateStringInCorrecto() {
		Persona p = new Persona();
		assertFalse(p.validarDatos("jesus", "lopez", "24483609V", LocalDate.of(2023, 10, 21), "hombre"));
		assertFalse(p.validarDatos("maria", "lopez", "24483609V", LocalDate.of(2005, 10, 22), "loco"));
		assertFalse(p.validarDatos("maria", "lopez", "24483609V", null, "loco"));
		assertFalse(p.validarDatos("maria", "lopez", "24483609V", LocalDate.of(2005, 10, 22), null));
	}
	
	@Test
	void testBonoJovenDisponibleCorrecto() {
		Persona p = null;
		Persona p1 = null;
		try {
			p = new Persona("jesus", "lopez", "24483609V", LocalDate.of(2003, 10, 21), "HOMBRE");
			p1 = new Persona("maria", "gil", "24483609V", LocalDate.of(2003, 10, 21), "MUJER");
		} catch (PersonaException e) {
			assert(false);
		}
		
		assertTrue(p.bonoJovenDisponible());	
		assertTrue(p1.bonoJovenDisponible());	
		
	}
	
	@Test
	void testBonoJovenDisponibleInCorrecto() {
		Persona p = null;
		Persona p1 = null;
		try {
			p = new Persona("jesus", "lopez", "24483609V", LocalDate.of(1990, 10, 21), "HOMBRE");
			p1 = new Persona("maria", "gil", "24483609V", LocalDate.of(1990, 10, 21), "MUJER");
		} catch (PersonaException e) {
			assert(false);
		}
		
		assertFalse(p.bonoJovenDisponible());	
		assertFalse(p1.bonoJovenDisponible());	
		
	}

	@Test
	void testObtenerEdadCorrecto() {
		Persona p = null;
		Persona p1 = null;
		try {
			p = new Persona("jesus", "lopez", "24483609V", LocalDate.of(1990, 10, 21), "HOMBRE");
			p1 = new Persona("maria", "gil", "24483609V", LocalDate.of(1989, 10, 21), "MUJER");
		} catch (PersonaException e) {
			assert(false);
		}
		
		assertTrue(p.obtenerEdad() == 33);
		assertTrue(p1.obtenerEdad() == 34);

	}
	
	@Test
	void testObtenerEdadInCorrecto() {
		Persona p = null;
		Persona p1 = null;
		try {
			p = new Persona("jesus", "lopez", "24483609V", LocalDate.of(1990, 10, 21), "HOMBRE");
			p1 = new Persona("maria", "gil", "24483609V", LocalDate.of(1989, 10, 21), "MUJER");
		} catch (PersonaException e) {
			assert(false);
		}
		
		assertFalse(p.obtenerEdad() == 20);
		assertFalse(p1.obtenerEdad() == 24);

	}

	@ParameterizedTest
	@CsvSource( value = {"2005,2" , "2004,1" , "2006,3"})
	void testObtenerEdadParaCorrecto(int annio, int edad) {
		Persona p = null;
		try {
			p = new Persona("jesus", "lopez", "24483609V", LocalDate.of(2003, 10, 21), "HOMBRE");
		} catch (PersonaException e) {
			assert(false);
		}
		
		assertTrue(p.obtenerEdadPara(annio) == edad);
		
	}
	
	@ParameterizedTest
	@CsvSource( value = {"2005,2" , "2004,1" , "2006,3"})
	void testObtenerEdadParaInCorrecto(int annio, int edad) {
		Persona p = null;
		try {
			p = new Persona("jesus", "lopez", "24483609V", LocalDate.of(2002, 10, 21), "HOMBRE");
		} catch (PersonaException e) {
			assert(false);
		}
		
		assertFalse(p.obtenerEdadPara(annio) == edad);
		
	}

}
