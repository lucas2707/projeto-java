package model;

public class Pedido {

	private String dataEmissao;
	private String formaDePagamento;
	private String situacao;
	private int numero;
	private double valorTotal;

	private Endereco enderecoEntrega;
	private ItemDePedido itens[] = new ItemDePedido[10];

	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Endereco getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public ItemDePedido[] getItens() {
		return itens;
	}

	public void setEnderecoEntrega(Endereco enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	@Override
	public String toString() {
		return "Pedido [\n dataEmissao=" + dataEmissao + ",\n formaDePagamento=" + formaDePagamento + ",\n situacao="
				+ situacao + ",\n numero=" + numero + ",\n valorTotal=" + valorTotal + "]";
	}

	public Pedido() {
		super();
	}

	public Pedido(String dataEmissao, String formaDePagamento, String situacao, int numero, double valorTotal) {
		super();
		this.numero = numero;
		this.valorTotal = valorTotal;
		this.dataEmissao = dataEmissao;
		this.formaDePagamento = formaDePagamento;
		this.situacao = situacao;

	}

	public void mostrar() {

		System.out.println("`\n\nPedido:\n");
		System.out.println("Número: " + this.numero);
		System.out.println("Valor Total: " + this.valorTotal);
		System.out.println("Data Emissão: " + this.dataEmissao);
		System.out.println("Forma De Pagamento: " + this.formaDePagamento);
		System.out.println("Situação: " + this.situacao);

		System.out.println("\n\nItens do Pedido:\n");
		for (int i = 0; i < itens.length; i++) {
			if (itens[i] != null) {
				itens[i].mostrar();
			}
		}
	}

	public boolean inserirItem(ItemDePedido item) {
		for (int i = 0; i < itens.length; i++) {
			if (itens[i] == null) {
				return true;
			}
		}
		return false;

	}
}
