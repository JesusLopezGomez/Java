package sieteMedia.model;

import java.util.Objects;

public class Carta implements Comparable<Carta>{

	private int numero;
	private Palo palo;
	
	public Carta() {
	}

	public Carta(int numero,Palo palo) throws Exception {
		super();
		if(numero < 1 || numero > 12 || numero == 8 || numero == 9) {
			throw new Exception("Valor no válido, debe introducir un valor de 1 a 7 o de 10 a 12");
		}
		this.palo = palo;
		this.numero = numero;
	}
	
	public double getValor() {
		return this.numero > 9 ? 0.5: this.numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public Palo getPalo() {
		return this.palo;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(numero, palo);
	}

	@Override
	public boolean equals(Object obj) {
		boolean resultado = false;
		if (this == obj)
			 resultado = true;
		if (obj == null)
			 resultado = false;
		if (getClass() != obj.getClass())
			 resultado = false;
		Carta other = (Carta) obj;
		return resultado && numero == other.numero && palo == other.palo;
	}

	@Override
	public String toString() {
		return String.format("%s de %s", this.numero,this.palo.toString().toLowerCase());
	}

	@Override
	public int compareTo(Carta o) {
		return this.numero-o.numero;
	}
	
}
