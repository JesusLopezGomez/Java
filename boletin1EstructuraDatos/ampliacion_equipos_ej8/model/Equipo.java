package boletin1EstructuraDatos.ampliacion_equipos_ej8.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Equipo {

	private String nombreGrupo;
	private Set<Alumno> conjuntoAlumnos = new TreeSet<>();

	public Equipo(String nombreGrupo) {
		super();
		this.nombreGrupo = nombreGrupo;
	}
	
	public void anniadirAlumno(Alumno a) throws AlumnoException {
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
	
	public String listadoMasculinoMayoresOrdenEdad() {
		List<Alumno> listaAlumnos = new ArrayList<>();
		for(Alumno a: this.conjuntoAlumnos) {
			listaAlumnos.add(a);
		}
		Collections.sort(listaAlumnos);
		StringBuilder sb = new StringBuilder();
		for(Alumno a : listaAlumnos) {
			if(a.getEdad() >= 18 && a.getSexo() == 'H' || a.getSexo() == 'h' ) {
				sb.append(a).append(System.lineSeparator());
			}
		}
		return sb.toString();
	}
	
	public boolean esFemenino() {
		boolean femenino = true;
		for(Alumno a : this.conjuntoAlumnos) {
			if(a.getSexo() == 'H' || a.getSexo() == 'h') {
				femenino = false;
			}
		}
		return femenino;
	}
	
	public int numeroJugadorasMayores() {
		int cont = 0;
		for(Alumno a : this.conjuntoAlumnos) {
			if((a.getSexo() == 'M' || a.getSexo() == 'm') && a.getEdad() >= 18 ) {
				cont ++;
			}
		}
		return cont;
	}
	
	public int jugadorMayor() {
		int edadMayor = 0;
		for(Alumno a : this.conjuntoAlumnos) {
			if(a.getEdad() > edadMayor) {
				edadMayor = a.getEdad();
			}
		}
		return edadMayor;
	}
	
	public Set dniJugadoresMenorEdad() {
		Set<String> conjuntoDniMenoresEdad = new HashSet<>();
		for(Alumno a : this.conjuntoAlumnos) {
			if((a.getSexo() == 'h' || a.getSexo() == 'H') && a.getEdad() < 18) {
				conjuntoDniMenoresEdad.add(a.getDni());
			}
		}
		return conjuntoDniMenoresEdad;
	}
	
	public List nombreJugadorasAscendente() {
		List<String> listaAlumnos = new ArrayList<>();
		for(Alumno a: this.conjuntoAlumnos) {
			if(a.getSexo() == 'M' || a.getSexo() == 'm') {
				listaAlumnos.add(a.getNombre());
			}
		}
		Collections.sort(listaAlumnos);
		
		return listaAlumnos;
	}
	
	public boolean existeJugadoraMayorEdad() {
		boolean mayor = false;
		for(Alumno a : this.conjuntoAlumnos) {
			if((a.getSexo() == 'm' || a.getSexo() == 'M') && a.getEdad() >= 18) {
				mayor = true;
			}
		}
		return mayor;
	}
	
	public int ciudadesDistintasJugadores() {
		Set<String> ciudades = new HashSet<>();
		for(Alumno a : this.conjuntoAlumnos) {
			ciudades.add(a.getCiudad());
		}
		return ciudades.size();
	}

	@Override
	public String toString() {
		return "Nombre de equipo: " + this.nombreGrupo + ", participantes:  " + this.conjuntoAlumnos.toString();
	}
	
	
}
