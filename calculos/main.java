package calculos;

import java.util.Scanner;

import calculos.model.Complejo;

public class main {

	public static void main(String[] args) {
		 Complejo com1 = new Complejo(5,7);
		 Complejo com2 = new Complejo(7,9);
		 System.out.println(com1.suma(com2));
		 Complejo com3 = new Complejo();
		 Complejo com4 = new Complejo();
		 Scanner sc = new Scanner(System.in);
		 int opcion = 1;
		 int real1 = 0;
		 int imaginaria1 = 0;
		 int real2 = 0;
		 int imaginaria2 = 0;
		 String menu = "1. Sumar complejos \n2. Restar complejos\n3. Salir";
		 while (opcion != 3){
			 System.out.println(menu);
			 System.out.println("Introduce una opción: ");
			 opcion = Integer.valueOf(sc.nextLine());
			 if (opcion == 1){
				 System.out.println("Introduce la parte real del numero 1: ");
				 real1 = Integer.valueOf(sc.nextLine());
				 System.out.println("Introduce la parte imaginaria del numero 1: ");
				 imaginaria1 = Integer.valueOf(sc.nextLine());
				 com3 = new Complejo (real1,imaginaria1);
				 System.out.println("Introduce la parte real del numero 2: ");
				 real2 = Integer.valueOf(sc.nextLine());
				 System.out.println("Introduce la parte imaginaria del numero 2: ");
				 imaginaria2 = Integer.valueOf(sc.nextLine());
				 com4 = new Complejo (real2,imaginaria2);
				 System.out.println(com3.suma(com4));
			 }else if (opcion == 2){
				 System.out.println("Introduce la parte real del numero 1: ");
				 real1 = Integer.valueOf(sc.nextLine());
				 System.out.println("Introduce la parte imaginaria del numero 1: ");
				 imaginaria1 = Integer.valueOf(sc.nextLine());
				 com3 = new Complejo (real1,imaginaria1);
				 System.out.println("Introduce la parte real del numero 2: ");
				 real2 = Integer.valueOf(sc.nextLine());
				 System.out.println("Introduce la parte imaginaria del numero 2: ");
				 imaginaria2 = Integer.valueOf(sc.nextLine());
				 com4 = new Complejo (real2,imaginaria2);
				 System.out.println(com3.resta(com4));
			 }
		 }System.out.println("Saliendo...");
		 
	}

}
