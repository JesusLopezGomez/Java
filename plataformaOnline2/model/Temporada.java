package plataformaOnline2.model;

import java.util.ArrayList;
import java.util.List;

public class Temporada implements Comparable<Temporada>{
	
	private String nombreTemporada;  // Nombre de las temporada
	private List<String> capitulos; // Lista donde etán los nombres de los capítulos de la temporada
	private int sumaOpiniones;  // Suma de todas las opiniones que se han realizado de la temporada
	private int numeroOpiniones; // Número de opiniones que se han realizado de la temporada
	
	/**
	 * Constructor de una temporada. Se crea sin ningún capítulo.
	 * @param nombreTemporada: recibe el nombre de la temporada.
	 * Obviamente no se ha realizado ninguna opinión sobre la temporada
	 */
	
	public Temporada(String nombreTemporada) {
		this.nombreTemporada=nombreTemporada;
		capitulos=new ArrayList<String>();
		sumaOpiniones=0;
		numeroOpiniones=0;
	}
	
	/**
	 * Método que añade un capítulo a la temporada. Se añade al final de los capítulos existente.
	 * No hay ningún control por lo que puede pasar que existan capítulos con el mismo nombre
	 * @param capitulo: nombre del capítulo a añadir
	 */
	public void annadirCapitulo(String capitulo) {
		capitulos.add(capitulo);
	}
	
	/**
	 * Elimna un capítulo de la temporada. Devuelve true si el capítulo estaba y se ha borrado, y 
	 * devuelve false si el capítulo no estába en la lista y por lo tanto no se ha podido borrar.
	 * @param capitulo: nombre del capítulo a borrar
	 * 
	 * 	 
	 * */
	
	public boolean eliminarCapitulo (String capitulo) {
		boolean borrado;
		borrado=capitulos.remove(capitulo);
		return borrado;
	}
	
	/**
	 * Métodoque valora la temporada. Los valores permitidos son de 0 a 10
	 * Se debe incrementar la suma de opiniones de la temporada y el número de valores
	 * que ha recibido la valoración
	 * @param nota
	 * @throws SerieException
	 */
	public void valorar( int nota)throws SerieException {
		if (nota < 0 || nota > 10) {
			throw new SerieException("Nota incorrecta "  + nota);
		}
		
		sumaOpiniones= sumaOpiniones + nota;
		numeroOpiniones++;
	}
	
	
	/**
	 * Debe añadir un capítulo justo detrás del capítulo que se denomina nombreCapituloAnterior.
	 * Si no encuentra el capítulo anterior  saltará la excepción
	 * @param nombreCapituloAnnadir: este será el nombre del capítulo que se añadirá
	 * @param nombreCapituloAnterior: detrás de este capítulo se debe añadir

	 * @throws SerieException: si no encuentra el capítulo que indica la posición para añadir.
	 */
	public void anadirCapituloDespues(String nombreCapituloAnnadir, String nombreCapituloAnterior) throws SerieException{
		if(!this.capitulos.contains(nombreCapituloAnterior)) {
			throw new SerieException("La temporada no contiene el capitulo anterior.");
		}
		this.capitulos.add(this.capitulos.indexOf(nombreCapituloAnterior)+1,nombreCapituloAnnadir);
	}
	

	/**
	 * Devuleve el nombre del primer capítulo que contiene la palabra que  pasa por parámetro.
	 *  Si no lo encuentra salta la excepción 
	 * @param palabra
	 * @return
	 * @throws SerieException
	 */
	public String primerCapituloQueContieneEstaPalabara(String palabra) throws SerieException {
		String capitulo = null;
		boolean encontrado = false;
		
		for(int i = 0; !encontrado && i < this.capitulos.size() ; i++) {
			if(this.capitulos.get(i).contains(palabra)) {
				capitulo = this.capitulos.get(i);
				encontrado = true;
			}
		}
		
		if(!encontrado) {
			throw new SerieException("No hay capitulo que contenga la palabra.");
		}
		
		return capitulo;
	}
	
	
	
	public double getNotaMedia() {
		double notaMedia=-1;
		if (numeroOpiniones!=0) {
			notaMedia= sumaOpiniones/numeroOpiniones;
		}
		return notaMedia;
	}
	
	public String toString() {
		return nombreTemporada+   " Número de capitulos " + capitulos.size() + 
				" Nota media " + getNotaMedia();
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombreTemporada == null) ? 0 : nombreTemporada.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Temporada other = (Temporada) obj;
		if (nombreTemporada == null) {
			if (other.nombreTemporada != null)
				return false;
		} else if (!nombreTemporada.equals(other.nombreTemporada))
			return false;
		return true;
	}

	@Override
	public int compareTo(Temporada o) {
		return o.capitulos.size() - this.capitulos.size();
	}
	
	
	public String getNombreTemporada() {
		return this.nombreTemporada;
	}
	
	public int getNumCapitulos() {
		return this.capitulos.size();
	}
	
	public int getNumOpiniones() {
		return this.numeroOpiniones;
	}
	
	public int getNumSumOponione() {
		return this.sumaOpiniones;
	}
	
	public List<String> getCapitulos(){
		return this.capitulos;
	}
}
