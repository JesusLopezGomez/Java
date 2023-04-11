package com.edu.model;

public class Profesor extends Persona {
	private String claseImparte;

	public Profesor(String nombre, String apellidos, int edad, String fechaNacimiento, String claseImparte) {
		super(nombre, apellidos, edad, fechaNacimiento);
		this.claseImparte = claseImparte;
	}

	public String getClaseImparte() {
		return claseImparte;
	}

	public void setClaseImparte(String claseImparte) {
		this.claseImparte = claseImparte;
	}

}
