package com.herit;

public class Profesor extends Persona {

	public Profesor() {
	}

	public Profesor(String nombre, String apellido, String dni) {
		super(nombre, apellido, dni);
	}

	public void saludar() {
		System.out.println("Soy el profesor" + " me llamo " + getNombre());
	}
	
	public void darClase() {
		System.out.println("dando clase");
	}
}
