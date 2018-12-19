package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import model.*;
import model.DAO.ClienteDAO;
import model.DAO.EnderecoDAO;
import model.DAO.FuncionarioDAO;
import model.DAO.NotebookDAO;
import model.DAO.UsuarioDAO;
import util.*;

public class InfoNote {

	private static Cliente clienteGlobal = null;
	private static Funcionario funcionarioGlobal = null;
	


	
	Usuario usuario;
	Cliente cliente;
	Notebook notebooks[] = new Notebook[10];
	Pedido pedido;
	boolean logado = false;
	Configurador config;
	Ajuda ajuda;

	public InfoNote() {

		config = new Configurador();
		Locale.setDefault(new Locale(config.getIdioma(), config.getRegiao()));
		ajuda = new Ajuda(config.getArquivoAjuda());
	}

	private static final int LOGIN = 1;
	private static final int CADASTRAR_USUARIO = 2;
	private static final int BUSCAR_NOTEBOOK = 3;
	private static final int INSERIR_NOTEBOOK = 4;
	private static final int REMOVER_NOTEBOOK = 5;
	private static final int VER_CARRINHO = 6;
	private static final int EFETUAR_COMPRA = 7;
	private static final int AJUDA = 8;
	private static final int AREA_ADMINISTRATIVA = 9;
	private static final int SAIR = 10;

	public static boolean isNumeric(String str) 
	{
		try
		{
		@SuppressWarnings("unused")
		int i = Integer.parseInt(str); 
		}
		catch(NumberFormatException nfe)
		{
		return false;
		}
		return true;
	}
		
	public void mostrarMenu() {
		System.out.println("--------------------------------");
		System.out.println("    InfoNote - Se não é Info não vendemos.   " +

				DateFormat.getDateInstance(DateFormat.SHORT).format(new Date()) + " "
				+ DateFormat.getTimeInstance().format(new Date()));

		if (logado == true) {
			System.out.println("Seja bem vindo, " + clienteGlobal.getNomeInvertido());
		}
		System.out.println("==================================================");

		System.out.println("--------------------------------");
		System.out.println("1 - Login");
		System.out.println("2 - Cadastrar Cliente");
		System.out.println("3 - Buscar notebook");
		System.out.println("4 - Inserir Notebook no carrinho");
		System.out.println("5 - Remover Notebook no carrinho");
		System.out.println("6 - ver Carrinho");
		System.out.println("7 - Efetuar Compra");
		System.out.println("8 - Ajuda");
		System.out.println("9 - Área Administrativa");
		System.out.println("10 - Sair");
	}

	public void efetuarLogin() {

		String login, senha;
		login = Teclado.lertexto("Digite o login: ");
		senha = Teclado.lertexto("Digite a senha: ");

		cliente = ClienteDAO.buscarPorLoginSenha(login, senha);
		
		if (cliente != null) {
			
		logado = cliente.validarLogin(login, senha);
		
		}else{
			
		if (logado) {
		System.out.println("Login efetuado com sucesso!");
		
		} else {
			
		System.out.println("Usuário ou senha inválido.");
		int opcao2 = 3;
		
		do {
		System.out.println("Digite:");
		System.out.println("1 - Para efetuar Login");
		System.out.println("2 - Para cadastrar-se");
		System.out.println("3 - Para sair do sistema");
		opcao2 = Teclado.lerInt("");
		
		switch (opcao2) {
		
		case 1:
		efetuarLogin();
		break;
		
		case 2:
		cadastrarUsuario();
		break;
		
		case 3:
		System.out.println("Obrigado e volte sempre!");
		break;
		default:
		System.out.println("Opção inválida");
	}
	     } while (!logado);
		}
	  }
	}

	public void efetuarLoginAdm() {
		String login, senha;
		login = Teclado.lertexto("Digite o login: ");
		senha = Teclado.lertexto("Digite a senha: ");
		Funcionario funcionario = FuncionarioDAO.buscarPorLoginSenha(login, senha);
		if (funcionario != null) {
		logado = funcionario.validarLogin(login, senha);
		}else{
		if (logado) {
		System.out.println("Login efetuado com sucesso!");
		} else {
		System.out.println("Usuário ou senha inválido.");
		}
		}
		}
	
	public void cadastrarUsuario() {
		System.out.println("--------------------");
		System.out.println("   InfoNote - Cadastro de usuários.  ");
		System.out.println("--------------------");

		String login = Teclado.lertexto("Login: ");
		String senha = Teclado.lertexto("Senha: ");
		int tipo = 0;
		
		if (senha.equals("") || senha == null) {
			senha = GerarSenha.gerarSenha();
			System.out.println("Senha gerada: " + senha);
		}

		String codigoCliente = Teclado.lertexto("Código do cliente: ");
		String nome = Teclado.lertexto("Nome: ");
		String email = Teclado.lertexto("E-mail: ");
		String telefone = Teclado.lertexto("Telefone: ");

		String logradouro = Teclado.lertexto("Logradouro: ");
		String numero = Teclado.lertexto("Número: ");
		String complemento = Teclado.lertexto("Complemento: ");
		String bairro = Teclado.lertexto("Bairro: ");
		String cidade = Teclado.lertexto("Cidade: ");
		String estado = Teclado.lertexto("Estado: ");
		String cep = Teclado.lertexto("CEP: ");

		usuario = UsuarioDAO.inserir(login, senha, tipo);
		cliente = ClienteDAO.inserir(login, senha, tipo, codigoCliente, nome,
		email,telefone);
		Endereco endereco = EnderecoDAO.inserir(logradouro, numero, complemento,
		bairro, cidade, estado, cep, codigoCliente);
		
		clienteGlobal = cliente;

		System.out.println("--------------------");
		System.out.println(" Usuário cadastrado com sucesso ");
		System.out.println("--------------------");
		System.out.println(cliente);
		System.out.println(endereco);
	}

	
	public void cadastrarNotebook() {
		System.out.println("--------------------");
		System.out.println("   InfoNote - Cadastro de notebooks.  ");
		System.out.println("--------------------");

		String modelo = Teclado.lertexto("Modelo: ");
		String descricao = Teclado.lertexto("Descrição: ");
		 
		String dataCadastro = Teclado.lertexto("Data de cadastro: ");
		String figura = Teclado.lertexto("figura: ");
		int estoque = Teclado.lerInt("Estoque: ");
		double precoUnitario = Teclado.lerDouble("Preço unitário: ");
		String serialNote = Teclado.lertexto("Serial note: ");
	
		Notebook notebook = NotebookDAO.inserir(modelo,  descricao, dataCadastro,
				figura,  estoque, precoUnitario, serialNote);
		
		System.out.println("--------------------");
		System.out.println(" Notebook cadastrado com sucesso ");
		System.out.println("--------------------");
		System.out.println(notebook);
		
	}
			
	public void buscarNotebook() {
		System.out.println("buscarNotebook - Em Construção");

		for (int i = 0; i < notebooks.length; i++) {
			if (notebooks[i] != null) {
				System.out.println(notebooks[i].getSerialNote() + "-----" + notebooks[i].getModelo());
			}
		}
	}
	
		public void buscarNotebooks() {
			System.out.println("buscarNotebooks - Em Construção");

			for (int i = 0; i < notebooks.length; i++) {
				if (notebooks[i] != null) {
					
					System.out.println(
					notebooks[i].getSerialNote() + "-----" + 
					notebooks[i].getModelo() + "-----" + 
					notebooks[i].getDescricao() + "-----" + 
					notebooks[i].getFigura() + "-----" + 
					notebooks[i].getEstoque() + "-----" + 
					notebooks[i].getPrecoUnitario() + "-----" + 
					notebooks[i].getDataCadastro());
				}
			}
	    }

	public void manterCarrinho() {
		System.out.println("manterCarrinho - Em Construção");
	}

	public void inserirNotebook() {

		String serialNote = Teclado.lertexto("Informe o número do notebook" + " para compra: ");

		if (pedido == null) {
			pedido = new Pedido();
		}

		Notebook aux = null;
		for (int i = 0; i < notebooks.length; i++) {
			if (notebooks[i] != null && serialNote.equals(notebooks[i].getSerialNote())) {
				aux = notebooks[i];
			}
		}

		if (aux == null) {
			return;
		}

		ItemDePedido item = new ItemDePedido(1, aux.getPrecoUnitario(), aux);

		pedido.inserirItem(item);
	}

	public void efetuarCompra() {
		System.out.println("efetuarCompra - Em Construção");
	}

	public void ajuda() {
		System.out.println(ajuda.getTexto());
	}
	
	public void areaAdministrativa(){
		InfoNote info = new InfoNote();
		efetuarLoginAdm();
		System.out.println("Opções Administrativas\n");
		System.out.println("1 - Cadastrar Notebook");
		System.out.println("2 - Mostrar Notebooks");
		System.out.println("3 - Editar Notebook");
		System.out.println("4 - Excluir Notebook");
		System.out.println("5 - Sair");
		int opcao = 5;
		do {
		opcao = Teclado.lerInt("Digite sua opção: ");
		switch (opcao) {
		case 1:
		info.cadastrarNotebook();
		break;
		case 2:
		info.mostrarNotebooks();
		break;
		case 3:
		info.editarNotebook();
		break;
		case 4:
		info.excluirNotebook();
		break;
		case 5:
		System.out.println("Saída do Sistema");
		break;
		default:
		System.out.println("Opção inválida!");
		}
		Teclado.lertexto("Pressione uma tecla para continuar...");
		} while (opcao != 5);
		}
	
	
	public static void main(String[] args) {
		InfoNote info = new InfoNote();

		int opcao = SAIR;

		{

			do {
				info.mostrarMenu();
				opcao = Teclado.lerInt("Digite sua opção: ");
				switch (opcao) {
				case LOGIN:
					info.efetuarLogin();
					break;
				case CADASTRAR_USUARIO:
					info.cadastrarUsuario();
					break;
				case BUSCAR_NOTEBOOK:
					info.buscarNotebook();
					break;
				case INSERIR_NOTEBOOK:
					info.manterCarrinho();
					break;
				case REMOVER_NOTEBOOK:
					info.manterCarrinho();
					break;
				case VER_CARRINHO:
					info.manterCarrinho();
					break;
				case EFETUAR_COMPRA:

					if (!info.logado) {
						System.out.println("Efetue login para efetuar compra.");
						break;

					} else {
						info.efetuarCompra();
						break;
					}
				case AJUDA:
					info.ajuda();
					break;
					
				case AREA_ADMINISTRATIVA:
					info.areaAdministrativa();
					break;
					
				case SAIR:
					System.out.println("Saída do Sistema");
					break;
				default:
					System.out.println("Opção inválida!");
				}
				Teclado.lertexto("Pressione uma tecla para continuar...");
			} while (opcao != SAIR);
		}
	}
}