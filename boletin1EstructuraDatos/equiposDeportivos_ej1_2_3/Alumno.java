package boletin1EstructuraDatos.equiposDeportivos_ej1_2_3;

import java.util.Objects;

public class Alumno {

	private String nombre;
	private String dni;
	
	
	public Alumno(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
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
		Alumno other = (Alumno) obj;
		return resultado && Objects.equals(dni, other.dni);
	}


	@Override
	public String toString() {
		return String.format("Alumno %s con dni %s", this.nombre, this.dni);
	}

	
	
}
