package boletin1EstructuraDatos.historialNavegacion_ej4.model;

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
	
	public String consultarHistorialCompleto() {
		StringBuilder sb = new StringBuilder();
		
		for(PaginaWeb p :this.listaWebs) {
			sb.append(p).append(System.lineSeparator());
		}
		
		return sb.toString();
	}
	
	public String consultarHistorialDia(int dia) throws ExceptionHistorial {
		StringBuilder sb = new StringBuilder();
		for(PaginaWeb p: this.listaWebs) {
			if(p != null && p.getFechaHora().getDayOfMonth() == dia) {
				sb.append(p).append(System.lineSeparator());
			}
		}
		
		return sb.toString();
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
