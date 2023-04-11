package com.edu;

public class examenAnyoPasadoEj3 {
	public static double emitirFrecuenciaNotas(String nota) {
		double resultadoFrecuencia = 0.0;
		nota = nota.toLowerCase();
		final double DO = 523.25;
		final double RE = 587.33;
		final double MI = 659.26;
		final double FA = 698.46;
		final double SOL = 783.99;
		final double LA = 880.00;
		final double SI = 987.77;
		if(!(nota.equals("do") || nota.equals("re") || nota.equals("mi") || nota.equals("fa") || nota.equals("sol") || nota.equals("la") || nota.equals("si"))) {
			resultadoFrecuencia = -1;
		}else {
			if(nota.equals("do")){
				resultadoFrecuencia = DO;
			}else if(nota.equals("re")) {
				resultadoFrecuencia = RE;
			}else if(nota.equals("mi")) {
				resultadoFrecuencia = MI;
			}else if(nota.equals("fa")) {
				resultadoFrecuencia = FA;
			}else if(nota.equals("sol")) {
				resultadoFrecuencia = SOL;
			}else if(nota.equals("la")) {
				resultadoFrecuencia = LA;
			}else{
				resultadoFrecuencia = SI;
			}
		}
		return resultadoFrecuencia;
	}
	public static double emitirFrecuenciaNotas2(String nota,boolean flaj) {
		double resultadoFrecuencia = 0.0;
		nota = nota.toLowerCase();
		final double DO = 523.25;
		final double RE = 587.33;
		final double MI = 659.26;
		final double FA = 698.46;
		final double SOL = 783.99;
		final double LA = 880.00;
		final double SI = 987.77;
		if(!(nota.equals("do") || nota.equals("re") || nota.equals("mi") || nota.equals("fa") || nota.equals("sol") || nota.equals("la") || nota.equals("si"))) {
			resultadoFrecuencia = -1;
		}else if(flaj) {
			if(nota.equals("do")){
				resultadoFrecuencia = DO*1.03;
			}else if(nota.equals("re")) {
				resultadoFrecuencia = RE*1.03;
			}else if(nota.equals("mi")) {
				resultadoFrecuencia = MI*1.03;
			}else if(nota.equals("fa")) {
				resultadoFrecuencia = FA*1.03;
			}else if(nota.equals("sol")) {
				resultadoFrecuencia = SOL*1.03;
			}else if(nota.equals("la")) {
				resultadoFrecuencia = LA*1.03;
			}else{
				resultadoFrecuencia = SI*1.03;
			}
		}else {
			if(nota.equals("do")){
				resultadoFrecuencia = DO;
			}else if(nota.equals("re")) {
				resultadoFrecuencia = RE;
			}else if(nota.equals("mi")) {
				resultadoFrecuencia = MI;
			}else if(nota.equals("fa")) {
				resultadoFrecuencia = FA;
			}else if(nota.equals("sol")) {
				resultadoFrecuencia = SOL;
			}else if(nota.equals("la")) {
				resultadoFrecuencia = LA;
			}else{
				resultadoFrecuencia = SI;
			}
		}
		return resultadoFrecuencia;
	}
	public static void main(String[] args) {
		System.out.println(emitirFrecuenciaNotas("do"));
		System.out.println(emitirFrecuenciaNotas2("do",true));
	}

}
