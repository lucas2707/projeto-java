package model;

public class ItemDePedido {

	private int qtde;
	private double subtotal;

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


	@Override
	public String toString() {
		return "ItemDePedido [\nqtde=" + qtde + ",\n subtotal=" + subtotal + "]";
	}
	public ItemDePedido() {
		super();
	}

	public ItemDePedido(int qtde, double subtotal) {
		super();
		this.qtde = qtde;
		this.subtotal = subtotal;

	}

	public void mostrar() {

		System.out.println("`\n\nitemDePedido:\n");
		System.out.println("Qtde: " + this.qtde);
		System.out.println("Subtotal: " + this.subtotal);

	}

}
