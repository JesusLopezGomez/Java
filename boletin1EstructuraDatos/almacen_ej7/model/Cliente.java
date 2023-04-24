package boletin1EstructuraDatos.almacen_ej7.model;

public class Cliente {

	private static int codigo = 1;
	private int codigoCliente;
	private int numeroDeCajaAsignada;
	
	public Cliente() {
		super();
		this.codigoCliente = codigo++;
	}
	
	public int getCodigo() {
		return this.codigoCliente;
	}
	
	public void setAsignarCaja(int numero) {
		this.numeroDeCajaAsignada = numero;
	}
	
	public int getCajaAsignada() {
		return this.numeroDeCajaAsignada;
	}

}
