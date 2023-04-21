package boletin1EstructuraDatos.diccionario_ej6.tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import boletin1EstructuraDatos.diccionario_ej6.Diccionario;

class testDiccionario {

	Diccionario d = new Diccionario();
	
	@Test
	void anniadirPalabra() {
		d.anniadirPalabraSignificado("Currito","lo mejor");
		d.anniadirPalabraSignificado("Currito","el mejor");
		assertFalse(d.buscarPalabra("Currito").isEmpty());

	}
	
	@Test
	void testBuscarPalabra() {
		d.anniadirPalabraSignificado("Currito", "pepito");
		assertFalse(d.buscarPalabra("Currito").isEmpty());
		assertTrue(d.buscarPalabra(null) == null);
		try {
			d.buscarPalabra(null);
		}catch(Exception e) {
			
		}
	}
	
	
	@Test
	void testListarPalabras() {
		d.anniadirPalabraSignificado("Curro","locuelo");
		assertTrue(d.listarPalabras("Curro").contains("Curro"));
		assertFalse(d.listarPalabras("Locotron").contains("Loco"));
	}

}
