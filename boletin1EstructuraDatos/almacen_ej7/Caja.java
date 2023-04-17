package boletin1EstructuraDatos.almacen_ej7;

public class Caja {

	private static int codigo = 0;
	private int numeroCaja;
	private boolean estado;
	
	
	public Caja(boolean estadoCaja) {
		super();
		this.numeroCaja = codigo ++;
		
	}

}
