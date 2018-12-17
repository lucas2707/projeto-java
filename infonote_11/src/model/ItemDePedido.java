package model;

import java.text.DecimalFormat;
import java.text.NumberFormat;

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
		retValue = "Informações sobre o item de pedido:" + ENTER +
		"Qtde: " + qtde + ENTER +
		"Subtotal: " + subtotal + ENTER +
		"Notebook: " + notebook + ENTER;
		return retValue;
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