package parking2.model;

import java.util.Arrays;

import parking2.comparables.CompararPorMarcaModelo;
import parking2.comparables.CompararPorMatricula;
import parking2.comparables.CompararPorTipoCombustible;

public class Parking {

	private  final static int CAPACIDAD_MAXIMA = 50;
	
	Vehiculo[] vehiculos = new Vehiculo[CAPACIDAD_MAXIMA];
	
	public Parking() {
	}
	
	public boolean entrar(Vehiculo vehiculo) {
		boolean aparcado = false;
		
		for(int i = 0; i < CAPACIDAD_MAXIMA && !aparcado; i++) {
			if(this.vehiculos[i] == null) {
				this.vehiculos[i] = vehiculo;
				aparcado = true;
			}
		}
		return aparcado;
	}
	
	public boolean salir(Vehiculo vehiculo) {
		boolean fuera = false;
		for(int i = 0; i < CAPACIDAD_MAXIMA && !fuera; i++) {
			if(this.vehiculos[i] != null && this.vehiculos[i].getMatricula().equals(vehiculo.getMatricula()));
			this.vehiculos[i] = null;
			fuera = true;
		}
		return fuera;
	}
	
	public String ordenarFechaEntrada(){
		Vehiculo[] vehiculosSinNulos = Arrays0Nulos();
		Arrays.sort(vehiculosSinNulos);
		StringBuilder sb = new StringBuilder();
		for(Vehiculo v: vehiculosSinNulos) {
			if(v != null) {
				sb.append(v).append(System.lineSeparator());
			}
		}
		return sb.toString();
	}
	
	public String ordenarPorMarcaModelo() {
		Vehiculo[] vehiculosSinNulos = Arrays0Nulos();
		Arrays.sort(vehiculosSinNulos, new CompararPorMarcaModelo());
		StringBuilder sb = new StringBuilder();
		for(Vehiculo v: vehiculosSinNulos) {
			if(v != null) {
				sb.append(v).append(System.lineSeparator());
			}
		}
		return sb.toString();
	}
	
	public String ordenarPorTipoYCombustible() {
		Vehiculo[] vehiculosSinNulos = Arrays0Nulos();
		Arrays.sort(vehiculosSinNulos, new CompararPorTipoCombustible());
		StringBuilder sb = new StringBuilder();
		for(Vehiculo v: vehiculosSinNulos) {
			if(v != null) {
				sb.append(v).append(System.lineSeparator());
			}
		}
		return sb.toString();
	}
	
	public String ordenarPorMatricula() {
		Vehiculo[] vehiculosSinNulos = Arrays0Nulos();
		Arrays.sort(vehiculosSinNulos, new CompararPorMatricula());
		StringBuilder sb = new StringBuilder();
		for(Vehiculo v: vehiculosSinNulos) {
			if(v != null) {
				sb.append(v).append(System.lineSeparator());
			}
		}
		return sb.toString();
	}
	
	private Vehiculo[] Arrays0Nulos() {
		int tamannio = 0;
		for(Vehiculo v: this.vehiculos) {
			if(v != null) {
				tamannio ++;
			}
		}
		Vehiculo[] tmp = new Vehiculo[tamannio];
		
		int pos = 0;
		
		for(Vehiculo v: this.vehiculos) {
			if(v != null) {
				tmp[pos++] = v;
			}
		}
		return tmp;
	}

}
