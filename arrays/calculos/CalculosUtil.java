package arrays.calculos;

public class CalculosUtil {

	public static final String DIGITOS = "0123456789";
	
	public static double obtenerMedia(int[] numeros) {
		int suma = 0;
		for(int n : numeros) {
			suma+=n;
		}
		return numeros.length > 0?suma/numeros.length:0;
	}
	public static int filtrarPorDigitoFinal(int[] numeros, char digitoFinal) {
		int cantidad = 0;
		for(int n:numeros) {
			int sizeNumero = String.valueOf(n).length();
			if(digitoFinal == String.valueOf(n).charAt(sizeNumero-1)) {
				cantidad ++;
			}
		}
		return cantidad;
	}
	public static String calcularDigitoMasTerminado(int[] numeros) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < DIGITOS.length();i++) {
			int cantidad = filtrarPorDigitoFinal(numeros,DIGITOS.charAt(i));
			sb.append(String.format("%s números terminan en %s \n", cantidad,DIGITOS.charAt(i)));
		}
		return sb.toString();
	}
	public static int[] desplazarNumerosDerecha(int[] numeros) {
		int ultimo = numeros[numeros.length-1];
		
		for(int i = numeros.length-2; i>=0; i--) {
			numeros[i+1] = numeros[i];
		}
		numeros[0] = ultimo;
		
		return numeros;
	}
	public static int[] desplazarNumerosIzquierda(int[] numeros) {
		int primero = numeros[0];
		
		for(int i = 1; i<numeros.length; i++) {
			numeros[i-1] = numeros[i];
		}
		numeros[numeros.length-1] = primero;
		
		return numeros;
	}
}
