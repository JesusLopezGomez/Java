package com.mockExamn.model;

import java.util.Objects;

public class Plato {
	private String nombre;
	private double precio;
	private double iva = 0.21;
	private Vino vinoRecomendado;
	
	
	public Plato(String nombre) {
		this.nombre = nombre;
	}
	
	public Plato(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getPrecioBase() {
		return this.precio;
	}
	
	public double getPrecioPublico() {
		return this.precio + (this.precio * this.iva);
	}

	
	public void setPrecio(double precio) {
		if(precio > 0) {
			this.precio = precio;
		}
	}
	
	public void incrementaPrecio(double incremento) {
		if(incremento > 0) {
			this.precio += precio;
		}
	}

	public Vino getVinoRecomendado() {
		return vinoRecomendado;
	}

	public void setVinoRecomendado(Vino vinoRecomendado) {
		this.vinoRecomendado = vinoRecomendado;
	}
	
	public void setVinoRecomendado(String nombreVino, double graduacionVino) {
		Vino vino = new Vino(nombreVino,graduacionVino);
		this.vinoRecomendado = vino;
	}
	
	public double getGradosVinosRecomendado() {
		return vinoRecomendado.getGraduacion();
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
		Plato other = (Plato) obj;
		return resultado&&Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		String resultado = "Plato " + this.nombre + " con precio sin iva " + this.precio + 
				" precio venta al publico " + getPrecioPublico() + " con vino recomendado " + 
				this.vinoRecomendado;
		if(this.vinoRecomendado == null) {
			resultado = "Plato " + this.nombre + " con precio sin iva " + this.precio + 
					" precio venta al publico " + getPrecioPublico() + " sin vino recomendado";
		}
		
		return resultado;
	}
	
	
	
}
