package arrays.fecha;

import java.util.Arrays;

public class Fecha {

	private int dia;
	private int mes;
	private int annio;
	
	
	
	public Fecha(int dia, int mes, int annio) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.annio = annio;
	}

	public static int diasDeUnMes(int mes) {
		int[] diasMes = {31,28,31,30,31,30,31,31,30,31,30,31};
		int resultado = -1;
		if(mes >= 1 && mes <= 12) {
			resultado = diasMes[mes-1];
		}
		return resultado;
	}
	
	public static String numeroMes(int numeroMes) {
		String[] meses = {"enero","febreo","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
		String mes = "-1";
		if(numeroMes >= 1 && numeroMes <= 12) {
			 mes = meses[numeroMes-1];
		}
		return mes;
	}

	@Override
	public String toString() {
		String resultado = "Fecha incorrecta.";
		if(!(numeroMes(mes).equals("-1")) && diasDeUnMes(mes) >= dia) {
			resultado = "La fecha en formato largo es "+ dia +" de " +  numeroMes(mes) + " de " +annio;
		}
		return resultado;
	}
	
	
	
	
	
}
