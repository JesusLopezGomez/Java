package test;

public class Numbers {

	public Numbers() {
	}
	
	public static boolean esPar(int number) {
		boolean esPar = false;
		
		if(number%2 == 0) {
			esPar = true;
		}else {
			esPar = false;
		}
		
		return esPar;
	}

}
