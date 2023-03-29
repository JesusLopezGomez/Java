package blocNotas.model;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;

import blocNotas.excepciones.BlocException;

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
	
	public void addNota(String texto) throws BlocException {
		if(numNotas == NUMERO_NOTAS_MAXIMA) {
			throw new BlocException("No hay espacio para más notas");
		}
		this.notas[numNotas ++] = new Nota(texto);
		
	}
	
	public void addNota(Nota alarma) throws BlocException {
		if(numNotas == NUMERO_NOTAS_MAXIMA) {
			throw new BlocException("No hay espacio para más notas");
		}
		this.notas[numNotas ++] = alarma;
		
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

		for(Nota n: this.notas) {
			if(n!= null && n instanceof NotaAlarma && n.getCodigo()==codigo) {
				NotaAlarma notaAlarma = ((NotaAlarma)n);
				notaAlarma.activar();
			}
		}
		
	}
	
	public void desactiva(int codigo) {
	
		for(Nota n: this.notas) {
			if(n!= null && n instanceof NotaAlarma && n.getCodigo()==codigo) {
				NotaAlarma notaAlarma = ((NotaAlarma)n);
				notaAlarma.desactivar();
			}
		}
	}
	
	public int getNumeroNotasMaximas() {
		return this.NUMERO_NOTAS_MAXIMA;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		boolean resultado = false;
		if (this == obj)
			resultado = true;
		if (obj == null)
			resultado = false;
		if (getClass() != obj.getClass())
			resultado = false;
		Bloc other = (Bloc) obj;
		return resultado && Objects.equals(nombre, other.nombre);
	}
	
	public Nota[] blocSinNull() {
		int tamannio = 0;
		
		for(Nota n: this.notas) {
			if(n != null) {
				tamannio ++;
			}
		}
		
		Nota[] tmp = new Nota[tamannio];
		int pos = 0;
		
		
		for(Nota n: this.notas) {
			if(n != null) {
				tmp[pos++] = n;
			}
		}
		
		return tmp;
	}
	
	public String ordenaBloc() {
		Nota[] nota = blocSinNull();
		Arrays.sort(nota);
		return Arrays.toString(this.notas);
	}
	
	@Override
	public String toString() {
		return Arrays.toString(this.notas);
	}
	
		
	

}
