package model;

public abstract class Usuario {

	private String login;
	private String senha;
	private int tipo;

	public Usuario() {

	}

	public Usuario(String login2, String senha2, int tipo2) {

	}

	public String toString() {
		final String ENTER = "\n";
		String retValue = "";
		retValue = "Informa��es sobre o usu�rio:" + ENTER + 
				super.toString() +
				"Login: " + login + ENTER +
				"Senha: "+ senha + ENTER + 
				"Tipo: " + tipo + ENTER;
		return retValue;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	
	
}
