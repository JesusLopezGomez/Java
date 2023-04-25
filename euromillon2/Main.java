package euromillon2;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import euromillon2.model.Combinacion;
import euromillon2.model.CombinacionException;
import euromillon2.model.Historial;
import euromillon2.model.HistorialException;

public class Main {

	public static void main(String[] args) {
		Historial h = new Historial();
		
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

	}

}
