package practicaChatGpt.model;

public class ProductoElectronico {

	protected double precio;
	protected String marca;
	protected String modelo;
	
	public ProductoElectronico() {
	}

	public ProductoElectronico(double precio, String marca, String modelo) {
		super();
		this.precio = precio;
		this.marca = marca;
		this.modelo = modelo;
	}

	public String vender() {
		return "Se ha vendido el producto.";
	}

	
	public String getMarca() {
		return marca;
	}

	public void setPrecio(double precio) {
		if(precio > 0) {
			this.precio = precio;
		}
	}

	@Override
	public String toString() {
		return "Producto de la marca " + marca + " y modelo " + modelo + " con precio de " + precio;
	}
	
	
}
