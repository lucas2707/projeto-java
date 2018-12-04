package controller;

import model.ItemDePedido;
import model.Notebook;
import model.Pedido;
import util.Teclado;
import model.Endereco;
import model.Cliente;

public class InfoNote {

	Notebook notebooks[] = new Notebook[10];
	Pedido pedido;

	boolean logado = false;

	public InfoNote() {
		notebooks[0] = new Notebook("Negativo N22BR", "CPU Intel Core 2 Duo, Memória 2 GB, HD 250 GB",
				"img\\n22br.jjpg", "19/05/2011", "1", 6, 1200.00);

		notebooks[1] = new Notebook("Bell B55BR", "CPU Intel I3, Memória 4 GB, HD 500 GB", "img\\b55br.jpg",
				"20/05/2011", "2", 3, 1800.00);

		notebooks[2] = new Notebook("Pompaq P41BR", "CPU Intel I3, Memória 3 GB, HD 320 GB", "img\\p41br.jpg",
				"21/05/2011", "3", 1, 1600.00);

		notebooks[3] = new Notebook("CCF CR71CH", "CPU Intel Dual Core, Memória 2 GB, HD 160 GB", "img\\cr71ch.jpg",
				"10/06/2011", "4", 5, 1100.00);

		notebooks[4] = new Notebook("BradescoTech BD22BR", "CPU AMD Phenon II, Memória 4 GB, HD 500 GB",
				"img\\bd22br.jpg", "10/06/2011", "5", 2, 1900.00);
	}

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

		String login = Teclado.lertexto("Login: ");
		String senha = Teclado.lertexto("Senha: ");
		int tipo = 1;
		String codigoCliente = Teclado.lertexto("Código do cliente: ");
		String nome = Teclado.lertexto("Login: ");
		String email = Teclado.lertexto("E-mail: ");
		String telefone = Teclado.lertexto("Telefone: ");

		String logradouro = Teclado.lertexto("Logradouro: ");
		String numero = Teclado.lertexto("Número: ");
		String complemento = Teclado.lertexto("Complemento: ");
		String bairro = Teclado.lertexto("Bairro: ");
		String cidade = Teclado.lertexto("Cidade: ");
		String estado = Teclado.lertexto("Estado: ");
		String cep = Teclado.lertexto("CEP: ");
		Endereco endereco = new Endereco(logradouro, numero, complemento, bairro, cidade, estado, cep);
		Cliente cli = new Cliente(login, senha, tipo, codigoCliente, nome, email, telefone, endereco);

		System.out.println("--------------------");
		System.out.println(" Usuário cadastrado com sucesso ");
		System.out.println("--------------------");
		System.out.println(cli);
		System.out.println(endereco);
	}

	public void buscarNotebook() {
		System.out.println("buscarNotebook - Em Construção");

		for (int i = 0; i < notebooks.length; i++) {
			if (notebooks[i] != null) {
				System.out.println(notebooks[i].getSerialNote() + "-----" + notebooks[i].getModelo());
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

	public static void main(String[] args) {
		InfoNote info = new InfoNote();

		int opcao = 8;

		{

			do {
				info.mostrarMenu();
				opcao = Teclado.lerInt("Digite sua opção: ");

				switch (opcao) {

				case 1:
					info.efetuarLogin();
					break;

				case 2:
					info.cadastrarUsuario();
					break;

				case 3:
					info.buscarNotebook();
					break;

				case 4:
					info.manterCarrinho();
					break;

				case 5:
					info.manterCarrinho();
					break;

				case 6:
					info.manterCarrinho();
					break;

				case 7:
					if (!info.logado) {
						System.out.println("Efetue login para efetuar compra.");
						break;

					} else {

						info.efetuarCompra();
						break;
					}

				case 8:
					System.out.println("Saída do Sistema.");
					break;

				default:
					System.out.println("Opção inválida!");
				}
			} while (opcao != 8);
			Teclado.lertexto("Pressione uma tecla para continuar...");

		}
	}
}