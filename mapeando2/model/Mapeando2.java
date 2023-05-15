package mapeando2.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Mapeando2 {

	public Map mapearPersonasPorGenero(Collection<Persona2> personas) {
		Map<Genero2,Collection<Persona2>> generosPersona = new HashMap<>();
		for(Persona2 p : personas) {
			if(!generosPersona.containsKey(p.getGenero())) {
				generosPersona.put(p.getGenero(), new ArrayList<>());
			}
			generosPersona.get(p.getGenero()).add(p);
		}
		return generosPersona;
		
	}
	
	public Map<Integer, Integer> contarNumeros(Collection<Integer> numeros){
		Map<Integer, Integer> numerosRep = new HashMap<>();
		for(Integer n : numeros) {
			if(!numerosRep.containsKey(n)) {
				numerosRep.put(n, 0);
			}
			numerosRep.replace(n, numerosRep.get(n), numerosRep.get(n)+1);
		}
		return numerosRep;
	}

}
