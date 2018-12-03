package model;

public class ItemDePedido {

	private int qtde;
	private double subtotal;

	private Notebook notebook;

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public Notebook getNotebook() {
		return notebook;
	}

	public ItemDePedido(Notebook notebook) {
		super();
		this.notebook = notebook;
	}

	public ItemDePedido() {
		super();
	}

	public ItemDePedido(int qtde, double subtotal) {
		super();
		this.qtde = qtde;
		this.subtotal = subtotal;

	}

	public ItemDePedido(int qtde, double subtotal, Notebook notebook) {
		super();
		this.qtde = qtde;
		this.subtotal = subtotal;
		this.notebook = notebook;
	}
	
	public String toString() {
		final String ENTER = "\n";
		String retValue = "";
		retValue = "Informa��es sobre o item de pedido:" + ENTER +
		"Qtde: " + qtde + ENTER +
		"Subtotal: " + subtotal + ENTER +
		"Notebook: " + notebook + ENTER;
		return retValue;
	}
}	