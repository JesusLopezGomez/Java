package boletin1EstructuraDatos.ampliacion_equipos_ej8.model;

import java.util.Objects;

public class Alumno implements Comparable<Alumno>{

	private String nombre;
	private String dni;
	private int edad;
	private char sexo;
	private String ciudad;
	
	
	public Alumno(String nombre, String dni, int edad, char sexo, String ciudad) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.sexo = sexo;
		this.ciudad = ciudad;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean resultado = false;
		if (this == obj)
			resultado = true;
		if (obj == null)
			resultado = false;
		if (getClass() != obj.getClass())
			resultado = false;
		Alumno other = (Alumno) obj;
		return resultado && Objects.equals(dni, other.dni);
	}

	protected int getEdad() {
		return this.edad;
	}
	
	protected char getSexo() {
		return this.sexo;
	}
	
	protected String getDni() {
		return this.dni;
	}
	
	protected String getNombre() {
		return this.nombre;
	}
	
	protected String getCiudad() {
		return this.ciudad;
	}

	@Override
	public String toString() {
		return String.format("Alumno %s con dni %s y edad %s", this.nombre, this.dni,this.edad);
	}

	@Override
	public int compareTo(Alumno o) {
		return this.edad-o.edad;
	}

	
	
}
