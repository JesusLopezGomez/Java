package geometria.model;

public class Rectangulo {

	private int longitud = 1;
	private int ancho = 1;
	
	public Rectangulo(int longitud, int ancho) {
		super();
		this.longitud = longitud;
		this.ancho = ancho;
	}

	public Rectangulo() {
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		if(longitud > 0 && longitud <= 20) {
			this.longitud = longitud;
		}
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		if(ancho > 0 && ancho <= 20) {
			this.ancho = ancho;
		}
	}
	
	public int calcularPerimetro() {
		return  2* (this.ancho + this.longitud);
	}
	
	public int calcularArea() {
		return (this.ancho* this.longitud);
	}

}
