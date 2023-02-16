package com.herit;

public class Estudiante extends Persona {
	public Estudiante() {
		super();
	}

	public Estudiante(String nombre, String apellido, String dni) {
		super(nombre, apellido, dni);
	}
	
	public void saludar() {
		System.out.println("Hola me llamo " + getNombre() + " soy estudiante");
	}
	
	public void estudiar() {
		System.out.println("Estudiando");
	}

}
