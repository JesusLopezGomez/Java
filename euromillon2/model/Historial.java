package euromillon2.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Historial {

	private Map<LocalDate, Combinacion> sorteos;
	
	public Historial() {
		this.sorteos = new HashMap<>();
	}
	
	public boolean addSorteo(LocalDate fecha, Combinacion combinacion) throws HistorialException {
		
		if(sorteos.containsKey(fecha)) {
			throw new HistorialException("Error, sorteo ya existente.");
		}
		
		return sorteos.put(fecha, combinacion) == null;
	}
	
	public boolean addSorteo(int annio, int mes, int dia, Combinacion combinacion) throws HistorialException {
		return addSorteo(LocalDate.of(annio, mes, dia), combinacion);
	}
	
	public void addSorteo(String linea) throws CombinacionException {
		String[] datos = linea.split(",");
		LocalDate fecha = LocalDate.parse(datos[0],DateTimeFormatter.ofPattern("d/MM/yyyy"));
		String[] numeros = Arrays.copyOfRange(datos,1,6);
		String[] estrellas = Arrays.copyOfRange(datos,7,9);
		sorteos.put(fecha, new Combinacion(numeros,estrellas));
	}
	
	public boolean actualizarSorteo(LocalDate fecha, Combinacion combinacion) throws HistorialException {
		if(!this.sorteos.containsKey(fecha) || fecha == null || combinacion == null) {
			throw new HistorialException("Error, no hay sorteos en esta fecha, o has introducido una fecha o combinacion que no es válida.");
		}
		return this.sorteos.replace(fecha, this.sorteos.get(fecha), combinacion);
	}
	
	
	public boolean actualizarSorteo(int annio, int mes, int dia, Combinacion combinacion) throws HistorialException {
		return actualizarSorteo(LocalDate.of(annio, mes, dia),combinacion);
	}

	public boolean borrarSorteo(LocalDate fecha) throws HistorialException {
		if(!this.sorteos.containsKey(fecha) || fecha == null ) {
			throw new HistorialException("Error, no hay sorteos en esa fecha, o la fecha es incorrecta");
		}
		return this.sorteos.remove(fecha) != null;
	}
	
	public List<String> listarSorteosDesdeFecha(LocalDate fecha){
		List<String> listaSorteos = new ArrayList<>();
		if(fecha != null) {
			for(LocalDate c : this.sorteos.keySet()) {
				if(c.isAfter(fecha)) {
					listaSorteos.add(c.toString() +" "+this.sorteos.get(c).toString());
				}
			}
			Collections.sort(listaSorteos);
		}
		return listaSorteos;
	}
	
	public List<String> mostrarHistorico(){
		List<String> listaHistorico = new ArrayList<>();

		for(LocalDate l : this.sorteos.keySet()) {
			listaHistorico.add(this.sorteos.get(l).toString());
		}
		
		return listaHistorico;
	}
	
	public Map<String, Integer> comprobarAciertos(LocalDate fecha, Combinacion combinacion) throws HistorialException{
		
		if(combinacion == null || !this.sorteos.containsKey(fecha)) {
			throw new HistorialException("Error, no hay sorteos en esa fecha, o la combinacion y la fecha no son correctas.");
		}
		Map<String, Integer> aciertos = new HashMap<>();
		
		aciertos.put(String.format("Sorteo a dia %s, mes %s y año %s, ha sido premiado con ", fecha.getDayOfMonth(), fecha.getMonth(), fecha.getYear()), combinacion.comprobarCombinacion(this.sorteos.get(fecha)));

		return aciertos;
	}

}
