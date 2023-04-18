package mapeando;

import java.util.ArrayList;
import java.util.List;

import mapeando.model.Mapeando;

public class Main {

	public static void main(String[] args) {		
		Mapeando m = new Mapeando();
		
		List<Integer> numeros = new ArrayList<>();
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(1);
		numeros.add(3);
		numeros.add(2);

		System.out.println(m.contarNumeros(numeros));
		
	
	}

}
