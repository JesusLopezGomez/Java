package euromillon2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import euromillon2.model.Combinacion;
import euromillon2.model.CombinacionException;
import euromillon2.model.Historial;

public class Main {

	public static void main(String[] args) {
		Historial h = new Historial();
		
		/*
		try {
			System.out.println(h.addSorteo(LocalDate.of(2003, 11, 19), new Combinacion(19,11,03,4,6,8,5)));
			System.out.println(h.addSorteo(2003, 11, 21, new Combinacion(11,12,13,10,8,9,6)));
			System.out.println(h.addSorteo(2005, 1, 31, new Combinacion(1,14,3,10,8,9,6)));
			System.out.println(h.actualizarSorteo(LocalDate.of(2003, 11, 19), new Combinacion(1,2,3,4,5,7,8)));
			
			System.out.println(h.borrarSorteo(LocalDate.of(2005, 1, 31)));
			
			System.out.println(h.listarSorteosDesdeFecha(LocalDate.of(2003, 11, 18)));
			
			System.out.println(h.mostrarHistorico());
			
			System.out.println(h.comprobarAciertos((LocalDate.of(2003, 11, 19)), new Combinacion(1,2,3,4,5,6,8)));
		} catch (HistorialException e) {
			e.printStackTrace();
		} catch (CombinacionException e) {
			e.printStackTrace();
		}
		
		File f = new File("/home/estudiante/Downloads/Euromillones 2004 a 2023.csv");
		
		
		try {
			BufferedReader buffer = new BufferedReader(new FileReader(f));
			String linea = buffer.readLine();
			linea = buffer.readLine();
			while(linea != null) {
				try {
					h.addSorteo(linea);
				} catch (CombinacionException e) {
					e.printStackTrace();
				}
				linea = buffer.readLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/

		h.cargarCombinaciones("/home/estudiante/Downloads/Euromillones 2004 a 2023.csv");
		System.out.println(h.mostrarHistorico());
		System.out.println(h.numeroMasRepetido());
		System.out.println(h.numeroMenosRepetido());
		System.out.println(h.estrellaMenosRepetido());
		System.out.println(h.estrellaMasRepetido());
		System.out.println(h.mayorSecuenciaNumerosConsecutivos());
		
	}

}
