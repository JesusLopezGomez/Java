package euromillon2.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
	
	public Set<Integer> numeroMasRepetido() {
		Map<Integer, Integer> numerosRepetidos = numeroRepetidos();
		Set<Integer> conjuntoNumeros = new HashSet<>();
		conjuntoNumeros.add(1);
		for(Integer i : numerosRepetidos.keySet()) {
			for(Integer e : conjuntoNumeros) {
				if(numerosRepetidos.get(i) > numerosRepetidos.get(e)) {
					conjuntoNumeros.clear();
					conjuntoNumeros.add(i);
				}
			}
		}
		
		return conjuntoNumeros;
	}
	
	public Set<Integer> numeroMenosRepetido() {
		Map<Integer, Integer> numerosRepetidos = numeroRepetidos();
		Set<Integer> conjuntoNumeros = new HashSet<>();
		conjuntoNumeros.add(1);
		for(Integer i : numerosRepetidos.keySet()) {
			for(Integer e : conjuntoNumeros) {
				if(numerosRepetidos.get(i) < numerosRepetidos.get(e)) {
					conjuntoNumeros.clear();
					conjuntoNumeros.add(i);
				}
			}
		}
		
		return conjuntoNumeros;
	}

	private Map<Integer, Integer> numeroRepetidos() {
		Map<Integer, Integer> numerosRepetidos = new HashMap<>();
		
		for(LocalDate l : this.sorteos.keySet()) {
			for(Integer i : this.sorteos.get(l).getConjuntoNumeros()) {
				if(!numerosRepetidos.containsKey(i)) {
					numerosRepetidos.put(i, 0);
				}
				numerosRepetidos.replace(i, numerosRepetidos.get(i),numerosRepetidos.get(i)+1);
			}
		}
		return numerosRepetidos;
	}
	
	private Map<Integer, Integer> estrellasRepetidas() {
		Map<Integer, Integer> estrellasRepetidas = new HashMap<>();
		
		for(LocalDate l : this.sorteos.keySet()) {
			for(Integer i : this.sorteos.get(l).getConjuntoEstrellas()) {
				if(!estrellasRepetidas.containsKey(i)) {
					estrellasRepetidas.put(i, 0);
				}
				estrellasRepetidas.replace(i, estrellasRepetidas.get(i),estrellasRepetidas.get(i)+1);
			}
		}
		return estrellasRepetidas;
	}
	
	
	public Set<Integer> estrellaMasRepetido() {
		Map<Integer, Integer> numerosRepetidos = estrellasRepetidas();
		Set<Integer> conjuntoEstrellas = new HashSet<>();
		conjuntoEstrellas.add(1);
		for(Integer i : numerosRepetidos.keySet()) {
			for(Integer e : conjuntoEstrellas) {
				if(numerosRepetidos.get(i) > numerosRepetidos.get(e)) {
					conjuntoEstrellas.clear();
					conjuntoEstrellas.add(i);
				}
			}
		}
		
		return conjuntoEstrellas;
	}
	
	public Set<Integer> estrellaMenosRepetido() {
		Map<Integer, Integer> numerosRepetidos = estrellasRepetidas();
		Set<Integer> conjuntoEstrellas = new HashSet<>();
		conjuntoEstrellas.add(1);
		for(Integer i : numerosRepetidos.keySet()) {
			for(Integer e : conjuntoEstrellas) {
				if(numerosRepetidos.get(i) < numerosRepetidos.get(e)) {
					conjuntoEstrellas.clear();
					conjuntoEstrellas.add(i);
				}
			}
		}
		
		return conjuntoEstrellas;
	}
	
	public Combinacion mayorSecuenciaNumerosConsecutivos() {
		List<Combinacion> sorteosSecuencias = new ArrayList(this.sorteos.values());
		Combinacion maxima = sorteosSecuencias.get(0);
		
		for(Combinacion c : this.sorteos.values()) {
			if(obtenerSecuencia(c) > obtenerSecuencia(maxima)) {
				maxima = c;
			}
		}
		return maxima;
	}
	
	private int obtenerSecuencia(Combinacion c) {
		int secuencia = 0;
		int tmp = -1;
		for(int n : c.getConjuntoNumeros()) {
			if(n == tmp+1) {
				secuencia ++;
			}
			tmp = n;
			
		}
		return secuencia;
		
	}
	
	public void cargarCombinaciones(String ruta){
		File f = new File(ruta);
		
		
		try {
			BufferedReader buffer = new BufferedReader(new FileReader(f));
			String linea = buffer.readLine();
			linea = buffer.readLine();
			while(linea != null) {
				try {
					addSorteo(linea);
				} catch (CombinacionException e) {
					e.printStackTrace();
				}
				linea = buffer.readLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}



}
