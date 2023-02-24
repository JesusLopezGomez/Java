package linea.model;

import java.util.Objects;

public class Punto {

	private double x;
	private double y;
	
	
	public Punto() {
	}


	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}


	public double getX() {
		return x;
	}


	public void setX(double x) {
		this.x = x;
	}


	public double getY() {
		return y;
	}


	public void setY(double y) {
		this.y = y;
	}
	
	public void sumar1PuntoX(double cantidad) {
		this.x += cantidad;
	}
	
	public void sumar1PuntoY(double cantidad) {
		this.y += cantidad;
	}
	
	public void restar1PuntoX(double cantidad) {
		this.x -= cantidad;
	}
	
	public void restar1PuntoY(double cantidad) {
		this.y -= cantidad;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

	@Override
	public boolean equals(Object obj) {
		boolean resultado = false;
		if (this == obj)
			resultado =  true;
		if (obj == null)
			resultado = false;
		if (getClass() != obj.getClass())
			resultado = false;
		Punto other = (Punto) obj;
		return resultado && Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
				&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
	}
	
	
	
	


}
