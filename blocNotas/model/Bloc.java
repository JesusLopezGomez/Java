package blocNotas.model;

import java.util.Arrays;

public class Bloc {

	private static final int NUMERO_NOTAS_MAXIMA = 15;
	private Nota[] notas = new Nota[NUMERO_NOTAS_MAXIMA];
	
	private int numNotas;
	private String nombre;
	
	public Bloc(String nombre) {
		this.nombre = nombre;
	}
	
	private Nota encontrarNota(int codigo) {
		Nota nota = null;
		for(int i = 0; i < NUMERO_NOTAS_MAXIMA; i ++) {
			if(this.notas != null && this.notas[i].getCodigo() == codigo) {
				nota = this.notas[i];
			}
		}
		return nota;
	}
	
	public String getNota(int codigo) {
		String nota = "-1";
		if(encontrarNota(codigo)!= null) {
			nota = encontrarNota(codigo).toString();
		}
		
		return nota;
	}
	
	public void updateNota(int codigo, String texto) {
		Nota nota = null;
		if(encontrarNota(codigo)!= null) {
			nota = encontrarNota(codigo);
			nota.setTexto(texto);
		}
	}
	
	public void activa(int codigo) {
		NotaAlarma nota = null;
		if(encontrarNota(codigo)!= null) {
			nota = (NotaAlarma) encontrarNota(codigo);
			nota.activar();
		}
	}
	
	public void desactiva(int codigo) {
		NotaAlarma nota = null;
		if(encontrarNota(codigo)!= null) {
			nota = (NotaAlarma) encontrarNota(codigo);
			nota.desactivar();
		}
	}
	
	public int getNumeroNotasMaximas() {
		return this.NUMERO_NOTAS_MAXIMA;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	
	

}
