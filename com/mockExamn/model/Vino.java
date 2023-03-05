package com.mockExamn.model;

import java.util.Objects;

public class Vino {
	
	private String nombre;
	private double graduacion;
	
	public Vino(double graduacion, String nombre) {
		super();
		if(graduacion > 0) {
			this.graduacion = graduacion;
			this.nombre = nombre;
		}

	}
	
	public Vino(String nombre) {
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
		return "Nombre del vino: " + this.nombre + " con graduación de: " + this.graduacion ;
	}
	
	

	
	
	
	
}
