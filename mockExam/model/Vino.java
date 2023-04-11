package mockExam.model;

public class Vino {

	private String nombre;
	private double graduacion;
	
	public Vino() {
	}

	public Vino(String nombre, double graduacion) {
		super();
		this.nombre = nombre;
		this.graduacion = graduacion;
	}

	public String getNombre() {
		return nombre;
	}

	public double getGraduacion() {
		return graduacion;
	}

	@Override
	public String toString() {
		return "Vino: " + nombre + ", graduacion: " + graduacion;
	}

	
}
