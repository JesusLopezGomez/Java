package com.edu;

public class examenAnyoPasadoEj2 {
	public static double frecuenciaMaximaRecomendada(int añoActual,String fechaNacimiento) {
		int edad = 0;
		double frecuenciaMaximaRecomendada = 0;
		if(fechaNacimiento.length() == 10 && esFechaValida(fechaNacimiento)) {
			edad = añoActual - Integer.valueOf(fechaNacimiento.substring(6,fechaNacimiento.length()));
			frecuenciaMaximaRecomendada = ((220 - edad) - ((220 - edad)*0.15));
		}else {
			frecuenciaMaximaRecomendada = -1;
		}
		return frecuenciaMaximaRecomendada;
	}
	public static boolean esFechaValida(String fecha) {
		boolean esValida = false;
		boolean esBisiesto = false;
		int mes = Integer.valueOf(fecha.substring(3, 5));
		int dia = Integer.valueOf(fecha.substring(0, 2));
		int anyo = Integer.valueOf(fecha.substring(6, 10));
;		if((Integer.valueOf(anyo)%400 == 0) || ((anyo)%4 == 0) && (anyo)%100 == 0) {
			esBisiesto = true;
			
		}
		if(fecha.length() == 10) {
			if((mes == 4 || mes == 6 || mes == 9 ||mes == 11) && (dia <= 30 && dia >=1)){
				esValida = true;
			}else if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes== 12) && (dia <= 31 && dia >=1)){
				esValida = true;
			}else if((mes == 2 && esBisiesto) && (dia >=1 && dia <= 29 ))  {
				esValida = true;
			}else if((mes == 2 && !esBisiesto) && (dia >=1 && dia <= 28 )) {
				esValida = true;
			}
		}
		return esValida;
	}
	public static void main(String[] args) {
		System.out.println(frecuenciaMaximaRecomendada(2022,"29/01/2020"));
		System.out.println(esFechaValida("28/02/2023"));
	}
	
}
