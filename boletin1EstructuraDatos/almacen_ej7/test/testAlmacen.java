package boletin1EstructuraDatos.almacen_ej7.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import boletin1EstructuraDatos.almacen_ej7.model.Almacen;
import boletin1EstructuraDatos.almacen_ej7.model.AlmacenExceptions;

class testAlmacen {
	
	Almacen a = new Almacen();
	
	@Test
	void testAbrirCajaCorrectamente() {
		try {
			a.abrirCaja(63);
		} catch (AlmacenExceptions e) {
			assert(false);
		}
	}
	
	@Test
	void testAbrirCajaException() {
		try {
			a.abrirCaja(63);
		} catch (AlmacenExceptions e) {
			assert(false);
		}
		
		try {
			a.abrirCaja(63);
		} catch (AlmacenExceptions e) {
			assert(true);
		}
	}

	@Test
	void testCerrarCajaCorrectamente() {
		try {
			a.abrirCaja(63);
		} catch (AlmacenExceptions e) {
			assert(false);
		}
		
		try {
			a.cerrarCaja(63);
		} catch (AlmacenExceptions e) {
			assert(false);
		}
	}
	
	@Test
	void testCerrarCajaException() {
		try {
			a.abrirCaja(63);
		} catch (AlmacenExceptions e) {
			assert(false);
		}
		
		try {
			a.cerrarCaja(63);
		} catch (AlmacenExceptions e) {
			assert(false);
		}
		
		try {
			a.cerrarCaja(63);
		} catch (AlmacenExceptions e) {
			assert(true);
		}
	}

	@Test
	void testNuevoClienteCajasVacias() {
		assertTrue(a.nuevoCliente().equalsIgnoreCase("Es usted el cliente número 1, y de debe ir a la	caja número 42"));
	}
	
	@Test
	void testNuevoClienteCajasNoVacias() {
		a.nuevoCliente();
		assertFalse(a.nuevoCliente().equalsIgnoreCase("Es usted el cliente número 3, y de debe ir a la	caja número 170"));
	}

	@Test
	void testAtenderClienteException() {
		try {
			a.atenderCliente(199);
		} catch (AlmacenExceptions e) {
			assert(true);
		}
	}

	@Test
	void testAtenderClienteCorrectamente() {
		try {
			a.abrirCaja(64);
		} catch (AlmacenExceptions e1) {
			assert(false);
		}
		a.nuevoCliente();
		try {
			a.atenderCliente(64);
		} catch (AlmacenExceptions e) {
			assert(false);
		}
	}

}
