package com.mockExamn.model;

import java.util.Objects;

public class Plato {

	private static final double IVA = 0.21;
	
	
	
	private String nombre;
	private double precio;
	private Vino vinoRecomendado;
	private double graduacion;
	
	
	public Plato(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public Plato(String nombre, double precio) {
		super();
		if(precio>0) {
			this.nombre = nombre;
			this.precio = precio;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioBase() {
		return precio;
	}
	
	public double getPrecioPublico() {
		return precio*IVA + precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void incrementaPrecio(double incremento) {
		this.precio += incremento;
	}

	public void setVinoRecomendado(Vino vino) {
		this.vinoRecomendado = vino;
	}
	
	public void setVinoRecomendado(Vino vino,double graduacion) {
		this.vinoRecomendado = vino;
		this.graduacion = graduacion;
	}
	
	public double getGradosVinosRecomendado() {
		return this.graduacion;
	}
	
	public String getVinoRecomendado() {
		return this.vinoRecomendado.toString();
	}
	
	public double getIva() {
		return IVA;
	}


	@Override
	public boolean equals(Object obj) {
		boolean resultado = false;
		if (this == obj)
			resultado =  true;
		if (obj == null)
			resultado = false;
		if (getClass() != obj.getClass())
			resultado =  false;
		Plato other = (Plato) obj;
		return resultado&&Objects.equals(nombre, other.nombre);
	}
	
	

	@Override
	public String toString() {
		return "Nombre del plato: " + this.nombre + ", precio sin IVA: " + getPrecioBase() 
		+ ", precio con IVA: " + getPrecioPublico() ;
	}
	
	
	
	
}
