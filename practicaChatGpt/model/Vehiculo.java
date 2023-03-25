package practicaChatGpt.model;

public class Vehiculo {

	protected int numRueda;
	protected int numPlaza;
	
	public Vehiculo() {
	
	}

	public Vehiculo(int numRueda, int numPlaza) {
		super();
		this.numRueda = numRueda;
		this.numPlaza = numPlaza;
	}

	public int getNumRueda() {
		return numRueda;
	}

	public void setNumRueda(int numRueda) {
		this.numRueda = numRueda;
	}

	public int getNumPlaza() {
		return numPlaza;
	}

	public void setNumPlaza(int numPlaza) {
		this.numPlaza = numPlaza;
	}
	
	public String arrancar() {
		return "El vehiculo se ha arrancado";
	}
	
	public String parar() {
		return "El vehiculo se ha pararado";
	}

	@Override
	public String toString() {
		return "Vehiculo con " + numPlaza + " plazas, " + numRueda + " ruedas.";
	}
	
	

	
}
