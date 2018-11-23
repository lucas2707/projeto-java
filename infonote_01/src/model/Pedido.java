package model;

public class Pedido {

	public String dataEmissao;
	public String formaDePagamento;
	public String situacao;
	int numero;
	double valorTotal;

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

	@Override
	public String toString() {
		return "Pedido [\n dataEmissao=" + dataEmissao + ",\n formaDePagamento=" + formaDePagamento + ",\n situacao="
				+ situacao + ",\n numero=" + numero + ",\n valorTotal=" + valorTotal + "]";
	}

	

}
