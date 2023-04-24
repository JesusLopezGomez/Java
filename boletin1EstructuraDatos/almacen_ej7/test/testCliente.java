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
		pepe.setAsignarCaja(1);
		
		assertTrue(pepe.getCajaAsignada() == 1);
		assertTrue(pepe.getCajaAsignada() != 0);
	}
	
	@Test
	void testSetAsignarCajaKO() {
		pepe.setAsignarCaja(1);

		assertFalse(pepe.getCajaAsignada() == 2);
		assertFalse(pepe.getCajaAsignada() == 0);
	}

}
