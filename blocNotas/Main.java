package blocNotas;

import java.time.LocalDateTime;

import blocNotas.excepciones.BlocException;
import blocNotas.excepciones.NotaAlarmaException;
import blocNotas.model.Bloc;
import blocNotas.model.Nota;
import blocNotas.model.NotaAlarma;

public class Main {

	public static void main(String[] args) throws NotaAlarmaException, BlocException {
		
		Nota nota1 = new Nota("Mañana examen de programacion");
		
		Nota notaConAlarma = new NotaAlarma("Quedan dos dias",LocalDateTime.now(),true);
		
		Bloc semanal = new Bloc("Semana 1");
		
		semanal.addNota("Mañana examen de programacion");
		
		semanal.addNota(notaConAlarma);
		
		System.out.println(notaConAlarma.getCodigo());	
		semanal.activa(1);
		semanal.ordenaBloc();
		System.out.println(semanal);
	}
}
