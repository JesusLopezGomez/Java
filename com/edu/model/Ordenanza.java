package com.edu.model;

public class Ordenanza extends Persona {
	private String nivel;

	public Ordenanza(String nombre, String apellidos, int edad, String fechaNacimiento, String nivel) {
		super(nombre, apellidos, edad, fechaNacimiento);
		this.nivel = nivel;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
}
