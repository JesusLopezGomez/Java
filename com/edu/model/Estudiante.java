package com.edu.model;

public class Estudiante extends Persona {
	private String clase;

	public Estudiante(String nombre, String apellidos, int edad, String fechaNacimiento, String clase) {
		super(nombre, apellidos, edad, fechaNacimiento);
		this.clase = clase;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}
	
}
