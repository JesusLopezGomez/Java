package parking2.model;

import java.time.LocalDateTime;

import parking2.enumerados.Combustible;
import parking2.enumerados.TipoVehiculo;
import parking2.excepciones.miExcepcion;

public class Vehiculo implements Comparable<Vehiculo>{

	private String marca;
	private String modelo;
	private String matricula;
	private Combustible combustible;
	private LocalDateTime fechaEntrada;
	private TipoVehiculo tipoVehiculo;
	
	
	public Vehiculo(String marca, String modelo, String matricula, Combustible combustible
			,TipoVehiculo tipoVehiculo) throws miExcepcion {
		if(esMatriculaValida(matricula)) {
			this.marca = marca;
			this.modelo = modelo;
			this.matricula = matricula;
			this.combustible = combustible;
			this.tipoVehiculo = tipoVehiculo;
			this.fechaEntrada = LocalDateTime.now();
		}else {
			throw new miExcepcion("Error matrícula no valida.");
		}

	}
	
	private boolean esMatriculaValida(String matricula) {
		boolean esValida = false;
		int digitos = 0;
		for(int i = 0; i < matricula.length(); i++) {
			if(Character.isDigit(matricula.charAt(i))) {
				digitos ++;
			}
		}
		
		if(matricula.length() <= 8 && digitos == 4) {
			esValida = true;
		}
		
		return esValida;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}

	public Combustible getCombustible() {
		return combustible;
	}

	public TipoVehiculo getTipoVehiculo() {
		return tipoVehiculo;
	}

	@Override
	public int compareTo(Vehiculo o) {
		
		return this.fechaEntrada.compareTo(o.fechaEntrada);
	}
	
	@Override
	public String toString() {
		return String.format("Marca: %s, modelo: %s, matricula: %s, combustible: %s"
				+ " tipo de vehiculo: %s, fecha de entrada: %s, "
				,this.marca,this.modelo,this.matricula,this.combustible,this.tipoVehiculo,this.fechaEntrada);
	}
	
	

}
