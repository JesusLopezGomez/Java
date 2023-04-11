package boletin1EstructuraDatos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Equipo {

	private String nombreGrupo;
	private List<Alumno> listaAlumnos = new ArrayList<>();

	public Equipo(String nombreGrupo) {
		super();
		this.nombreGrupo = nombreGrupo;
	}
	
	public void añadirAlumno(Alumno a) throws AlumnoException {
		if(a != null && existeAlumno(a) == null) {
			this.listaAlumnos.add(a);
		}else {
			throw new AlumnoException("Error alumno existente");
		}
	}

	public void delAlumno(Alumno a) throws AlumnoException {
		if(existeAlumno(a) != null) {
			this.listaAlumnos.remove(a);
		}else {
			throw new AlumnoException("Error alumno no existente");
		}
	}
	
	public Alumno existeAlumno(Alumno a) {
		Alumno alumno = null;
		if(a != null && this.listaAlumnos.indexOf(a) != -1) {
			alumno = a;
		}
		return alumno;
	}
	
	public Equipo unionEquipo(Equipo equipoExterno) {
		
		if(equipoExterno != null && !this.listaAlumnos.equals(equipoExterno.listaAlumnos)) {
			boolean equipoUnido = this.listaAlumnos.addAll(equipoExterno.listaAlumnos);
		}
		
		return this;
	}
	
	public Equipo intersectEquipo(Equipo equipoExterno) {
		List<Alumno> equipoNuevo = new ArrayList<>();		
		Iterator<Alumno> it = this.listaAlumnos.iterator();

		Alumno nuevoAlumno;
		Equipo equipoFinal;
		
		while(it.hasNext()) {
			nuevoAlumno = it.next();
			if(equipoExterno.listaAlumnos.contains(nuevoAlumno)) {
				equipoNuevo.add(nuevoAlumno);
			}
		}
		if(equipoNuevo.size() > 1) {
			equipoFinal = new Equipo(this.nombreGrupo);
			equipoFinal.listaAlumnos = equipoNuevo;
		}
		return this;
	}

	@Override
	public String toString() {
		return "Nombre de equipo: " + this.nombreGrupo + ", participantes:  " + this.listaAlumnos.toString();
	}
	
	
}
