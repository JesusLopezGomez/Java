package euroMillon;

import java.time.LocalDate;

import euroMillon.model.Combinacion;
import euroMillon.model.CombinacionException;
import euroMillon.model.Historial;
import euroMillon.model.HistorialException;

public class Main {

	public static void main(String[] args) {
		
		Historial h = new Historial();
		Combinacion c = null;
		try {
			c = new Combinacion(1,2,3,4,5,7,8);
		} catch (CombinacionException e) {
			e.printStackTrace();
		}
		
		try {
			h.addSorteo(LocalDate.of(2003, 11, 19), c);
		} catch (CombinacionException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(h.comprobarAciertos(LocalDate.of(2003, 11, 19), new Combinacion(2,8,13,22,5,7,12)));
		} catch (CombinacionException e) {
			e.printStackTrace();
		}
		
		
	}

}
