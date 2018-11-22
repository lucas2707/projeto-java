package model;

public class Notebook {

	public String modelo;
	public String descricao;	
	public String dataCadastro;
	public String figura;
	 int numeroNote;
	 int estoque;
	 double precoUnitario;
	
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
		return "Notebook [modelo=" + modelo + ", descricao=" + descricao + ", dataCadastro=" + dataCadastro
				+ ", figura=" + figura + ", numeroNote=" + numeroNote + ", estoque=" + estoque + ", precoUnitario="
				+ precoUnitario + ", getModelo()=" + getModelo() + ", getDescricao()=" + getDescricao()
				+ ", getDataCadastro()=" + getDataCadastro() + ", getFigura()=" + getFigura() + ", getNumeroNote()="
				+ getNumeroNote() + ", getEstoque()=" + getEstoque() + ", getPrecoUnitario()=" + getPrecoUnitario()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	}


