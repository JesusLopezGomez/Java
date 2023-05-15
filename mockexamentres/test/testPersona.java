package mockexamentres.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import mockexamentres.main.java.model.Persona;
import mockexamentres.main.java.model.PersonaException;

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
	void testPersonaStringStringStringInCorrecto() {
		try {
			Persona p = new Persona("jesus","lopez","24183609V");
		} catch (PersonaException e) {
			assert(true);
		}
	}

	@Test
	void testPersonaStringStringStringLocalDateStringCorrecto() {
		try {
			Persona p = new Persona("jesus","lopez","24483609V",LocalDate.of(2003, 11, 19),"HOMBRE");
		} catch (PersonaException e) {
			assert(false);
		}
	}
	
	@Test
	void testPersonaStringStringStringLocalDateStringInCorrecto() {
		try {
			Persona p = new Persona("jesus","lopez","24483609V",LocalDate.of(2023, 11, 19),"HOMBRE");
		} catch (PersonaException e) {
			assert(true);
		}
		
		try {
			Persona p = new Persona("jesus","lopez","24483609V",LocalDate.of(2003, 11, 19),"LOCO");
		} catch (PersonaException e) {
			assert(true);
		}
	}

	@Test
	void testValidarDatosStringStringStringCorrecto() {
		Persona p = new Persona();
		
		assertTrue(p.validarDatos("jesus", "lopez", "24483609V"));
	}
	
	@Test
	void testValidarDatosStringStringStringInCorrecto() {
		Persona p = new Persona();
		
		assertFalse(p.validarDatos("jesus", "lopez", ""));
		assertFalse(p.validarDatos("jesus", "lopez", null));
		assertFalse(p.validarDatos("jesus", "", "24483609V"));
		assertFalse(p.validarDatos("jesus", null, "24483609V"));
		assertFalse(p.validarDatos("jesus", null, "244836V"));
		assertFalse(p.validarDatos("", "lopez", "24483609V"));
		assertFalse(p.validarDatos(null, "lopez", "24483609V"));
		assertFalse(p.validarDatos("jesus", "lopez", "244836b9V"));

	}

	@Test
	void testValidarDatosStringStringStringLocalDateStringCorrecto() {
		Persona p = new Persona();
		
		assertTrue(p.validarDatos("jesus", "lopez", "24483609V", LocalDate.of(2003, 11, 19), "HOMBRE"));
	}
	
	@Test
	void testValidarDatosStringStringStringLocalDateStringInCorrecto() {
		Persona p = new Persona();
		
		assertFalse(p.validarDatos("jesus", "lopez", "24483609V",null, "HOMBRE"));
		assertFalse(p.validarDatos("jesus", "lopez", "24483609V",LocalDate.of(2003, 11, 19), null));
		assertFalse(p.validarDatos("jesus", "lopez", "24483609V",LocalDate.of(2003, 11, 19), ""));
		assertFalse(p.validarDatos("jesus", "lopez", "24483609V",LocalDate.of(2003, 11, 19), "loco"));

	}

	@Test
	void testBonoJovenDisponibleCorrecto() {
		Persona p = new Persona("jesus", "lopez", "24483609V", LocalDate.of(2003, 11, 19), "HOMBRE");
		
		assertTrue(p.bonoJovenDisponible());
	}
	
	@Test
	void testBonoJovenDisponibleInCorrecto() {
		Persona p = new Persona("jesus", "lopez", "24483609V", LocalDate.of(1985, 11, 19), "HOMBRE");
		Persona p1 = new Persona("jesus", "lopez", "24483609V", LocalDate.of(2009, 11, 19), "HOMBRE");

		assertFalse(p.bonoJovenDisponible());
		assertFalse(p1.bonoJovenDisponible());

	}

	@Test
	void testObtenerEdadCorrecto() {
		Persona p = new Persona("jesus", "lopez", "24483609V", LocalDate.of(2003, 11, 19), "HOMBRE");
		
		assertTrue(p.obtenerEdad() == 20);
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
	@CsvSource(value = {"2004,1","2005,2","2006,3"})
	void testObtenerEdadParaCorrecto(int annio , int edad) {
		Persona p = new Persona("jesus", "lopez", "24483609V", LocalDate.of(2003, 11, 19), "HOMBRE");
		
		assertTrue(p.obtenerEdadPara(annio) == edad);
	}
	
	@ParameterizedTest
	@CsvSource(value = {"2001, 2", "2004,3"})
	void testObtenerEdadParaInCorrecto(int annio , int edad) {
		Persona p = new Persona("jesus", "lopez", "24483609V", LocalDate.of(2003, 11, 19), "HOMBRE");
		
		assertFalse(p.obtenerEdadPara(annio) == edad);
	}
	
	static Stream<Arguments> listAnnio(){
		return Stream.of(Arguments.of(2004,1),
							Arguments.of(2005,2),
							Arguments.of(2006,3)
						);
	}
	
	@ParameterizedTest
	@MethodSource("listAnnio")
	void testObtenerEdadMethod(int annio, int edad) {
		Persona p = new Persona("jesus", "lopez", "24483609V", LocalDate.of(2003, 11, 19), "HOMBRE");

		assertTrue(p.obtenerEdadPara(annio) == edad);
	}
	
	@ParameterizedTest
	@CsvFileSource(files = "./files/testPersona.csv")
	void testObtenerEdadFileSource(int annio, int edad) {
		Persona p = new Persona("jesus", "lopez", "24483609V", LocalDate.of(2003, 11, 19), "HOMBRE");

		assertTrue(p.obtenerEdadPara(annio) == edad);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"HOMBRE","MUJER"})
	void testConstructorCompletoValueSource(String sexo) {
		try {
			Persona p = new Persona("jesus", "lopez", "24483609V", LocalDate.of(2003, 11, 19), sexo);
		} catch (PersonaException e) {
			assert(false);
		}
	}
}
