package parking.model;

import java.util.Arrays;

import parking.comparables.CompararPorCombustible;
import parking.comparables.CompararPorMarca;
import parking.comparables.CompararPorMatricula;
import parking.comparables.CompararPorModelo;
import parking.comparables.CompararPorTipo;

public class Parking{

	private final static int MAX_CAPACIDAD = 50;
	
	private Vehiculo[] vehiculos = new Vehiculo[MAX_CAPACIDAD];
	
	public boolean entrarParking(Vehiculo vehiculo) {
		boolean aparcado = false;
		
		for(int i = 0; i < this.vehiculos.length && !aparcado; i++) {
			if(this.vehiculos[i] == null) {
				this.vehiculos[i] = vehiculo;
				aparcado = true;
			}
			
		}
		return aparcado;
		
	}
	
	public boolean salirParking(Vehiculo vehiculo) {
		boolean salir = false;
		
		for(int i = 0; i < this.vehiculos.length; i++) {
			if(this.vehiculos[i] != null && this.vehiculos[i].getMatricula().equals(vehiculo.getMatricula())) {
				salir = true;
				this.vehiculos[i] = null;
			}
		} 
		return salir;
		
	}

	
	private String arrayToString() {
		StringBuilder sb = new StringBuilder();
		for(Vehiculo v: this.vehiculos) {
			if(v!=null) {
				sb.append(v).append("\n");
			}	
		}
		return sb.toString();
	}

	public String compararPorFechaEntrada() {
		Vehiculo[] vehiculosSinNulos = quitarNulosArray();
		Arrays.sort(vehiculosSinNulos);
		return Arrays.toString(vehiculosSinNulos);
	}
	
	public String compararPorMarca() {
		Arrays.sort(this.vehiculos,new CompararPorMarca());
		return Arrays.toString(this.vehiculos);
	}
	
	public String compararPorModelo() {
		Arrays.sort(this.vehiculos,new CompararPorModelo());
		return Arrays.toString(this.vehiculos);
	}
	
	public String compararPorTipo() {
		Arrays.sort(this.vehiculos,new CompararPorTipo());
		return Arrays.toString(this.vehiculos);
	}
	
	public String compararPorCombustible() {
		Arrays.sort(this.vehiculos,new CompararPorCombustible());
		return Arrays.toString(this.vehiculos);
	}
	
	public String compararPorMatricula() {
		Arrays.sort(this.vehiculos,new CompararPorMatricula());
		return Arrays.toString(this.vehiculos);
	}
	
	private Vehiculo[] quitarNulosArray() {
		int contVeh = 0;
		for(Vehiculo v: this.vehiculos) {
			if(v != null) {
				contVeh ++;
			}
		}
		
		Vehiculo[] tmp = new Vehiculo[contVeh];
		int indice = 0;
		for(int i = 0; i < this.vehiculos.length; i++) {
			if(this.vehiculos[i] != null) {
				tmp[indice] = this.vehiculos[i];
				indice ++;
			}
		}
		return tmp;
	}
	
	

}
