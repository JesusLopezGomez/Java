package com.herit;

public class main {

	public static void main(String[] args) {
		Persona p = new Persona();
		p.setNombre("Jesus");
		p.saludar();
		
		p = new Delegado("enrique","gonzales","12344");
		p.saludar();
		Delegado d = (Delegado)p;
		d.estudiar();
		
		((Delegado)p).estudiar();
		((Estudiante)p).estudiar();
		
		p = new Profesor();
		p.saludar();
	
		System.out.println(p.getClass());
	}

}
