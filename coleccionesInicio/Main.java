package coleccionesInicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		entradaRegistro<Integer, String> registro1 = new entradaRegistro(1,"pepe"); 
		entradaRegistro<Double, Integer> registro2 = new entradaRegistro(2.0,2); //Declaramos y definimos el constructor de la clase registroEntrada
		entradaRegistro<String, Integer> registro3 = new entradaRegistro("primero",1);
		
		//Aqui podemos ver que con los tipos genericos nos permiten utilizar diferentes de datos sin problemas.
		
		System.out.println(registro1);
		System.out.println(registro2);
		System.out.println(registro3);

		List<Integer> listaNumeros = new ArrayList<>(); //Declaramos la lista.
		
		listaNumeros.add(1);
		listaNumeros.add(1);
		listaNumeros.add(3); //Añadimos elemento a la lista.
		listaNumeros.add(7);
		listaNumeros.add(3);
		
		System.out.println(listaNumeros.toString()); //Mostramos la lista por el orden de entrada, asi se mostraría por defecto.
		System.out.println(listaNumeros.get(2)); //Obtenemos la posicion dos de la lista de numeros.
		Collections.sort(listaNumeros); //Ordenamos la lista de numero por el valor de la lista.
		
		System.out.println(listaNumeros.size()); //Obtenemos el tamaño de la lista
		System.out.println(listaNumeros.toString()); //Mostramos la lista pero esta vez ya saldrá ordenada por el sort anterior.
		
		Set<Integer> conjuntoNumeros = new HashSet<>(); //Declaramos el conjunto.
		
		conjuntoNumeros.add(1);		
		conjuntoNumeros.add(1);
		conjuntoNumeros.add(3); //Añadimos elemento al conjunto.
		conjuntoNumeros.add(7);		
		conjuntoNumeros.add(3);
		
		System.out.println(conjuntoNumeros.toString()); //Los conjuntos no permite que se repitan números.

	}

}
