package geometria.model;

public class Cuenta {

	private int retirar;
	private int ingresar;
	private int banco;
	private int numReintegros = 0;
	private int numIngresos = 0;
	
	
	public Cuenta(int retirar, int ingresar, int banco, int numIngresos, int numReintegros) {
		super();
		this.retirar = retirar;
		this.ingresar = ingresar;
		this.banco = banco;
		this.numIngresos = numIngresos;
		this.numReintegros = numReintegros;
	}

	public Cuenta() {}

	public int getRetirar() {
		return retirar;
	}

	public void setRetirar(int retirar) {
		this.retirar = retirar;
	}

	public int getIngresar() {
		return ingresar;
	}

	public void setIngresar(int ingresar) {
		this.ingresar = ingresar;
	}

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
