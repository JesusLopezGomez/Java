package mockExamAvanzado.model;

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
	
	public boolean setPass(String Oldpass, String newPass) {
		if(this.pass.equals(Oldpass)) {
			this.pass = newPass;
		}
		return this.pass.equals(Oldpass);
	}
	
	public boolean checkPass(String pass) {
		return this.pass.equals(pass);
	}


	@Override
	public int hashCode() {
		return Objects.hash(login, pass);
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
