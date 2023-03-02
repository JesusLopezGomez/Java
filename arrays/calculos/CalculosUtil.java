package arrays.calculos;

public class CalculosUtil {

	public static double obtenerMedia(int[] numeros) {
		int suma = 0;
		for(int n : numeros) {
			suma+=n;
		}
		return numeros.length > 0?suma/numeros.length:0;
	}
	
	public int filtrarPorDigitoFinal(int[] numeros, char digitoFinal) {
		int cantidad = 0;
		for(int n:numeros) {
			int sizeNumero = String.valueOf(n).length();
			if(digitoFinal == String.valueOf(n).charAt(sizeNumero-1)) {
				cantidad ++;
			}
		}
		return cantidad;
	}

}
