package plataformaOnline;

import java.io.IOException;

import plataformaOnline.model.Catalogo;
import plataformaOnline.model.Serie;
import plataformaOnline.model.SerieException;
import plataformaOnline.model.Tema;
import plataformaOnline.model.Temporada;

public class Main {
	public static void main(String[] args) {
		
		Catalogo series = new Catalogo();
		try {
			series.annadirSerie("This is us", 2015, Tema.DRAMA);
			series.annadirSerie("Friends", 1990, Tema.DRAMA);
			series.annadirSerie("Dallas", 1970, Tema.INTRIGA);
			series.annadirTemporada("This is us", "Empezamos");
			series.annadirTemporada("This is us", "Seguimos");
			series.annadirTemporada("This is us", "Finalizamos");
			series.annadirCapituloTemporada("This is us", "Empezamos", "La familia");
			series.annadirCapituloTemporada("This is us", "Empezamos", "El problema");
			series.annadirCapituloTemporada("This is us", "Empezamos", "Los niños");
			series.annadirCapituloTemporada("This is us", "Empezamos", "CAsi el final");
			series.annadirCapituloTemporada("This is us", "Empezamos", "El final");
			
			
		} catch (SerieException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(series.listadoOrdenadoSeriesDeUnTema(Tema.DRAMA));
		} catch (SerieException e) {
			e.printStackTrace();
		}
		
		
		Temporada t = new Temporada("La casa de papel");
		t.annadirCapitulo("locos");
		t.annadirCapitulo("increiblementeMejorQueNunca");
		t.annadirCapitulo("delocos");
		t.annadirCapitulo("lomejordelocos");
		try {
			t.anadirCapituloDespues("lopeh", "locos");
		} catch (SerieException e) {
			e.printStackTrace();
		}
		Serie s = null;
		try {
			s = new Serie("Lupin", 2020, Tema.INTRIGA);
		} catch (SerieException e) {
			e.printStackTrace();
		}
		
		try {
			s.annadirTemporada("La primera");
			s.annadirTemporada("La tercera");
			s.annadirTemporada("La segunda");
			s.valorarTemporada("La primera", 4);
			s.valorarTemporada("La primera", 5);
			s.valorarTemporada("La tercera", 1);
			s.valorarTemporada("La primera", 6);
			s.valorarTemporada("La segunda", 7);
			s.annadirCapituloTemporada("La primera", "locos1");
			s.annadirCapituloTemporada("La primera", "locos2");
			s.annadirCapituloTemporada("La primera", "locos3");
			s.annadirCapituloTemporada("La primera", "locos4");
			s.annadirCapituloTemporada("La segunda", "locas5");
			s.annadirCapituloTemporada("La segunda", "locas6");
			s.annadirCapituloTemporada("La segunda", "locas7");

		} catch (SerieException e) {
			e.printStackTrace();
		}

		try {
			series.generarFicheroCsv();
			s.generarFicheroCsvTemporada();
			series.generarFicheroCsvCaptulos();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
