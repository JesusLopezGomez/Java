package linea.model;

import java.util.Objects;

public class Linea {
	
	Punto puntoA;
	Punto puntoB;
		
	Punto p = new Punto();
	
	public Linea() {
		this.puntoA = new Punto(0,0);
		this.puntoB = new Punto(0,0);
	}
	
	
	public Linea(Punto puntoA, Punto puntoB) {
		super();
		this.puntoA = puntoA;
		this.puntoB = puntoB;
	}


	public Punto getPuntoA() {
		return puntoA;
	}


	public void setPuntoA(Punto puntoA) {
		this.puntoA = puntoA;
	}


	public Punto getPuntoB() {
		return puntoB;
	}


	public void setPuntoB(Punto puntoB) {
		this.puntoB = puntoB;
	}

	public boolean equals(Object obj) {
		boolean resultado = true;
		if (this == obj)
			resultado = true;
		if (obj == null)
			resultado = false;
		if (getClass() != obj.getClass())
			resultado = false;
		Linea other = (Linea) obj;
		return resultado && Objects.equals(puntoA, other.puntoA) && Objects.equals(puntoB, other.puntoB);
	}
	
	public void moverDerecha(double cantidad) {
		this.puntoA.sumar1PuntoX(cantidad);
		this.puntoB.sumar1PuntoY(cantidad);		
	}
	
	public void moverIzquierda(double cantidad) {
		this.puntoA.restar1PuntoX(cantidad);
		this.puntoB.restar1PuntoY(cantidad);	
	}
	
	public void moverArriba(double cantidad) {
		this.puntoA.sumar1PuntoY(cantidad);
		this.puntoB.sumar1PuntoY(cantidad);
	}
	
	public void moverAbajo(double cantidad) {
		this.puntoA.restar1PuntoY(cantidad);
		this.puntoB.restar1PuntoY(cantidad);
	}


	@Override
	public String toString() {
		return "Linea [puntoA=" + puntoA + ", puntoB=" + puntoB + "]";
	}
	

}
