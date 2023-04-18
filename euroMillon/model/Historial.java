package euroMillon.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Historial {

	private Map<LocalDate,Combinacion> sorteos;
	
	public Historial() {
		super();
		this.sorteos = new HashMap<>();
	}
	
	public boolean addSorteo(LocalDate fechaSorteo, Combinacion combinacion) throws CombinacionException {
		boolean resultado = false;
		
		if(!this.sorteos.containsKey(fechaSorteo)) {
			this.sorteos.put(fechaSorteo, combinacion);
			resultado = true;
		}else {
			throw new CombinacionException("Error ese sorteo ya está añadido al historial.");
		}
		
		return resultado;
	}
	
	public boolean addSorteo(int dia, int mes, int annio, Combinacion combinacion) throws CombinacionException {
		boolean resultado = false;
		
		if(!this.sorteos.containsKey(LocalDate.of(annio, mes, dia))) {
			this.sorteos.put(LocalDate.of(annio, mes, dia), combinacion);
			resultado = true;
		}else {
			throw new CombinacionException("Error ese sorteo ya está añadido al historial.");
		}
		
		return resultado;
	}
	
	public boolean actualizarSorteo(int dia, int mes, int annio, Combinacion combinacion) {
		boolean actualizado = false;
		for(LocalDate l : this.sorteos.keySet()) {
			if(!l.equals(LocalDate.of(annio, mes, dia))) {
				this.sorteos.replace(l, this.sorteos.get(l), combinacion);
				actualizado = true;
			}
		}
		return actualizado;
	}
	
	public boolean actualizarSorteo(LocalDate fechaSorteo,Combinacion combinacion){
		boolean actualizado = false;
		for(LocalDate l : this.sorteos.keySet()) {
			if(!l.equals(fechaSorteo)) {
				this.sorteos.replace(l, this.sorteos.get(l), combinacion);
				actualizado = true;
			}
		}
		return actualizado;
	}
	
	public boolean borrarSorteo(LocalDate fechaSorteo) {
		boolean borrado = false;
		if(this.sorteos.containsKey(fechaSorteo)) {
			this.sorteos.remove(fechaSorteo);
			borrado = true;
		}else {
			borrado = false;
		}
		return borrado;
	}
	
	public List<String> listarSorteosDesdeFecha(LocalDate fechaSorteo){
		List<String> listaDesdeFecha = new ArrayList<>();
		
		for(LocalDate l : this.sorteos.keySet()) {
			if(l.isAfter(fechaSorteo)) {
				listaDesdeFecha.add(this.sorteos.get(l).toString());
			}
		}
		
		return listaDesdeFecha;
	}
	
	public List<String> mostrarHistorico(){
		List<String> listaHistorico = new ArrayList<>();
		
		for(LocalDate l : this.sorteos.keySet()) {
			listaHistorico.add(this.sorteos.get(l).toString());
		}
		
		return listaHistorico;
	}
	
	public Map<String, Integer> comprobarAciertos(LocalDate fechaSorteo, Combinacion combinacion){
		Map<String, Integer> aciertos = new HashMap<>();
		int contNum = 0;
		int contEstrellas = 0;
		for(LocalDate l : this.sorteos.keySet()) {
			if(l.equals(fechaSorteo)) {
				for(Integer n : this.sorteos.get(l).getNumeros()) {
					for(Integer n2 : combinacion.getNumeros())
						if(n.equals(n2)) {
							contNum++;
						}
				}
				for(Integer n : this.sorteos.get(l).getEstrellas()) {
					for(Integer n2 : combinacion.getEstrellas()) {
						if(n.equals(n2)) {
							contEstrellas++;
						}
					}
				}
				
			}
		
		}
		if(this.sorteos.keySet().contains(fechaSorteo)) {
			aciertos.put(String.format("El sorteo dia %s, mes %s, año %s. Ha sido premiado con ", fechaSorteo.getDayOfMonth(),fechaSorteo.getMonth(),fechaSorteo.getYear()), contNum + contEstrellas);
		}
		return aciertos;
	}
	
	
}
	


	
	
