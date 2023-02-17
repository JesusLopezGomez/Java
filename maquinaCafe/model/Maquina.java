package maquinaCafe.model;

public class Maquina {

	private int depositoCafe = 0;
	private int depositoLeche = 0;
	private int depositoVaso = 0;
	private double monedero = 0;
	
	public Maquina() {
	}

	public Maquina(int depositoCafe, int depositoLeche, int depositoVaso, double monedero) {
		super();
		this.depositoCafe = depositoCafe;
		this.depositoLeche = depositoLeche;
		this.depositoVaso = depositoVaso;
		this.monedero = monedero;
	}

	public int getDepositoCafe() {
		return depositoCafe;
	}

	public void setDepositoCafe(int depositoCafe) {
		this.depositoCafe = depositoCafe;
	}

	public int getDepositoLeche() {
		return depositoLeche;
	}

	public void setDepositoLeche(int depositoLeche) {
		this.depositoLeche = depositoLeche;
	}

	public int getDepositoVaso() {
		return depositoVaso;
	}

	public void setDepositoVaso(int depositoVaso) {
		this.depositoVaso = depositoVaso;
	}

	public double getMonedero() {
		return monedero;
	}

	public void setMonedero(double monedero) {
		this.monedero = monedero;
	}
	
	public void llenarDepositos(int depositoCafe, int depositoLeche, int depositoVaso) {
		if(depositoCafe <= 50 && depositoLeche <= 50 && depositoVaso <= 80) {
			this.depositoCafe = depositoCafe;
			this.depositoLeche = depositoLeche;
			this.depositoVaso = depositoVaso;
		}
	}
	
	public void vaciarMonedero(){
		this.monedero = 0;
	}
	
	public String servirCafeSolo(double dinero) {
		String resultado = "";
		if(dinero > this.monedero) {
			resultado = "Error, no disponemos de cambio para esa cantidad.";
		}else if(dinero < 1) {
			resultado = "Error, la cantidad introducida es menor que el precio del café.";
		}else if(this.depositoCafe < 1) {
			resultado = "Error, nos hemos quedado sin café.";
		}else {
			this.depositoCafe --;
			this.depositoVaso --;
			this.monedero ++;
			if(dinero -1 == 0) {
				resultado = "Producto servido";
			}else {
				resultado = "Producto servido, aquí tiene su cambio de: " + (dinero-1);
			}
		}
		return resultado;
	}
	
	public String servirLeche(double dinero) {
		String resultado = "";
		if(dinero > this.monedero) {
			resultado = "Error, no disponemos de cambio para esa cantidad.";
		}else if(dinero < 0.8) {
			resultado = "Error, la cantidad introducida es menor que el precio del leche.";
		}else if(this.depositoLeche < 1) {
			resultado = "Error, nos hemos quedado sin leche.";
		}else {
			this.depositoLeche --;
			this.depositoVaso --;
			this.monedero += 0.8;
			if(dinero -0.8 == 0) {
				resultado = "Producto servido";
			}else {
				resultado = "Producto servido, aquí tiene su cambio de: " + (dinero-0.80);
			}
		}
		return resultado;
	}

	public String servirCafeConLeche(double dinero) {
		String resultado = "";
		if(dinero > this.monedero) {
			resultado = "Error, no disponemos de cambio para esa cantidad.";
		}else if(dinero < 1.5) {
			resultado = "Error, la cantidad introducida es menor que el precio del leche.";
		}else if(this.depositoLeche < 1) {
			resultado = "Error, nos hemos quedado sin leche.";
		}else if(this.depositoCafe < 1) {
			resultado = "Error, nos hemos quedado sin café.";
		}else {
			this.depositoLeche --;
			this.depositoVaso --;
			this.depositoCafe --;
			this.monedero += 1.5;
			if(dinero -1.5 == 0) {
				resultado = "Producto servido";
			}else {
				resultado = "Producto servido, aquí tiene su cambio de: " + (dinero-1.5);
			}
		}
		return resultado;
	}
	
	public String getEstado() {
		String resultado = "La máquina tiene: " + this.depositoVaso + " vasos, " + this.depositoCafe + " cafe, " + this.depositoLeche + " leche y " + this.monedero + " €";
		return resultado; 
	}
	
}
