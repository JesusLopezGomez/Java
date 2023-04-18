package mapeando.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

import mapeando.model.Genero;
import mapeando.model.Mapeando;
import mapeando.model.Persona;

class testMapeando {

	Mapeando m = new Mapeando();
	Set<Persona> conjuntoPersonas = new HashSet<>();
	List<Persona> listaPersonas = new ArrayList<>();
	List<Persona> listaPersonas2 = new ArrayList<>();	
	@Test
	void testMapearPersonasPorGeneroOK() {
		listaPersonas.add(new Persona("Jesus","Lopez",Genero.MASCULINO));
		listaPersonas.add(new Persona("Mario","Luis",Genero.MASCULINO));
		listaPersonas.add(new Persona("Maria","Ruiz",Genero.FEMENINO));
		listaPersonas.add(new Persona("Luisa","Rodriguez",Genero.FEMENINO));
		conjuntoPersonas.add(new Persona("Jesus","Lopez",Genero.MASCULINO));
		conjuntoPersonas.add(new Persona("Mario","Luis",Genero.MASCULINO));
		conjuntoPersonas.add(new Persona("Maria","Ruiz",Genero.FEMENINO));
		conjuntoPersonas.add(new Persona("Luisa","Rodriguez",Genero.FEMENINO));
		assertTrue(m.mapearPersonasPorGenero(listaPersonas).containsKey(Genero.FEMENINO));
		assertTrue(m.mapearPersonasPorGenero(listaPersonas2).isEmpty());
		assertTrue(m.mapearPersonasPorGenero(conjuntoPersonas).containsKey(Genero.MASCULINO));
		assertFalse(m.mapearPersonasPorGenero(conjuntoPersonas).isEmpty());

	}
	
	@Test
	void testMapearPersonasPorGeneroKO() {
		assertFalse(m.mapearPersonasPorGenero(listaPersonas).containsKey(Genero.DESCONOCIDO));
		assertTrue(m.mapearPersonasPorGenero(listaPersonas2).isEmpty());
		assertFalse(m.mapearPersonasPorGenero(conjuntoPersonas).containsKey(Genero.DESCONOCIDO));
		assertTrue(m.mapearPersonasPorGenero(conjuntoPersonas).isEmpty());
	}

	@Test
	void testContarNumerosOK() {
		List<Integer> numeros = new ArrayList<>();
		
		numeros.add(1);
		numeros.add(1);
		numeros.add(3);
		numeros.add(3);
		numeros.add(1);
		numeros.add(5);
		
		assertTrue(m.contarNumeros(numeros).containsKey(1));
		assertFalse(m.contarNumeros(numeros).isEmpty());
	}
	
	@Test
	void testContarNumerosKO() {
		List<Integer> numeros = new ArrayList<>();

		
		assertTrue(m.contarNumeros(numeros).isEmpty());
		assertFalse(m.contarNumeros(numeros).containsKey(7));
	}


}
