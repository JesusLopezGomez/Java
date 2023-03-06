package arrays.alumnos;

import java.util.Arrays;

public class NotasAlumnos {
	
	private static String[] nombresAlumnos;
	private static double[] notasAlumnos;
	private static int contador = 0;
	
	public NotasAlumnos(int cantidadDeAlumnos) {
		this.nombresAlumnos = new String[cantidadDeAlumnos];
		this.notasAlumnos = new double[cantidadDeAlumnos];
	}
	public void añadirAlumnoNota(String nombre, double nota) {
		if(contador < nombresAlumnos.length) {
			nombresAlumnos[contador] = nombre;
			notasAlumnos[contador] = nota;
			contador ++;
		}
	}
	public static String getAlumnosNotaAprobada() {
		int cont = 0;
		for(double elemento:notasAlumnos) {
			if(elemento>=5) {
				cont++;
			}
		}
		String[] alumnosAprobados=new String[cont];
		for(int i = 0; i < notasAlumnos.length;i++) {
			if(notasAlumnos[i] >= 5.0 && cont > 0) {
				alumnosAprobados[cont-1] = nombresAlumnos[i] + ": " + notasAlumnos[i];
				cont --;
			}
		} 
		
		return Arrays.toString(alumnosAprobados);
	}
	public static String getAlumnosNotaSuspensa() {
		int cont = 0;
		for(double elemento:notasAlumnos) {
			if(elemento<5) {
				cont++;
			}
		}
		String[] alumnosSuspensos=new String[cont];
		for(int i = 0; i < notasAlumnos.length;i++) {
			if(notasAlumnos[i] < 5.0 && cont > 0) {
				alumnosSuspensos[cont-1] = nombresAlumnos[i] + ": " + notasAlumnos[i];
				cont --;
			}
		} 
		
		return Arrays.toString(alumnosSuspensos);
	}
	public static double getNotaMediaClase() {
		double acomulador = 0.0;
		for(double elemento: notasAlumnos) {
			acomulador += elemento;
		}return acomulador/notasAlumnos.length;
	}
	public static String getAlumnosConNotaX(double nota) {
		int cont = 0;
		for(double elemento:notasAlumnos) {
			if(elemento> nota) {
				cont++;
			}
		}
		String[] alumnosConNotaX=new String[cont];
		for(int i = 0; i < notasAlumnos.length;i++) {
			if(notasAlumnos[i] > nota && cont > 0) {
				alumnosConNotaX[cont-1] = nombresAlumnos[i] + ": " + notasAlumnos[i];
				cont --;
			}
		} 
		
		return Arrays.toString(alumnosConNotaX);
	}
	public static String getAlumnoNotaMayorMenor() {
		double notaMayor = 0.0;
		int posicionMayor = 0;
		for(int i = 0; i < notasAlumnos.length; i++) {
			if(notaMayor < notasAlumnos[i]) {
				notaMayor = notasAlumnos[i];
				posicionMayor = i;
			}
		}
		
		double menor = 0.0;
		int posicionMenor = 0;
		for(int i = 0; i < notasAlumnos.length; i++) {
			if(notaMayor > notasAlumnos[i]) {
				menor = notasAlumnos[i];
				posicionMenor = i;
			}
		}
		
		
		return "Nota mayor: " + nombresAlumnos[posicionMayor] + ": " + notasAlumnos[posicionMayor] + ", Nota menor: " + nombresAlumnos[posicionMenor] + ": " + notasAlumnos[posicionMenor];
	}
	public static String getListadoCrecienteNota() {
		Arrays.sort(notasAlumnos);
		
		return Arrays.toString(notasAlumnos);
				
	}
	@Override
	public String toString() {
		return Arrays.toString(nombresAlumnos)+ "\n" + Arrays.toString(notasAlumnos);
	}
	
	
	
	

	
	

}
