package arrays.calculos;

public class CalculoUtils {

	private static final String DIGITOS = "0123456789";
	
	private int[] numeros;
	private int[] contadores;
	
	public CalculoUtils(int[] numeros) {
		this.numeros=numeros;
		this.contadores=calcularFrecuenciaNumeros();
	}
	
	
	public double computeAverage() {
		int suma = 0;
		
		for(int n : numeros) { //int i=0; i<numeros.length; i++
			suma+=n;
		}
	
		return numeros.length>0? suma/numeros.length : 0;
		
	}
	
	// {101, 3, 13, 23, 33}  //3
	public int filtrarPorDigitoFinal(char digitoFinal) {
		int cantidad = 0;
		
		for(int n : numeros) {
			int sizeNumero = String.valueOf(n).length();
			
			if (digitoFinal == String.valueOf(n).charAt(sizeNumero-1)) {
				cantidad++;
			}
		}
		
		return cantidad;
	}
	
	
	private int[] calcularFrecuenciaNumeros() {
		
		this.contadores = new int[DIGITOS.length()];
		
		for(int n : numeros) {
			String numeroComoCadena = String.valueOf(n);
			char digitoFinal = numeroComoCadena.charAt(numeroComoCadena.length()-1);
			
			contadores[DIGITOS.indexOf(digitoFinal)]+=1;
			
		}
		
		
		return contadores;
	}
	
	
	public String obtenerMasRepetido() {
		
		
		int posicionMayor = 0;
		
		for(int i=0; i<contadores.length; i++) {
			if(contadores[i]>contadores[posicionMayor]) {
				posicionMayor = i;
			}
		}
		return String.format("El número final que más se repite es %s", posicionMayor);
	}
	
	
	
	public String obtenerNoTerminan() {
		StringBuilder sb = new StringBuilder("Los números que no aparecen son: ");
		
		for(int i=0; i<contadores.length; i++) {
			if(contadores[i] == 0) {
				sb.append(String.format("%s ", i));
			}
		}
		
		//new Random().nextInt(1, 13);
		
		return sb.toString();
	}
	
	
	public String obtenerEstadisticaNumerosFinales() {
		
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<DIGITOS.length(); i++) {
			
			int cantidad = filtrarPorDigitoFinal(DIGITOS.charAt(i));
			sb.append(String.format("%s números terminan en %s \n", 
									cantidad, 
									DIGITOS.charAt(i)));
		}
		
		
		return sb.toString();
	}
	
	
	
	
	
}
