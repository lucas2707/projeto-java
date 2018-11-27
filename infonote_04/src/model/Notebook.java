package model;

public class Notebook {

	private String modelo;
	private String descricao;	
	private String dataCadastro;
	private String figura;
	private  int numeroNote;
	private int estoque;
	private double precoUnitario;
	
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
	
	public int getNumeroNote() {
		return numeroNote;
	}
		public void setNumeroNote(int numeroNote) {
		this.numeroNote = numeroNote;
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

	
	@Override
	public String toString() {
		return "Notebook [\nmodelo=" + modelo + ",\n descricao=" + descricao + ",\n dataCadastro=" + dataCadastro
				+ ",\n figura=" + figura + ",\n numeroNote=" + numeroNote + ",\n estoque=" + estoque + ",\n precoUnitario="
				+ precoUnitario + "]";
	}
	
	public Notebook() {
		super();
	}

	public Notebook(String modelo, String descricao, String dataCadastro, String figura, int numeroNote, int estoque,
			double precoUnitario) {
		super();
		this.modelo = modelo;
		this.descricao = descricao;
		this.dataCadastro = dataCadastro;
		this.figura = figura;
		this.numeroNote = numeroNote;
		this.estoque = estoque;
		this.precoUnitario = precoUnitario;

	}

	public void mostrar() {

		System.out.println("`\n\nNotebook:\n");
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Descrição: " + this.descricao);
		System.out.println("Data Cadastro: " + this.dataCadastro);
		System.out.println("Figura: " + this.figura);
		System.out.println("Número Note: " + this.numeroNote);
		System.out.println("Estoque: " + this.estoque);
		System.out.println("Preço Unitário: " + this.precoUnitario);
	}
	
	}


