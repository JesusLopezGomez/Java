package mockExamAvanzado2.model;

import java.util.Objects;

public class Usuario {

	private String login;
	private String pass;
	
	
	public Usuario(String login, String pass) {
		super();
		this.login = login;
		this.pass = pass;
	}
	
	
	public String getLogin() {
		return this.login;
	}
	
	public boolean setPass(String oldPass,String newPass) {
		boolean resultado = false;
		if(this.pass.equals(oldPass)) {
			this.pass = newPass;
			resultado = true;
		}
		return resultado;
	}
	
	public boolean checkPass(String pass) {
		return this.pass.equals(pass);
	}


	@Override
	public int hashCode() {
		return Objects.hash(login);
	}


	@Override
	public boolean equals(Object obj) {
		boolean resultado = false;
		if (this == obj)
			resultado = true;
		if (obj == null)
			resultado = false;
		if (getClass() != obj.getClass())
			resultado = false;
		Usuario other = (Usuario) obj;
		return resultado && Objects.equals(login, other.login);
	}
	
	

}
