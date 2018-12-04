package model;

public class Cliente extends Usuario {

	private String codigoCliente;
	private String nome;
	private String email;
	private String telefone;
	private Endereco endereco;
	private Pedido pedido;

	private Endereco enderecos[] = new Endereco[10];
	private Pedido pedidos[] = new Pedido[10];

	public boolean inserirPedido(Pedido pedido) {
		for (int i = 0; i < pedidos.length; i++) {
			if (pedidos[i] == null) {
				pedidos[i] = pedido;
				return true;
			}
		}
		return false;
	}

	public boolean inserirEndereco(Endereco end) {
		for (int i = 0; i < enderecos.length; i++) {
			if (enderecos[i] == null) {
				enderecos[i] = end;
				return true;
			}
		}
		return false;
	}

	public String getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Endereco[] getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(Endereco[] enderecos) {
		this.enderecos = enderecos;
	}

	public Pedido[] getPedidos() {
		return pedidos;
	}

	public void setPedidos(Pedido[] pedidos) {
		this.pedidos = pedidos;
	}

	public Cliente() {
		super();
	}

	public Cliente(String login, String senha, int tipo, String codigoCliente, String nome, String email,
			String telefone, Endereco endereco) {
		super(login, senha, tipo);
		this.codigoCliente = codigoCliente;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;

		inserirEndereco(endereco);

	}
	
	public String toString () {
	final String ENTER = "\n";
	String retValue = "";
	
	retValue = "Informarções sobre o cliente: " + ENTER + 
	super.toString()+
	"Código do Cliente: " + codigoCliente + ENTER +
	"Nome: " + nome + ENTER +
	"E-mail: " + email + ENTER +
	"Telefone: " + telefone + ENTER +
	"Endereço: " + enderecos [0];
	
	return retValue;
	}
}
