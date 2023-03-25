package prueba;

public class Alumno extends Persona {

	private String claseAlumno;
	
	public Alumno(String nombre, int edad, String claseAlumno) {
		super(nombre, edad);
		this.claseAlumno = claseAlumno;
	}

	public Alumno() {
	}

}
