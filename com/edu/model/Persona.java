package com.edu.model;

public class Persona {
	private String nombre;
	private String apellidos;
	private int edad;
	private String fechaNacimiento;
	
	public Persona(String nombre, String apellidos, int edad, String fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
}
