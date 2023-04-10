package cuentaCorriente.model;

public class Cuenta {

	private int banco;
	private int numReintegros = 0;
	private int numIngresos = 0;
	
	
	public Cuenta( int banco, int numIngresos, int numReintegros) {
		super();
		this.banco = banco;
		this.numIngresos = numIngresos;
		this.numReintegros = numReintegros;
	}

	public Cuenta() {}

	public int getBanco() {
		return banco;
	}

	public void setBanco(int banco) {
		this.banco = banco;
	}
	
	public int getNumReintegros() {
		return numReintegros;
	}

	public void setNumReintegros(int numReintegros) {
		this.numReintegros = numReintegros;
	}

	public int getNumIngresos() {
		return numIngresos;
	}

	public void setNumIngresos(int numIngresos) {
		this.numIngresos = numIngresos;
	}

	public void realizarReintegro(int cantidadRetirar) {
		if(cantidadRetirar <= this.banco && cantidadRetirar > 0) {
			this.banco -= cantidadRetirar;
			this.numReintegros ++;
		}
	}
	
	public void realizarIngreso(int cantidadIngresar) {
		if(cantidadIngresar > 0) {
			this.banco += cantidadIngresar;
			this.numIngresos ++;
		}
	}
	

}
