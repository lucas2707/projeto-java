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
		retValue = "Informações sobre o usuário:" + ENTER + 
				super.toString() +
				"Login: " + login + ENTER +
				"Senha: "+ senha + ENTER + 
				"Tipo: " + tipo + ENTER;
		return retValue;
	}
	
	
	
	
}
