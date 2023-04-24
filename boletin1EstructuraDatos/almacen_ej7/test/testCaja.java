package boletin1EstructuraDatos.almacen_ej7.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import boletin1EstructuraDatos.almacen_ej7.model.AlmacenExceptions;
import boletin1EstructuraDatos.almacen_ej7.model.Caja;
import boletin1EstructuraDatos.almacen_ej7.model.Cliente;

class testCaja {

	Caja caja1 = new Caja();
	
	@Test
	void testGetEstadoTrue() {
		try {
			caja1.abrirCaja();
		} catch (AlmacenExceptions e) {
			assert(false);
		}
		assertTrue(caja1.getEstado());
		
	}
	
	@Test
	void testGetEstadoFalse() {
		assertFalse(caja1.getEstado());
	}

	@Test
	void testGetNumeroCajaCorrecto() {
		assertTrue(caja1.getNumeroCaja() == 1);
	}
	
	@Test
	void testGetNumeroCajaIncorrecto() {
		caja1.getNumeroCaja();
		assertFalse(caja1.getNumeroCaja() == 2);
	}

	@Test
	void testAsignarCliente() {
		caja1.asignarCliente(new Cliente());
	
		assertTrue(caja1.getClientesEnCaja()==1);
	}

	@Test
	void testGetClientesEnCaja() {
		assertTrue(caja1.getClientesEnCaja()==0);
	}

	@Test
	void testAbrirCajaTrue() {
		try {
			caja1.abrirCaja();
		} catch (AlmacenExceptions e) {
			assert(false);
		}
		assertTrue(caja1.getEstado());
	}
	
	@Test
	void testAbrirCajaException() {
		try {
			caja1.abrirCaja();
		} catch (AlmacenExceptions e) {
			assert(false);
		}
		
		try {
			caja1.abrirCaja();
		} catch (AlmacenExceptions e) {
			assert(true);
		}
		
		
	}


	@Test
	void testAtenderClienteVacia() {
		try {
			caja1.abrirCaja();
		} catch (AlmacenExceptions e1) {
			assert(false);
		}
		try {
			caja1.atenderCliente();
		} catch (AlmacenExceptions e) {
			assert(true);
		}
	}
	
	@Test
	void testAtenderClienteCerrada() {
		try {
			caja1.atenderCliente();
		} catch (AlmacenExceptions e) {
			assert(true);
		}
	}
	
	@Test
	void testAtenderClienteConClientes() {
		try {
			caja1.abrirCaja();
		} catch (AlmacenExceptions e1) {
			assert(false);
		}
		
		caja1.asignarCliente(new Cliente());
		
		try {
			assertTrue(caja1.atenderCliente() != null);
		} catch (AlmacenExceptions e) {
			assert(false);
		}
	}
	
	

	@Test
	void testCerrarCajaCorrecto() {
		try {
			caja1.abrirCaja();
		} catch (AlmacenExceptions e1) {
			assert(false);
		}
		
		try {
			caja1.cerrarCaja();
		} catch (AlmacenExceptions e) {
			assert(false);
		}
		
		assertFalse(caja1.getEstado());
	}
	
	@Test
	void testCerrarCajaException() {
		
		try {
			caja1.cerrarCaja();
		} catch (AlmacenExceptions e) {
			assert(true);
		}

	}
	
	@Test
	void testCerrarCajaConClientes() {
		caja1.asignarCliente(new Cliente());
		try {
			caja1.cerrarCaja();
		} catch (AlmacenExceptions e) {
			assert(true);
		}

	}

}
