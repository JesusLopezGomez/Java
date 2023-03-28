package mockExamAvanzadoCorregidoEnClase.usuario;

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
		return login;
	}
	
	public boolean setPass(String old, String newPass) {
		boolean cambiado = false;
		if(checkPass(old) && newPass != null && !newPass.isEmpty() && !newPass.equals(old)) {
			this.pass = newPass;
			cambiado = true;
		}
		
		return cambiado;
	}
	
	public boolean checkPass(String pass) {
		return pass != null && !pass.isEmpty() && pass.equals(this.pass);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(login, pass);
	}

	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = this == obj;

		if(!sonIguales && obj != null && obj instanceof Usuario) {
			Usuario other = (Usuario)obj;
			sonIguales = Objects.equals(login, other.login) && Objects.equals(pass, other.pass);
		}
		
		return sonIguales;
	}
	
	
	
	

}
