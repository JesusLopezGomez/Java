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
	
	public boolean addSorteo(LocalDate fechaSorteo, Combinacion combinacion) throws HistorialException {
		boolean resultado = false;
		
		if(!this.sorteos.containsKey(fechaSorteo)) {
			this.sorteos.put(fechaSorteo, combinacion);
			resultado = true;
		}else {
			throw new HistorialException("Error ese sorteo ya está añadido al historial.");
		}
		
		return resultado;
	}
	
	public boolean addSorteo(int dia, int mes, int annio, Combinacion combinacion) throws HistorialException {
		LocalDate fecha = LocalDate.of(annio, mes, dia);
		return addSorteo(fecha,combinacion);
	}
	
	public boolean actualizarSorteo(LocalDate fechaSorteo,Combinacion combinacion){
		return this.sorteos.replace(fechaSorteo, this.sorteos.get(fechaSorteo), combinacion);
	}
	
	public boolean actualizarSorteo(int dia, int mes, int annio, Combinacion combinacion) {
		LocalDate fecha = LocalDate.of(annio, mes, dia);
		return actualizarSorteo(fecha,combinacion);
	}
	
	public boolean borrarSorteo(LocalDate fechaSorteo) {
		return this.sorteos.remove(fechaSorteo) != null;
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
	
	public Map<String, Integer> comprobarAciertos(LocalDate fechaSorteo, Combinacion combinacion) throws CombinacionException{
		Map<String, Integer> aciertos = new HashMap<>();		
		if(this.sorteos.keySet().contains(fechaSorteo)) {
			aciertos.put(String.format("El sorteo dia %s, mes %s, año %s. Ha sido premiado con ", fechaSorteo.getDayOfMonth(),fechaSorteo.getMonth().toString().toLowerCase(),fechaSorteo.getYear()), combinacion.comprobarCobinacion(this.sorteos.get(fechaSorteo)));
		}
		return aciertos;
	}
	
	
}
	


	
	
