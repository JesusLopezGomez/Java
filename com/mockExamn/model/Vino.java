package com.mockExamn.model;

import java.util.Objects;

public class Vino {
	private String nombre;
	private double graduacion;
	
	public Vino(String nombre, double graduacion) {
		super();
		this.nombre = nombre;
		this.graduacion = graduacion;
	}
	
	public Vino(String nombre ) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public double getGraduacion() {
		return graduacion;
	}

	@Override
	public String toString() {
		return  nombre + ", graduacion " + graduacion;
	}
	
	
	
}
