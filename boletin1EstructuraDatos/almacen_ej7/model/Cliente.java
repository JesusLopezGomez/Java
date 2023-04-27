package boletin1EstructuraDatos.almacen_ej7.model;

public class Cliente {

	private static int codigo = 1;
	private int codigoCliente;
	
	public Cliente() {
		super();
		this.codigoCliente = codigo++;
	}
	
	public int getCodigo() {
		return this.codigoCliente;
	}
	
	


}
