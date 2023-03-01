package arrays;

import java.util.Arrays;

public class miPrimerArray {

	public static void main(String[] args) {
		
		int[] numeros = new int[7];
		String nombres[] = new String[20];
		
		nombres[0] = "Gómez";
		
		Integer numbers[] = {1,2,3,6,7,4,9,8};
		
		String nombres2[] = {"Jesús","López","Gómez"};
		
		System.out.println(numeros[0]);
		
		System.out.println(nombres[0].toString());
		
		System.out.println(numbers[0]);
		for(int i = 0; i < nombres2.length; i++) {
			System.out.println(nombres2[i]);
		}
		
		for(String nombre : nombres2) {
			System.out.println(nombre);
		}
		Arrays.sort(numbers);
		for(int n : numbers) {
			System.out.println(n);
		}
		Arrays.sort(numbers);
		System.out.println(Arrays.binarySearch(numbers, 4)); //Antes de hacer esto tiene que estar la lista ordenada
		
		int elemento = 3;
		System.out.println(buscarElemento(numbers,elemento)); // llamada a la función
		
		
	}
	
	public static int buscarElemento(Integer[] numbers, int buscado) { //Buscar elemento en una lista
		int i = 0;
		int posicion = -1;
		
		while(posicion== -1 && i < numbers.length) {
			if(buscado == numbers[i]) {
				posicion = i;
			}
			i++;
		}
		return posicion;
	}

}
