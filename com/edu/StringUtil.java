package com.edu;

public class StringUtil {
	
	private String cadena;

	public StringUtil(String cadena) {
		super();
		this.cadena = cadena;
	}
	
	public void  invetirCaracteres() {
		StringBuilder sb = new StringBuilder();
		
		if((cadena != null) && !cadena.isEmpty()) {
			
			for(int i = 0; i < cadena.length()-1 ;i+=2) {
				sb.append(cadena.charAt(i+1));
				sb.append(cadena.charAt(i));
			}
			sb.append((cadena.length()%2 !=0)?
					cadena.charAt(cadena.length()-1):"");
			
		}
		cadena =  sb.toString();
	}
	
	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}
}
