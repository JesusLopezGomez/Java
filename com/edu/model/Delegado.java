package com.edu.model;

public class Delegado extends Estudiante {
	private boolean Esdelegado;

	public Delegado(String nombre, String apellidos, int edad, String fechaNacimiento, String clase,
			boolean esdelegado) {
		super(nombre, apellidos, edad, fechaNacimiento, clase);
		Esdelegado = esdelegado;
	}

	public boolean isEsdelegado() {
		return Esdelegado;
	}

	public void setEsdelegado(boolean esdelegado) {
		Esdelegado = esdelegado;
	}
}
