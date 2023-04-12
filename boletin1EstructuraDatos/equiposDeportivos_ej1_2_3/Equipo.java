package boletin1EstructuraDatos.equiposDeportivos_ej1_2_3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Equipo {

	private String nombreGrupo;
	private Set<Alumno> conjuntoAlumnos = new HashSet<>();

	public Equipo(String nombreGrupo) {
		super();
		this.nombreGrupo = nombreGrupo;
	}
	
	public void añadirAlumno(Alumno a) throws AlumnoException {
		if(a != null && existeAlumno(a) == null) {
			this.conjuntoAlumnos.add(a);
		}else {
			throw new AlumnoException("Error alumno existente");
		}
	}

	public void delAlumno(Alumno a) throws AlumnoException {
		if(existeAlumno(a) != null) {
			this.conjuntoAlumnos.remove(a);
		}else {
			throw new AlumnoException("Error alumno no existente");
		}
	}
	
	public Alumno existeAlumno(Alumno a) {
		Alumno alumno = null;
		if(a != null && this.conjuntoAlumnos.contains(a)) {
			alumno = a;
		}
		return alumno;
	}
	
	public Equipo unionEquipo(Equipo equipoExterno) {
		
		if(equipoExterno != null && !this.conjuntoAlumnos.equals(equipoExterno.conjuntoAlumnos)) {
			boolean equipoUnido = this.conjuntoAlumnos.addAll(equipoExterno.conjuntoAlumnos);
		}
		
		return this;
	}
	
	public Equipo intersectEquipo(Equipo equipoExterno) {
		Set<Alumno> equipoNuevo = new HashSet<>();		
		Iterator<Alumno> it = this.conjuntoAlumnos.iterator();

		Alumno nuevoAlumno;
		Equipo equipoFinal;
		
		while(it.hasNext()) {
			nuevoAlumno = it.next();
			if(equipoExterno.conjuntoAlumnos.contains(nuevoAlumno)) {
				equipoNuevo.add(nuevoAlumno);
			}
		}
		if(equipoNuevo.size() > 1) {
			equipoFinal = new Equipo(this.nombreGrupo);
			equipoFinal.conjuntoAlumnos = equipoNuevo;
		}
		return this;
	}

	@Override
	public String toString() {
		return "Nombre de equipo: " + this.nombreGrupo + ", participantes:  " + this.conjuntoAlumnos.toString();
	}
	
	
}
