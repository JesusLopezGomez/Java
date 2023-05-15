package casetasFeria.model;

import java.util.Objects;

public class Caseta {

	private String titulo;
	private String calle;
	private String numero;
	private String modulo;
	private String clase;
	private String id;
	private String id_calle;
	
	
	public Caseta(String titulo, String calle, String numero, String modulo, String clase, String id, String id_calle) {
		super();
		this.titulo = titulo;
		this.calle = calle;
		this.numero = numero;
		this.modulo = modulo;
		this.clase = clase;
		this.id = id;
		this.id_calle = id_calle;
	}

	public String getTitulo() {
		return titulo;
	}


	public String getCalle() {
		return calle;
	}


	public String getNumero() {
		return numero;
	}


	public String getModulo() {
		return modulo;
	}


	public String getClase() {
		return clase;
	}


	public String getId() {
		return id;
	}


	public String getId_calle() {
		return id_calle;
	}

	public void restarNumero(int numero) throws Exception {
		if((Integer.valueOf(this.numero)-numero) < 0 ) {
			throw new Exception("El número es menor de 0");
		}
		
		this.numero = String.valueOf(Integer.valueOf(numero)-numero);
	}

	@Override
	public int hashCode() {
		return Objects.hash(calle, clase, id, id_calle, modulo, numero, titulo);
	}


	@Override
    public boolean equals(Object obj) {
        return this==obj || obj!=null &&
                obj instanceof Caseta
                && this.hashCode()==((Caseta)obj).hashCode();
    }


	@Override
	public String toString() {
		return String.format("Caseta: %s, en calle: %s, número: %s, modulo: %s, clase: %s, id: %s, id calle: %s", 
				this.titulo,this.calle,this.numero,this.modulo,this.clase,this.id,this.id_calle);
	}
	
	
	
	
	
}
