package com.edu.model;

public class Main {

	public static void main(String[] args) {
		Persona p1 = new Persona("pepe", "gomez" , 19, "19/02/2003");
		System.out.println(p1.getApellidos());
		Estudiante e1 = new Estudiante("pepe","gomez",19,"19/02/2003","1DAW");
		Ordenanza o1 = new Ordenanza("pepe","gomez",19,"19/02/2003","bajo");
		Delegado d1 = new Delegado("pepe","gomez",19,"19/02/2003","1DAW",true);
		Profesor po1 = new Profesor("Jose","Gonzales",30,"30/02/1992","2DAW");
		Director di1 = new Director("Jose","Gonzales",30,"30/02/1992","2DAW",false);
	}

}
