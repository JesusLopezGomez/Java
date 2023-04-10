package ligaFutbol.model;

public class Equipo {

	private String nombre;
	
	public Equipo() {
	}

	public Equipo(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return nombre;
	}
	

	

}
