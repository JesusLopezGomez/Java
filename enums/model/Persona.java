package enums.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Persona {

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
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", genero=" + genero + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}

	
	

}
