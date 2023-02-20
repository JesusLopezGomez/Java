package calculos.model;

public class Complejo {

	private double real;
	private double imag;
	
	
	public Complejo() {
	}


	public Complejo(double real, double imag) {
		super();
		this.real = real;
		this.imag = imag;
	}


	public double getReal() {
		return real;
	}


	public void setReal(double real) {
		this.real = real;
	}


	public double getImag() {
		return imag;
	}


	public void setImag(double imag) {
		this.imag = imag;
	}
	
	public Complejo suma(Complejo com2) {
		double parteRealNueva = this.real + com2.real;
		double parteImagNueva = this.imag + com2.imag;
		return new Complejo(parteRealNueva,parteImagNueva);
	}
	
	public Complejo resta(Complejo com2) {
		double parteRealNueva = this.real - com2.real;
		double parteImagNueva = this.imag - com2.imag;
		return new Complejo(parteRealNueva,parteImagNueva);
	}


	@Override
	public String toString() {
		String resultado = "";
		if(imag >= 0) {
			resultado = real + " + " + imag + "i";
		}else {
			resultado = real + " - " + imag + "i";
		}
		return resultado;
	}
	
	public String mostrarInformacion() {
		String resultado = "";
		resultado = String.valueOf(this.real) + ", " + String.valueOf(this.imag);
		return resultado;
	}
	

}
