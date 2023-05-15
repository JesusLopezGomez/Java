package mapeando2.model;

import mapeando.model.Genero;

public class Persona2 {

	private String nombre;
	private String apellidos;
	private Genero2 genero;
	
	
	public Persona2(String nombre, String apellidos, Genero2 genero) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.genero = genero;
	}

	public Genero2 getGenero() {
		return this.genero;
	}
	
	@Override
	public String toString() {
		return nombre +" "+ apellidos ;
	}

}
