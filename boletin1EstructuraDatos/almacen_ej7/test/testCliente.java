package boletin1EstructuraDatos.almacen_ej7.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import boletin1EstructuraDatos.almacen_ej7.model.Caja;
import boletin1EstructuraDatos.almacen_ej7.model.Cliente;

class testCliente {

	Cliente pepe = new Cliente();
	Cliente pepito = null;
	Caja caja1 = new Caja(); 
	
	@Test
	void testGetCodigoOK() {
		assertTrue(pepe.getCodigo() == 2);
	}
	
	@Test
	void testGetCodigoKO() {
		assertFalse(pepe.getCodigo() == 2);
	}

	@Test
	void testSetAsignarCajaOK() {

	}
	
	@Test
	void testSetAsignarCajaKO() {

	}

}
