package com.edu;

import java.util.Scanner;

public class examenAnyoPasadoEj1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double precioEntradaGeneral = 8;
		double precioEntradaMiercoles = 5;
		double precioEntradaJuevesPareja = 5.5;
		double totalEntrada = 0;
		double numeroEntradas = 1;
		String diaSemana = "j";
		String tarjeta = "";
		while (numeroEntradas != 0) {
			
			System.out.println("Numero de entradas:");
			numeroEntradas = Integer.valueOf(sc.nextLine());
			
			System.out.println("Día de la semana(l,m,x,j,v,s,d):");
			diaSemana = sc.nextLine();
			
			while(!(diaSemana.equals("l") || diaSemana.equals("m")  || diaSemana.equals("x")  || diaSemana.equals("j")  || diaSemana.equals("v")  || diaSemana.equals("s")  || diaSemana.equals("d"))) {
				System.out.println("Introduzca el día de la semana correctamente(l,m,x,j,v,s,d):");
				diaSemana = sc.nextLine();
			}
			
			System.out.println("Tarjeta CineJacaranda(s/n):");
			tarjeta = sc.nextLine();
			
			while(!(tarjeta.equals("s")  || tarjeta.equals("n"))) {
				System.out.println("Introduzca la tarjeta CineJacaranda correctamente(s/n):");
				tarjeta = sc.nextLine();
			}
			
			if(diaSemana.equals("l") || diaSemana.equals("m") || diaSemana.equals("v")  || diaSemana.equals("s")  || diaSemana.equals("d")) {
				totalEntrada = precioEntradaGeneral * numeroEntradas;
			}else if(diaSemana.equals("x")) {
				totalEntrada = precioEntradaMiercoles * numeroEntradas;
			}else if(diaSemana.equals("j")) {
				 if(numeroEntradas%2 == 0) {
					 totalEntrada = precioEntradaJuevesPareja * numeroEntradas;
				 }else {
					 totalEntrada = (precioEntradaJuevesPareja * (numeroEntradas-1)) + precioEntradaGeneral;
				 }
			}if(tarjeta.equals("s")) {
			totalEntrada = (totalEntrada - (totalEntrada * 0.10));
			}System.out.println("El precio de su compra es: " + totalEntrada);
		}
	}

}
