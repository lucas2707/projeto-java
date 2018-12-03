package model;

public class Notebook {

	private String modelo;
	private String descricao;
	private String dataCadastro;
	private String figura;
	private int estoque;
	private double precoUnitario;
	private String serialNote;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getFigura() {
		return figura;
	}

	public void setFigura(String figura) {
		this.figura = figura;
	}

	public String getSerialNote() {
		return serialNote;
	}

	public void setSerialNote(String serialNote) {
		this.serialNote = serialNote;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public Notebook() {
		super();
	}

	public Notebook(String modelo, String descricao, String dataCadastro, String figura, String serialNote, int estoque,
			double precoUnitario) {
		super();
		this.modelo = modelo;
		this.descricao = descricao;
		this.dataCadastro = dataCadastro;
		this.figura = figura;
		this.serialNote = serialNote;
		this.estoque = estoque;
		this.precoUnitario = precoUnitario;

	}

	public String toString() {
		final String ENTER = "\n";
		String retValue = "";
		retValue = "Informações sobre o notebook:" + ENTER +
		"Modelo: " + modelo + ENTER +
		"Descrição: " + descricao + ENTER +
		"Data de cadastro: " + dataCadastro + ENTER +
		"Figura: " + figura + ENTER +
		"Serial note: " + serialNote + ENTER +
		"Estoque: "+ estoque + ENTER +
		"Preço Unitário: "+ precoUnitario;
		return retValue;
	}

}	
