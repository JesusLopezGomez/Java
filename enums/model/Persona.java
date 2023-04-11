package enums.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Persona implements Desplazable,Comparable<Persona>{

	private String nombre;
	private String apellidos;
	private Genero genero;
	private LocalDate fechaNacimiento;
	
	public Persona(String nombre, String apellidos, Genero genero, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.genero = genero;
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getEdad() {
		return (int) ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now());
	}
	

	@Override
	public void moverse() {
		System.out.println("Moviendome");
	}

	@Override
	public void saltar() {
		System.out.println("Saltando");
	}

	@Override
	public void agacharse() {
		System.out.println("Agachandome");
	}

	@Override
	public void correr() {
		System.out.println("Corriendo");
	}

	public String saludar() {
		return "Me llamo " + this.nombre + " y tengo " + this.getEdad() + " años";
 	}

	@Override
	public int compareTo(Persona o) {
		return genero.compareTo(o.genero);
	}
	
	@Override
	public String toString() {
		return "Me llamo " + nombre + " " + apellidos + " soy " + genero + " tengo " +
				+ getEdad() + " años.";
	}
	
	
	
	
	

}
