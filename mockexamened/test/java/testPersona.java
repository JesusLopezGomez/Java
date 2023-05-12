package mockexamened.test.java;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import mockexamened.main.java.model.Persona;
import mockexamened.main.java.model.PersonaException;

class testPersona {

	@Test
	void testPersona() {
		fail("Not yet implemented");
	}

	@Test
	void testContructorCorrecto() {
		
		try {
			Persona p = new Persona("jesus","lopez","12345678V");  
		} catch (PersonaException e) {
			assert(false);
		}
		
	}

	@Test
	void testPersonaStringStringStringLocalDateString() {
		fail("Not yet implemented");
	}

	@Test
	void testValidarDatosStringStringString() {
		fail("Not yet implemented");
	}

	@Test
	void testValidarDatosStringStringStringLocalDateString() {
		fail("Not yet implemented");
	}

	@Test
	void testBonoJovenDisponible() {
		fail("Not yet implemented");
	}

	@Test
	void testObtenerEdad() {
		fail("Not yet implemented");
	}

	@Test
	void testObtenerEdadPara() {
		fail("Not yet implemented");
	}

	@Test
	void testGetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testSetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testGetApellido() {
		fail("Not yet implemented");
	}

	@Test
	void testSetApellido() {
		fail("Not yet implemented");
	}

	@Test
	void testGetDni() {
		fail("Not yet implemented");
	}

	@Test
	void testSetDni() {
		fail("Not yet implemented");
	}

	@Test
	void testGetFechaNacimiento() {
		fail("Not yet implemented");
	}

	@Test
	void testSetFechaNacimiento() {
		fail("Not yet implemented");
	}

	@Test
	void testGetGenero() {
		fail("Not yet implemented");
	}

	@Test
	void testSetGenero() {
		fail("Not yet implemented");
	}

}
