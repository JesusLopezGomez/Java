package mockexamened.main.java.model;

import java.time.LocalDate;

public class Persona {
	
	private String nombre;
	private String apellido;
	private String dni;
	private LocalDate fechaNacimiento;
	private Genero genero;


	
	public Persona() {
		super();
	}
	
	public Persona(String nombre, String apellido, String dni) {
		this();
		if(validarDatos(nombre, apellido, dni)) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.dni = dni;

		}else {
			throw new PersonaException();
		}
	}
	
	public Persona(String nombre, String apellido, String dni, LocalDate fechaNacimiento, String genero) {
		this();
		if(validarDatos(nombre, apellido, dni, fechaNacimiento, genero)) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.dni = dni;
			this.fechaNacimiento = fechaNacimiento;
			this.genero = Genero.valueOf(genero);
		}else {
			throw new PersonaException();
		}
	}
	
	
	public boolean validarDatos(String nombre, String apellido, String dni) {
		return validarDatosPersonales(nombre, apellido, dni);
	}
	
	public boolean validarDatos(String nombre, String apellido, String dni, LocalDate fechaNacimiento, String genero) {
		
		boolean datos = validarDatos(nombre, apellido, dni);
		
		boolean fechaGenero = validarFechaGenero(fechaNacimiento, genero);
		
		return datos && fechaGenero;
	}

	private boolean validarFechaGenero(LocalDate fechaNacimiento, String genero) {
		boolean resultado = true;
		if (fechaNacimiento == null) {
			resultado = false;
		}
		if(fechaNacimiento != null && fechaNacimiento.isAfter(LocalDate.now())) {
			resultado = false;
		}
		if (genero == null || genero.isEmpty()) {
			resultado = false;
		}

		if(!Genero.HOMBRE.equals(Genero.valueOf(genero)) && !Genero.MUJER.equals(Genero.valueOf(genero))) {
			resultado = false;
		}
		return resultado;
	}

	private boolean validarDatosPersonales(String nombre, String apellido, String dni) {
		boolean resultado = true;
		
		if (nombre == null || nombre.isEmpty()) {
			resultado = false;
		}

		if (apellido == null || apellido.isEmpty()) {
			resultado = false;
		}

		if (dni == null || dni.isEmpty()) {
			resultado = false;
		}

		if(dni == null && (dni.length() < 9 || Character.isDigit(dni.charAt(8)))) {
			resultado = false;
		}
		
		for(int i=0; dni != null && i<dni.length()-1; i++) {
			if(Character.isAlphabetic(dni.charAt(i))) {
				resultado = false;
			}
		}

		if (dni==null && "TRWAGMYFPDXBNJZSQVHLCKE".charAt(Integer.valueOf(dni.substring(0, 8))%23)!= dni.toUpperCase().charAt(8)) {
			resultado = false;
		}
		
		return resultado;
	}
	
	public boolean bonoJovenDisponible() {
		boolean resultado = false;
		if(LocalDate.now().getYear()-this.fechaNacimiento.getYear()> 18 && LocalDate.now().getYear()-this.fechaNacimiento.getYear()< 30) {
			resultado = true;
		}

		return resultado;
		
	}
	
	public int obtenerEdad() {
		return LocalDate.now().compareTo(fechaNacimiento)>=0?
						LocalDate.now().minusYears(this.fechaNacimiento.getYear()).getYear()	:	-1;
	}
	
	public int obtenerEdadPara(int year) {
		if(year>=this.fechaNacimiento.getYear()) {
			return year-this.fechaNacimiento.getYear();
		}
		return -1;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public Genero getGenero() {
		return genero;
	}


	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
	

}
