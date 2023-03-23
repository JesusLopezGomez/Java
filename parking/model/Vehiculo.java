package parking.model;

import java.time.LocalDateTime;

public class Vehiculo implements Comparable<Vehiculo>{

	private String marca;
	private String modelo;
	private String matricula;
	private Combustible combustible;
	private LocalDateTime fechaEntrada;
	private TipoVehiculo tipoVehiculo;
	
	public Vehiculo() {

	}

	public Vehiculo(String marca, String modelo, String matricula, Combustible combustible,
			TipoVehiculo tipoVehiculo) {
		super();
		if(esMatriculaValida(matricula)) {
			this.marca = marca;
			this.modelo = modelo;
			this.matricula = matricula;
			this.combustible = combustible;
			this.fechaEntrada = LocalDateTime.now();
			this.tipoVehiculo = tipoVehiculo;
		}
	}
	
	private boolean esMatriculaValida(String matricula) {
		boolean resultado = false;
		int contNum = 0;
		for(int i = 0; i < matricula.length(); i++) {
			if(Character.isDigit(matricula.charAt(i))) {
				contNum ++;
			}
		}
		if(contNum == 4 && matricula.length() <= 8) {
			resultado = true;
		}
		
		return resultado;
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
	
	public String getTipo() {
		return this.tipoVehiculo.toString();
	}
	
	public String getCombustible() {
		return this.combustible.toString();
	}

	@Override
	public String toString() {
		return String.format("Tipo de vehiculo %s con marca %s, matricula %s, modelo %s, tipo de conbustible %s, y fecha de entrada %s", 
				this.tipoVehiculo,this.marca,this.matricula,this.modelo,this.combustible,this.fechaEntrada);
	}

	@Override
	public int compareTo(Vehiculo o) {
		return this.fechaEntrada.compareTo(o.fechaEntrada);
	}
	
	

}
