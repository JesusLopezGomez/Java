package boletin1EstructuraDatos.equiposDeportivos_ej1_2_3.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import boletin1EstructuraDatos.equiposDeportivos_ej1_2_3.model.Alumno;
import boletin1EstructuraDatos.equiposDeportivos_ej1_2_3.model.Equipo;

class testAlumno {

	Alumno a = new Alumno("Jesus","123455V");
	Alumno a2 = a;
	Alumno a3 = new Alumno("Pepe","23123L");
	Equipo e = new Equipo("Betis");
	
	@Test
	void testEqualsObjectOK() {
		assertTrue(a2.equals(a));
	}
	
	@Test
	void testEqualsObjectKO() {
		assertFalse(a3.equals(a));
		try {
			a3.equals(null);
		}catch(Exception e) {
			assert(true);
		}
		try {
			a2.equals(e);
		}catch(Exception e) {
			assert(true);
		}

		
	}


	@Test
	void testToString() {
		a.toString();
	}

}
