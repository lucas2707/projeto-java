package model;

import model.DAO.FuncionarioDAO;

public class Funcionario extends Usuario implements IUsuario {

	private String matricula;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public Funcionario() {
	super();
	}
	
	public Funcionario(String login, String senha, int tipo, String matricula) {
	super(login, senha, tipo);
		this.matricula = matricula;
	}
	
	public String toString () {
		final String ENTER = "\n";
		String retValue = "";
		
		retValue = "Informarções sobre o funcionário: " + ENTER + 
		super.toString()+
		"Matrícula: " + matricula + ENTER;		
		return retValue;
		}

	@Override
	public boolean validarLogin (String login, String senha){
	Funcionario funcionario = FuncionarioDAO.buscarPorLoginSenha(login, senha);
	if(funcionario != null){
	return true;
	}
	return false;
	}
}


