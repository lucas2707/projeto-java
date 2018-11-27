package controller;

import model.Usuario;
import util.Teclado;

public class InfoNote {

	Usuario user;

	boolean logado = false;

	public void mostrarMenu() {
		System.out.println("--------------------------------");
		System.out.println("    InfoNote - Se não é Info não vendemos.   ");
		System.out.println("--------------------------------");
		System.out.println("1 - Login");
		System.out.println("2 - Cadastrar Cliente");
		System.out.println("3 - Buscar Notebook");
		System.out.println("4 - Inserir Notebook no carrinho");
		System.out.println("5 - Remover Notebook no carrinho");
		System.out.println("6 - Ver Carrinho");
		System.out.println("7 - Efetuar Compra");
		System.out.println("8 - Sair");

	}

	public void efetuarLogin() {
		String login, senha;
		login = Teclado.lertexto("Digite o login: ");
		senha = Teclado.lertexto("Digite o senha: ");

		if (login.equals("admin") && senha.equals("1234")) {
			System.out.println("Login efetuado com sucesso.");
			logado = true;

		} else {
			System.out.println("Login ou Senha inválido.");
			efetuarLogin();

		}
	}
	
	public void cadastrarUsuario() {
		System.out.println("--------------------");
		System.out.println("   InfoNote - Cadastro de usuários.  ");
		System.out.println("--------------------");
		
		int matricula = Teclado.lerInt("Matrícula: ");
		String login = Teclado.lertexto("Login: ");
		String senha = Teclado.lertexto("Senha: ");
		String nome = Teclado.lertexto("Nome: ");
		String email = Teclado.lertexto("E-mail: ");
		String telefone = Teclado.lertexto("Telefone: ");
		
		user = new Usuario (matricula, login, senha, nome, email, telefone);
		System.out.println("----------------------");
		System.out.println("   Usuário Cadastrado Com Sucesso.    ");
		System.out.println("----------------------");
		System.out.println(user);
		
	}
}
