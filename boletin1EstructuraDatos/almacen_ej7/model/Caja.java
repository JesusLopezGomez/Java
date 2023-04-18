package boletin1EstructuraDatos.almacen_ej7.model;

import java.util.ArrayList;
import java.util.List;

public class Caja {

	private static int codigo = 0;
	private int numeroCaja;
	private boolean estado;
	private List<Cliente> listaClientes;
	
	public Caja() {
		super();
		this.numeroCaja = codigo ++;
		this.estado = false;
		this.listaClientes = new ArrayList<>();
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
	public int getNumeroCaja() {
		return this.numeroCaja;
	}
	
	public void asignarCliente(Cliente c) {
		this.listaClientes.add(c);
	}
	
	public int getClientesEnCaja() {
		return this.listaClientes.size();
	}
	
	public void abrirCaja() throws AlmacenExceptions {
		if(this.estado) {
			throw new AlmacenExceptions("Error, esta caja está abierta.");
		}
		this.estado = true;
	}
	
	public String atenderCliente() throws AlmacenExceptions {
		String resultado = "";
		if(!getEstado() || this.listaClientes.isEmpty()) {
			throw new AlmacenExceptions("Error no hay clientes en la caja o la caja está cerrada.");
		}
		resultado = String.format("Se ha atentido al cliente con número %s", this.listaClientes.get(0).getCodigo());
		
		this.listaClientes.remove(this.listaClientes.get(0));
		return resultado;
	}
	
	public void cerrarCaja() throws AlmacenExceptions {
		if(!this.estado || this.listaClientes.size() > 0) {
			throw new AlmacenExceptions("Error la caja está cerrada o tiene clientes pendientes");
		}
		this.estado = false;
	}

}
