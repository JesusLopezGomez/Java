package practicaChatGpt.model;

public class Coche extends Vehiculo {
	
	private String tipoCombustible;
	
	public Coche(int numRueda, int numPlaza,String tipoCombustible) {
		super(numRueda, numPlaza);
		this.tipoCombustible = tipoCombustible;
	}

	public String toString() {
		return "Vehiculo con " + numPlaza + " plazas, " + numRueda + " ruedas y " + "tipo de combustible " + tipoCombustible;
	}
}
