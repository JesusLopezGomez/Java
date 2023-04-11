package blocNotas.model;

import java.time.LocalDateTime;

import blocNotas.excepciones.NotaAlarmaException;
import blocNotas.interfaces.Activable;

public class NotaAlarma extends Nota implements Activable {

	private LocalDateTime fechaAlarma;
	private static final int MINUTOS_REPETIR_POR_DEFECTO = 5;
	private int minutosRepetir;
	private boolean activado;
	
	public NotaAlarma(String texto, LocalDateTime fechaAlarma, boolean activado) throws NotaAlarmaException {
		super(texto);
		if(texto == null || fechaAlarma == null) {
			throw new NotaAlarmaException("Error has introducido algún valor nulo");
		}
		setFechaAlarma(fechaAlarma);
		this.activado = activado;
		this.minutosRepetir = MINUTOS_REPETIR_POR_DEFECTO;
	}
	public NotaAlarma(String texto, LocalDateTime fechaAlarma, int minutosRepetir) {
		super(texto);
		this.fechaAlarma = fechaAlarma;
		this.minutosRepetir = minutosRepetir;
	}
	
	private void setFechaAlarma(LocalDateTime fecha) {
		this.fechaAlarma = fecha;
	}
	
	public static int getMINUTOS_REPETIR_POR_DEFECTO() {
		return MINUTOS_REPETIR_POR_DEFECTO;
	}
	@Override
	public void activar() {
		this.activado = true;
	}
	@Override
	public void desactivar() {
		this.activado = false;
	}
	
	public boolean isActivado() {
		return this.activado;
	}
	
	@Override
	public String toString() {
		return String.format("Nota con fecha de alarma: %s , minutos repetir: %s, y estado: %s",
				this.fechaAlarma,this.minutosRepetir,this.activado);
	}
	
	

}
