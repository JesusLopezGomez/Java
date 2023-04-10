package clasesAbstractas;

import clasesAbstractas.model.Circulo;
import clasesAbstractas.model.Cuadrado;
import clasesAbstractas.model.Figura;
import clasesAbstractas.model.Triangulo;

public class Main {

	public static void main(String[] args) {

		Figura circulo = new Circulo(5);
		System.out.println(circulo);
		Figura triangulo = new Triangulo(3,4,5);
		System.out.println(triangulo);
		Figura cuadrado = new Cuadrado(4);
		System.out.println(cuadrado);
	}

}
