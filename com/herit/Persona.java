package com.herit;

public class Persona {

	
	private String nombre;
	
	private String apellido;
	
	private String dni;
	
	public Persona() {}
	
	public Persona(String nombre, String apellido, String dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	public void saludar() {
		System.out.println("Hola me llamo " + getNombre());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
}
