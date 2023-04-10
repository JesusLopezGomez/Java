package com.edu.model;

public class Director extends Profesor {
	private boolean esDirector;

	public Director(String nombre, String apellidos, int edad, String fechaNacimiento, String claseImparte,
			boolean esDirector) {
		super(nombre, apellidos, edad, fechaNacimiento, claseImparte);
		this.esDirector = esDirector;
	}

	public boolean isEsDirector() {
		return esDirector;
	}

	public void setEsDirector(boolean esDirector) {
		this.esDirector = esDirector;
	}
}
