package mapeando2.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Mapeando2 {

	public Map mapearPersonasPorGenero(Collection<Persona2> personas) {
		Map<Genero2, Collection<Persona2>> generosPersonas = new HashMap<>();
		for(Persona2 p: personas) {
			if(!generosPersonas.containsKey(p.getGenero())) {
				generosPersonas.put(p.getGenero(), new HashSet<>());
			}
			generosPersonas.get(p.getGenero()).add(p);
		}
		return generosPersonas;
		
	}
	
	public Map<Integer, Integer> contarNumeros(Collection<Integer> numeros){
		Map<Integer, Integer> resultadoNumeros = new HashMap<>();
		for(Integer n : numeros) {
			if(!resultadoNumeros.containsKey(n)) {
				resultadoNumeros.put(n, 0);
			}
			resultadoNumeros.replace(n, resultadoNumeros.get(n), resultadoNumeros.get(n)+1);
		}
		return resultadoNumeros;
	}

}
