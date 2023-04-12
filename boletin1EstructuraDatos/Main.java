package boletin1EstructuraDatos;

import java.util.Arrays;

public class Main {

	public static <T> T[] reverse (T[] arrayOriginal) {
		T[] arrayAuxiliar = arrayOriginal.clone();
		for(int i = 0, indice = arrayOriginal.length-1; i < arrayOriginal.length && indice >= 0; i++) {
			arrayAuxiliar[i] = arrayOriginal[indice];
			indice --;
		}
		
		return arrayAuxiliar;
	}
	
	public static <T> void main(String[] args) {
		Integer[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12};
		System.out.println(Arrays.toString((T[]) reverse(numeros)));
		
	}

}
