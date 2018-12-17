package model;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Pedido {

	private String dataEmissao;
	private String formaDePagamento;
	private String situacao;
	private double valorTotal;
	private String numeroPedido;

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

	public String getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
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

	public void setEnderecoEntrega(Endereco enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}
	
	public ItemDePedido[] getItens() {
		return itens;
	}

	public void setItens(ItemDePedido[] itens) {
		this.itens = itens;
	}

	public Pedido() {
		super();
	}

	public Pedido(String numeroPedido, String dataEmissao, String formaDePagamento, String situacao, int numero,
			double valorTotal, Endereco enderecoEntrega) {
		super();
		this.numeroPedido = numeroPedido;
		this.valorTotal = valorTotal;
		this.dataEmissao = dataEmissao;
		this.formaDePagamento = formaDePagamento;
		this.situacao = situacao;
		this.enderecoEntrega = enderecoEntrega;
	}

	public String toString(){
		final String ENTER = "\n";
		String retValue = "";
		retValue = "Informações sobre Pedido:" + ENTER +
		"Número do Pedido: " + numeroPedido + ENTER +
		"Data de Emissão: " + dataEmissao + ENTER +
		"Forma de pagamento: " + formaDePagamento + ENTER +
		"Valor Total: " + valorTotal + ENTER +
		"Situação: " + situacao + ENTER +
		"Endereço de Entrega: " + ENTER +
		"Itens: ";
		for (int i = 0; i < itens.length; i++){
		retValue += itens[i] + ENTER;
		}
		return retValue;
		}
	
	public boolean inserirItem(ItemDePedido item) {
		for (int i = 0; i < itens.length; i++) {
			if (itens[i] == null) {
				return true;
			}
		}
		return false;

	}
	
	
	public static void main(String[] args) {
		NumberFormat f = NumberFormat.getCurrencyInstance();
		double valor = 55008.537;
		System.out.println("Sem formatação: " + valor);
		System.out.println("Formatado: " + f.format(valor));
		
		NumberFormat n = NumberFormat.getNumberInstance();
		 double numero = 100.50;
		 System.out.println("Sem formatação: " + numero);
		 System.out.println("Formatado: " + n.format(numero));
		 double valor2 = 12000.5;
		 DecimalFormat df = new DecimalFormat("R$ ###,###,###.00");
		 System.out.println("Sem formatação: " + valor2);
		 System.out.println("Formatado: " + df.format(valor2));
		}
		
		
		
}
