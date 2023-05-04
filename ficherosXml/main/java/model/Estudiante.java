package ficherosXml.main.java.model;

public class Estudiante {

	private String nombre;
	private String apellidos;
	private String fechaNacimiento;
	private int id;
	private Genero genero;
	
	public Estudiante(String nombre, String apellidos, String fechaNacimiento, int id, Genero genero) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.id = id;
		this.genero = genero;
	}
	
	public String toString() {
		return String.format("Estudiante con id %s, nombre %s y apellidos %s, "
						+ "con fecha de nacimiento %s, "
						+ "y género %s.", 
						this.id,
						this.nombre,
						this.apellidos,
						this.fechaNacimiento,
						this.genero);
	}
	
}
