package coleccionesInicio;

public class entradaRegistro<K,V> {

	private K id;
	private V valor;
	
	public entradaRegistro(K id, V valor) {
		super();
		this.id = id;
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return String.format("Entrada con clave %s y con valor %s", this.id,this.valor);
	}
	

}
