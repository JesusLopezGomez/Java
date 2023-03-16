package clasesAbstractas.model;

public class Triangulo extends Figura {

	private double lado1;
	private double lado2;
	private double lado3;

	
	
	public Triangulo(double lado1,double lado2,double lado3) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;

	}

	@Override
	public double calcularArea() {
		double semiperimetro = (lado1+lado2+lado3)/2;
		return Math.sqrt(((semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3))*semiperimetro);
	}

	@Override
	public double calcularPerimetro() {
		return lado1+lado2+lado3;
	}

}
