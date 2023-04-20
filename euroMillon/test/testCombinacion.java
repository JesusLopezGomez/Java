package euroMillon.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import euroMillon.model.Combinacion;
import euroMillon.model.CombinacionException;

class testCombinacion {
	
	int[] numeros = {1,2,3,4,5};
	int[] estrellas = {7,8};
	@Test
	void testHashCodeOK() {
		Combinacion c = null;
		try {
			c = new Combinacion(numeros,estrellas);
		} catch (CombinacionException e) {
			assert(false);
		}
		assertTrue(c.hashCode() != 0);
		assertTrue(!Character.isLowerCase(c.hashCode()));
		assertTrue(c.hashCode() > 0);

	}
	
	@Test
	void testHashCodeKO() {
		Combinacion c = null;
		try {
			c.hashCode();
		}catch(Exception e) {
			assert(true);
		}
	}

	@Test
	void testGetNumerosOK() {
		Combinacion c = null;
		try {
			 c = new Combinacion(numeros,estrellas);
		} catch (CombinacionException e) {
			
		}
		assertFalse(c.getNumeros().isEmpty());
		assertTrue(c.getNumeros().contains(1));
	}
	
	@Test
	void testGetNumerosKO() {
		Combinacion c = null;
		try {
			c = new Combinacion(numeros,estrellas);
		} catch (CombinacionException e1) {
			assert(false);
		}
		assertFalse(c.getNumeros().size() != 5);
	}

	@Test
	void testGetEstrellasOK() {
		Combinacion c = null;
		try {
			 c = new Combinacion(numeros,estrellas);
		} catch (CombinacionException e) {
			
		}
		assertFalse(c.getEstrellas().isEmpty());
		assertTrue(c.getEstrellas().contains(7));
	}
	
	@Test
	void testGetEstrellasKO() {
		Combinacion c = null;
		try {
			c = new Combinacion(numeros,estrellas);
		} catch (CombinacionException e1) {
			assert(false);
		}
		assertFalse(c.getEstrellas().size() != 2);
	}

	@Test
	void testComprobarCobinacionOK() {
		Combinacion c = null;
		Combinacion c2 = null;
		try {
			c = new Combinacion(numeros,estrellas);
			c2 = new Combinacion(1,2,3,5,7,8,9);
		} catch (CombinacionException e1) {
			assert(false);
		}
		try {
			assertTrue(c.comprobarCobinacion(c2) == 5);
			assertTrue(c.comprobarCobinacion(c2) != 0);
		} catch (CombinacionException e) {
			assert(false);
		}
	}
	
	@Test
	void testComprobarCobinacionKO() {
		Combinacion c = null;
		Combinacion c2 = null;
		try {
			c = new Combinacion(numeros,estrellas);
			c2 = new Combinacion(1,2,3,5,7,8,9);
		} catch (CombinacionException e1) {
			assert(false);
		}
		
		try {
			c.comprobarCobinacion(null);
		} catch (CombinacionException e2) {
			assert(true);
		}
	}

	@Test
	void testToArrayEnterosOK(){
		Combinacion c = null;
		assertTrue(c.toArrayEnteros(1,2,3,4,5).length == 5);
		assertFalse(c.toArrayEnteros(1,2,3,5).length != 5);

	}
	
	@Test
	void testToArrayEnterosKO(){
		Combinacion c = null;
		try {
			c.toArrayEnteros(null);
		}catch(Exception e) {
			assert(true);
		}
	}

	@Test
	void testEqualsObject() {
		Object c = null;
		Object c2 = null;
		try {
			c = new Combinacion(numeros,estrellas);
			c2 = new Combinacion(1,2,3,5,7,8,9);
		} catch (CombinacionException e1) {
			assert(false);
		}
		assertFalse(c2.equals(c));
	}

	@Test
	void testToString() {
		Combinacion c = null;
		try {
			c = new Combinacion(numeros,estrellas);
		} catch (CombinacionException e1) {
			assert(false);
		}
		assertFalse(c.toString().isEmpty());
		assertTrue(c.toString() != null);

	}

}
