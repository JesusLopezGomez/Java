package boletin1EstructuraDatos.historialNavegacion_ej4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Historial {

	private List<PaginaWeb> listaWebs; 
	
	public Historial() {
		super();
		listaWebs = new ArrayList<>();
	}
	
	public void anniadirPaginaConsultada(PaginaWeb p) throws ExceptionHistorial {
		if(this.listaWebs.isEmpty()) {
			this.listaWebs.add(p);
		}else if(this.listaWebs.get(this.listaWebs.size()-1).getFechaHora().isBefore(p.getFechaHora())){
			this.listaWebs.add(p);
		}else {
			throw new ExceptionHistorial("Error, has añadido una pagina con fecha de consulta anterior que la última almacenada.");
		}
	}
	
	public Historial consultarHistorialCompleto() {
		return this;
	}
	
	public Historial consultarHistorialDia(int dia) throws ExceptionHistorial {
		Historial historialDia = new Historial();
		for(PaginaWeb p: this.listaWebs) {
			if(p != null && p.getFechaHora().getDayOfMonth() == dia) {
				historialDia.anniadirPaginaConsultada(p);
			}
		}
		
		return historialDia;
	}
	
	public void borrarHistorial() {
		this.listaWebs.clear();
	}

	public void borrarVisitasPagina(String pagina) {
		Iterator<PaginaWeb> iWebs = this.listaWebs.iterator();
		while(pagina != null && iWebs.hasNext()) {
			if(iWebs.next().getNombre().equals(pagina)) {
				iWebs.remove();
			}
		}
	}
	
	@Override
	public String toString() {
		return "Historial" + this.listaWebs.toString();
	}
	

}
