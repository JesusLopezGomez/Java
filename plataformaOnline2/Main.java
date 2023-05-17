package plataformaOnline2;

import java.io.FileNotFoundException;
import java.io.IOException;

import plataformaOnline2.model.Catologo;
import plataformaOnline2.model.Serie;
import plataformaOnline2.model.SerieException;
import plataformaOnline2.model.Tema;

public class Main {

	public static void main(String[] args) {
		Catologo series = new Catologo();
//		try {
//			series.annadirSerie("Friends", 1990, Tema.DRAMA);
//			series.annadirSerie("This is us", 2015, Tema.DRAMA);
//			series.annadirSerie("Loco", 1970, Tema.DRAMA);
//			series.annadirTemporada("This is us", "Empezamos");
//			series.annadirTemporada("This is us", "Seguimos");
//			series.annadirTemporada("This is us", "Finalizamos");
//			series.annadirCapituloTemporada("This is us", "Empezamos", "La familia");
//			series.annadirCapituloTemporada("This is us", "Empezamos", "El problema");
//			series.annadirCapituloTemporada("This is us", "Empezamos", "Los niños");
//			series.annadirCapituloTemporada("This is us", "Empezamos", "CAsi el final");
//			series.annadirCapituloTemporada("This is us", "Empezamos", "El final");
//			
//			series.generarCsvSerie("./files/series2.csv");
//			series.generarCsvCapitulos("./files/capitulos2.csv");
//			series.generarXML("./files/catalogo2.xml");
//			series.generarJson("./files/catalogoCsv.json");
//		} catch (SerieException | IOException e) {
//			e.printStackTrace();
//		}
		series.cargarCsvSerie();
		
		Serie e;
		
		try {
			e = new Serie("Locotron", 2003, Tema.CIENCIAFICCION);
			e.annadirTemporada("locotrones");
			e.annadirCapituloTemporada("locotrones", "1");
			e.annadirCapituloTemporada("locotrones", "2");
			e.annadirCapituloTemporada("locotrones", "3");
			e.generarCsvTemporada("./files/temporada2.csv");
		} catch (SerieException | FileNotFoundException e1) {
			e1.printStackTrace();
		}

		
	}

}
