package boletin1EstructuraDatos.equiposDeportivos_ej1_2_3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Equipo2<T> {

	private String nombreGrupo;
	private Set<T> conjuntoAlumnos = new HashSet<>();

	public Equipo2(String nombreGrupo) {
		super();
		this.nombreGrupo = nombreGrupo;
	}
	
	public void añadirAlumno(T t) throws AlumnoException {
		if(t != null && existeAlumno(t) == null) {
			this.conjuntoAlumnos.add(t);
		}else {
			throw new AlumnoException("Error alumno existente");
		}
	}

	public void delAlumno(T t) throws AlumnoException {
		if(existeAlumno(t) != null) {
			this.conjuntoAlumnos.remove(t);
		}else {
			throw new AlumnoException("Error alumno no existente");
		}
	}
	
	public T existeAlumno(T t) {
		T tipo = null;
		if(t != null && this.conjuntoAlumnos.contains(t)) {
			tipo = t;
		}
		return tipo;
	}
	
	public Equipo2 unionEquipo(Equipo2 equipoExterno) {
		
		if(equipoExterno != null && !this.conjuntoAlumnos.equals(equipoExterno.conjuntoAlumnos)) {
			boolean equipoUnido = this.conjuntoAlumnos.addAll(equipoExterno.conjuntoAlumnos);
		}
		
		return this;
	}
	
	public Equipo2 intersectEquipo(Equipo2 equipoExterno) {
		Set<T> equipoNuevo = new HashSet<>();		
		Iterator<T> it = this.conjuntoAlumnos.iterator();

		T nuevoAlumno;
		Equipo2 equipoFinal;
		
		while(it.hasNext()) {
			nuevoAlumno = it.next();
			if(equipoExterno.conjuntoAlumnos.contains(nuevoAlumno)) {
				equipoNuevo.add(nuevoAlumno);
			}
		}
		if(equipoNuevo.size() > 1) {
			equipoFinal = new Equipo2(this.nombreGrupo);
			equipoFinal.conjuntoAlumnos = equipoNuevo;
		}
		return this;
	}

	@Override
	public String toString() {
		return "Nombre de equipo: " + this.nombreGrupo + ", participantes:  " + this.conjuntoAlumnos.toString();
	}
	
}
