package model;

public class Funcionario extends Usuario {

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
		
		retValue = "Informar��es sobre o funcion�rio: " + ENTER + 
		super.toString()+
		"Matr�cula: " + matricula + ENTER;		
		return retValue;
		}
	}

