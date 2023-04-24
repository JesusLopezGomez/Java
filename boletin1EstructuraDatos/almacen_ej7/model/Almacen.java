package boletin1EstructuraDatos.almacen_ej7.model;

import java.util.ArrayList;
import java.util.List;

public class Almacen {

	private List<Caja> listaCajas;
	
	public Almacen() {
		super();
		this.listaCajas = new ArrayList<>();
		for(int i = 0; i < 21; i++) {
			this.listaCajas.add(new Caja());
		}
	}
	
	public void abrirCaja(int numeroCaja) throws AlmacenExceptions {
		for(Caja c : this.listaCajas) {
			if(c.getNumeroCaja() == numeroCaja) {
				c.abrirCaja();
			}
		}
	}
	
	public void cerrarCaja(int numeroCaja) throws AlmacenExceptions {
		for(Caja c : this.listaCajas) {
			if(c.getNumeroCaja() == numeroCaja) {
				c.cerrarCaja();
			}
		}
	}
	
	public String nuevoCliente() {
		Cliente c = new Cliente();
		Caja cajaMenor = new Caja();
		for(Caja c1: this.listaCajas) {
			if(c1.getEstado() && c1.getClientesEnCaja() < cajaMenor.getClientesEnCaja()) {
				cajaMenor = c1;
			}else if(c1.getEstado() && c1.getNumeroCaja() < cajaMenor.getNumeroCaja()) {
				cajaMenor = c1;
			}
		}
		c.setAsignarCaja(cajaMenor.getNumeroCaja());
		cajaMenor.asignarCliente(c);
		return String.format("Es usted el cliente número %s, y de debe ir a la"
							+ "	caja número %s", c.getCodigo(),cajaMenor.getNumeroCaja());
	}
	
	public String atenderCliente(int numeroCaja) throws AlmacenExceptions {
		String resultado = "";
		for(Caja c : this.listaCajas) {
			if(c.getNumeroCaja() == numeroCaja) {
				if(c.getEstado() && c.getClientesEnCaja() > 0) {
					resultado = c.atenderCliente();
				}else {
					throw new AlmacenExceptions("Error no hay clientes en la caja, o caja está cerrada.") ;
				}
			}
		}
		return resultado;
			
	}
	
	
	

}
