package geometria;

import java.util.Scanner;

import cuentaCorriente.model.Cuenta;
import geometria.model.Rectangulo;

public class Main {

	public static void main(String[] args) {
		Rectangulo r = new Rectangulo();
		Cuenta c = new Cuenta();
		System.out.println(r.calcularPerimetro(10, 1));
		System.out.println(r.calcularArea(9, 10));
		
	}

}
