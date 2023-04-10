package com.herit;

public class Delegado extends Estudiante {

	public Delegado() {
	}

	public Delegado(String nombre, String apellido, String dni) {
		super(nombre, apellido, dni);
	}
	
	public void saludar() {
		System.out.println("Hola soy el delagado, me llamo " + getNombre());
	}

}
