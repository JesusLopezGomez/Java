package practicaChatGpt.model;

public class Moto extends Vehiculo {

	private String tipoConduccion;
	
	public Moto(int numRueda, int numPlaza, String tipoConduccion) {
		super(numRueda, numPlaza);
		this.tipoConduccion = tipoConduccion;
	}
	
	public String toString() {
		return "Vehiculo con " + numPlaza + " plazas, " + numRueda + " ruedas y " + "tipo de conducción " + tipoConduccion;
	}

}
