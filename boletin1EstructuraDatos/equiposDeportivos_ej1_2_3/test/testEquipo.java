package boletin1EstructuraDatos.equiposDeportivos_ej1_2_3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import boletin1EstructuraDatos.equiposDeportivos_ej1_2_3.model.Alumno;
import boletin1EstructuraDatos.equiposDeportivos_ej1_2_3.model.AlumnoException;
import boletin1EstructuraDatos.equiposDeportivos_ej1_2_3.model.Equipo;

class testEquipo {

	Alumno a = new Alumno("Jesus","123455V");
	Alumno a2 = a;
	Alumno a3 = new Alumno("Pepe","23123L");
	Alumno a4 = new Alumno("Jose","45123K");
	Equipo e = new Equipo("Betis");
	Equipo e2 = new Equipo("Sevilla");
	
	@Test
	void testAnniadirAlumnoOK() {
		try {
			e.anniadirAlumno(a);
		}catch(AlumnoException e) {
			assert(false);
		}
	}
	
	@Test
	void testAnniadirAlumnoKO() {

		try {
			e.anniadirAlumno(a);
			e.anniadirAlumno(a);
		}catch(AlumnoException e) {
			assert(true);
		}
	}
	
	@Test
	void testAnniadirAlumnoKONull() {
		try {
			e.anniadirAlumno(null);
		} catch (AlumnoException e) {
			assert(true);
		}
	}

	@Test
	void testDelAlumnoOK() {
		try {
			e.anniadirAlumno(a);
			e.delAlumno(a);
		} catch (AlumnoException e) {
			assert(false);
		}
	}

	@Test
	void testDelAlumnoKO() {
		try {
			e.delAlumno(a);
		} catch (AlumnoException e) {
			assert(true);
		}
	}
	
	@Test
	void testExisteAlumnoOK() {
		try {
			e.anniadirAlumno(a);
		} catch (AlumnoException e1) {
			assert(false);
		}
	}
	
	@Test
	void testExisteAlumnoKO() {
		assertEquals(e.existeAlumno(null), null);
		try {
			e.anniadirAlumno(a);
		} catch (AlumnoException e1) {
			assert(false);
		}
	}

	@Test
	void testUnionEquipoOK() {
		try {
			e.anniadirAlumno(a);
			e2.anniadirAlumno(a3);
		} catch (AlumnoException e) {
			assert(false);
		}
		assertNotEquals(e.unionEquipo(e2),null);
	}
	
	@Test
	void testUnionEquipoKO() {
		try {
			e.anniadirAlumno(a);
			e2.anniadirAlumno(a);
		} catch (AlumnoException e) {
			assert(true);
		}
		assertEquals(e.unionEquipo(e2), e);
	}
	
	@Test
	void testUnionEquipoKONull() {
		try {
			e.anniadirAlumno(a);
			e2.anniadirAlumno(a);
		} catch (AlumnoException e) {
			assert(true);
		}
		assertEquals(e.unionEquipo(null),e);
	}


	@Test
	void testIntersectEquipoOK() {
		try {
			e.anniadirAlumno(a);
			e.anniadirAlumno(a3);
			e.anniadirAlumno(a4);
			e2.anniadirAlumno(a3);
			e2.anniadirAlumno(a4);
			e.intersectEquipo(e2);
		} catch (AlumnoException e) {
			assert(false);
		}
		assertEquals(e.intersectEquipo(e2),e);
		assertNotEquals(e.intersectEquipo(e2),e2);

	}
	
	@Test
	void testIntersectEquipoKON() {
		try {
			e.anniadirAlumno(a);
			e.anniadirAlumno(a3);
			e.anniadirAlumno(a4);
			e2.anniadirAlumno(a3);
		} catch (AlumnoException e) {
			assert(false);
		}	
		assertEquals(e.intersectEquipo(e2),e);
	}

	@Test
	void testToString() {
		assertTrue(e.toString().equals(e.toString()));
	}

}
