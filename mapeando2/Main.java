package mapeando2;

import java.util.ArrayList;
import java.util.List;

import mapeando2.model.Genero2;
import mapeando2.model.Mapeando2;
import mapeando2.model.Persona2;

public class Main {

	public static void main(String[] args) {
		
		Persona2 p = new Persona2("Jesus","Lopez",Genero2.MASCULINO);
		Persona2 p2 = new Persona2("Maria","Gil",Genero2.FEMENINO);
		
		Persona2 p3 = new Persona2("Josesa","Mar",Genero2.DESCONOCIDO);

		Persona2 p4= new Persona2("Juan","Gomez",Genero2.MASCULINO);
		
		List<Persona2> listaPersonas = new ArrayList<>();
		
		listaPersonas.add(p);
		listaPersonas.add(p2);
		listaPersonas.add(p3);
		listaPersonas.add(p4);

		
		Mapeando2 m = new Mapeando2();
		System.out.println(m.mapearPersonasPorGenero(listaPersonas));
		
		List<Integer> numeros = new ArrayList<>();
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(1);
		numeros.add(3);
		numeros.add(2);
		
		System.out.println(m.contarNumeros(numeros));
		
		
	}
	
}
