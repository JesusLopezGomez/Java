package com.edu;

import java.util.Scanner;

public class Boletin2 {

	public static String numeroSolucionesEcuacionSegundoGrado(int a, int b, int c) {

		double x1 = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

		double x2 = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		String resultado = ("Esto tiene dos soluciones la primera: " + x1 + " la segunda: " + x2);
		return resultado;
	}
	public static Boolean contraseñaValida(String contrasenya) {
		int cont = 0;	
		boolean seguro = false;
		int mayuscula = 0;
		int minuscula = 0;
		int digito = 0;
		int signoPuntuacion = 0;
		if(contrasenya.length() >= 8) {
			while(cont < contrasenya.length()) {
				
				if(Character.isUpperCase(contrasenya.charAt(cont))){
					mayuscula ++;
				}else if((Character.isLowerCase(contrasenya.charAt(cont)))) {
					minuscula ++;
				}else if((Character.isDigit(contrasenya.charAt(cont)))) {
					digito ++;
				}else if(contrasenya.charAt(cont)=='?' || contrasenya.charAt(cont)=='!' || contrasenya.charAt(cont)=='*'){
					signoPuntuacion ++;
				}
				cont ++;
			}if(mayuscula >= 1 && minuscula >= 1 && digito >= 1 && signoPuntuacion >= 1) {
				seguro = true;
			}
			
		}
		return seguro;
	}
	public static String cadenaAlReves(String cadena) {
		int cont = 0;
		String resultado = "";
		while(cont < cadena.length()) {
			if(cont % 2 != 0) {
				resultado +=String.valueOf(cadena.charAt(cont)) + String.valueOf(cadena.charAt(cont-1));
			}
			cont ++;
		}
		return resultado;
	}
	public static Boolean multiplos(int num1, int num2) {
		boolean multiplos = false;
		if((num1%num2 == 0) || (num2%num1 == 0)) {
			multiplos = true;
		}
		return multiplos;
	}
	public static String horaMayor(int hora,int minuto,int segundo, int hora2, int minuto2,int segundo2) {
		String resultado = "";
		if (hora <= 12 && hora2 <= 12 && minuto <= 60 && minuto2 <= 60 && segundo <= 60 && segundo2 <= 60) {
			if(hora > hora2) {
				resultado = "1";
			}else if (hora2 > hora) {
				resultado = "2";
			}else {
				if(minuto > minuto2) {
					resultado = "1";
				}else if (minuto2 > minuto) {
					resultado = "2";
				}else {
					if(segundo > segundo2) {
						resultado = "1";
					}else if (segundo2 > segundo) {
						resultado = "2";
					}else {
						resultado = "0";
					}
				}
			}
			
		}else {
			resultado = "-1000";
		}
		return resultado;
	}
	public static String segundosEntre(int hora,int minuto,int segundo,int hora2,int minuto2,int segundo2) {
		String resultado = "";
		int totalHora = 0;
		int totalHora2 = 0;
		int total = 0;
		if (hora <= 12 && hora2 <= 12 && minuto <= 60 && minuto2 <= 60 && segundo <= 60 && segundo2 <= 60) {
			totalHora = (hora*3600) + (minuto*60) + (segundo);
			totalHora2 = (hora2*3600) + (minuto*60) + (segundo);
			total=Math.abs(totalHora - totalHora2);
			resultado = "" + total;
		}else {
			resultado = "-1000";
		}
		return resultado;
	}
	public static String toBinary(int binario) {
		String resultado = "";
		while(binario > 0) {
			if(binario%2 == 0) {
				resultado = "0" + resultado;
			}else {
				resultado = "1" + resultado;
			}
			binario=(int)binario/2;
		}
		
		return resultado;
	}
	public static int toDecimal(String numero) {
		int decimal = 0;
		int posicion = 0;
		for(int i = numero.length()-1; i>= 0; i--) {
			int digito = 1;
			if(numero.charAt(i) == '0') {
				digito = 0;
			}
			double multiplicador = Math.pow(2, posicion);
			decimal += digito * multiplicador;
			posicion ++;
		}
		return decimal;
	}
	public static double greaterCommonDivisor(double numero1 , double numero2) {
		while(numero2 > 0) {
			if(numero1 > numero2) {
				numero1 = numero1 - numero2;
			}else {
				numero2 = numero2 - numero1;
			}
		}
		return numero1;
	}
	public static double minimoComunMultiplo(double numero1 , double numero2) {
		double comunDivisor = greaterCommonDivisor(numero1,numero2);
		double resultado = (numero1 * numero2)/comunDivisor;
		return resultado;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		System.out.println("Ejercicio 1 - Realizar un método llamado numeroSolucionesEcuacionSegundoGrado que reciba\n"
				+ "los coeficientes de una ecuación de segundo grado y devuelva el número de\n"
				+ "soluciones que tiene. Si los argumentos no son válidos (el primer coeficiente tiene\n"
				+ "que ser distinto de cero) debe devolver un -1.");
		System.out.println("");
		System.out.println(numeroSolucionesEcuacionSegundoGrado(6,-5,1));
		System.out.println("");
		/*System.out.println("Ejercicio 2 - Realiza un programa que pida un número por teclado y que después muestre ese\n"
				+ "número al revés.");
		
		System.out.println("Introduce un número: ");
		String numero = sc.nextLine();
		String resultado = "";
		
		for(int i = numero.length(); 0 < i;) {
			i--;
			resultado += numero.charAt(i);
			
		}System.out.println(resultado);*/
		
		System.out.println("Ejercicio 3 - Diseña una función que, dada una cadena de entrada, comprueba si es una\n"
				+ "contraseña fuerte o no. Se considera que una contraseña es fuerte si contiene 8 o\n"
				+ "más caracteres, y entre ellos al menos hay una mayúscula, una minúscula, un signo\n"
				+ "de puntuación y al menos un dígito.");
		System.out.println("");
		System.out.println(contraseñaValida("JesusLopez6?"));
		System.out.println("");
		System.out.println("Ejercicio 4 - Elabora un programa que codifique una cadena, de tal modo que en el resultado se\n"
				+ "inviertan cada 2 caracteres. Los caracteres intercambiados no pueden volver a\n"
				+ "intercambiarse. Ejemplo:\n"
				+ "Entrada -> Hola mundo\n"
				+ "Salida -> oHalm nuod");
		System.out.println("");
		System.out.println(cadenaAlReves("Hola mundo"));
		System.out.println("");
		System.out.println("Ejercicio 5 - Realizar un método llamado esMultiplo que recibirá dos números y devuelva True si\n"
				+ "el primer número es múltiplo del segundo");
		System.out.println("");
		System.out.println(multiplos(6,18));
		System.out.println("");
		System.out.println("Ejercicio 6 - Realizar un método llamado horaMayor que recibirá seis valores enteres, los tres\n"
				+ "primeros representarán la hora, minuto y segundos de la primera hora y los otros\n"
				+ "tres de la segunda hora. Se deberá devolver un 1 si la primera hora es mayor que la\n"
				+ "segunda, un 2 si la segunda hora es mayor que la primera, un 0 si son iguales y un\n"
				+ "-1000 si los datos no son correctos.");
		System.out.println("");
		System.out.println(horaMayor(6,30,1,2,30,1));
		System.out.println("");
		System.out.println("Ejercicio 7 - Realizar un método llamado segundosEntre que recibirá seis valores enteros, los\n"
				+ "tres primeros representarán la hora, minuto y segundos de la primera hora y los\n"
				+ "otros tres de la segunda hora. Se deberá devolver el número de segundos que hay\n"
				+ "entre la primera hora y la segunda (el valor debe ser siempre en positivo). Si los\n"
				+ "datos no son correctos se deberá devolver -1000.");
		System.out.println("");
		System.out.println(segundosEntre(3,30,1,2,30,1));
		System.out.println("");
		System.out.println("Ejercicio 8 - Realiza un método llamado toBinary que reciba un número decimal como\n"
				+ "argumento y devuelva un String con el número binario correspondiente.");
		System.out.println("");
		System.out.println(toBinary(2));
		System.out.println("");
		System.out.println("Ejercicio 9 - Realiza un método llamado toDecimal que reciba un String con un valor decimal\n"
				+ "como argumento y devuelva un número con el número decimal correspondiente.");
		System.out.println("");
		System.out.println(toDecimal("1100"));
		System.out.println("");
		System.out.println("Ejercicio 10 - Realiza un método llamado gcd (greaterCommonDivisor) que recibirá dos números y\n"
				+ "devuelva el máximo común divisor según el algoritmo de Euclides.");
		System.out.println("");
		System.out.println(greaterCommonDivisor(24,36));
		System.out.println("");
		System.out.println("Ejercicio 11 - Realizar un método llamado minimoComunMultiplo que reciba dos números y\n"
				+ "calcule el mínimo común múltiplo de dos números.");
		System.out.println("");
		System.out.println(minimoComunMultiplo(24,36));
		}
		
	}

	
	
	
