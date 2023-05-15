package mockexamened.main.java.model;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		try {
		}catch (PersonaException e) {
			System.out.println(e.getMessage());
		}
		
		Persona p = new Persona("jesus","gomez","2448360V",LocalDate.of(2003, 11, 19),"HOMBRE");
		
		System.out.println(p);
	}

}
