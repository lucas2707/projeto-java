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
		return "Pedido [dataEmissao=" + dataEmissao + ", formaDePagamento=" + formaDePagamento + ", situacao="
				+ situacao + ", numero=" + numero + ", valorTotal=" + valorTotal + ", getDataEmissao()="
				+ getDataEmissao() + ", getFormaDePagamento()=" + getFormaDePagamento() + ", getSituacao()="
				+ getSituacao() + ", getNumero()=" + getNumero() + ", getValorTotal()=" + getValorTotal()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
