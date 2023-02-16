package com.edu;

public class Main {

	public static void main(String[] args) {
		
		StringUtil su = new StringUtil("Hola, mundo");
		
		su.invetirCaracteres();
		
		System.out.println(su.getCadena());
		
		su.invetirCaracteres();
		System.out.println(su.getCadena());
	}

}
