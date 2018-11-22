package controller;

import model.*;

public class Teste {

	public static void main (String [] args) {
	
		Usuario user = new Usuario();
		user.setNome("Lucas Soares");
		user.setMatricula(1234);
		user.setLogin("lucassoares");
		user.setEmail("lucassoaressa");
		user.setTelefone("975563874");
		
		System.out.println("Nome: "+ user.getNome());
		System.out.println("Matr�cula: "+ user.getMatricula());
		System.out.println("Login: "+ user.getLogin());
		System.out.println("Email: "+ user.getEmail());
		System.out.println("Telefone: "+ user.getTelefone());

		ItemDePedido Idp1 = new ItemDePedido();
		Idp1.setQtde(3);
		Idp1.setSubtotal(48.73);
		System.out.println(Idp1.toString());
		
		ItemDePedido Idp2 = new ItemDePedido();
		Idp2.setQtde(1);
		Idp2.setSubtotal(23.49);
		System.out.println(Idp2.toString());
		
		Endereco edc = new Endereco();
		edc.setBairro("Grokono");
		edc.setCep("37825048");
		edc.setCidade("Imaginondo");
	    edc.setEstado("Imagin�ndia");
	    edc.setNumero("N�mero 257");
		edc.setComplemento("Casa 05");
		edc.setLogradouro("ao lado da Est�tua de Gogino");
		System.out.println(edc.toString());
		
		Pedido pd1 = new Pedido();
		pd1.setSituacao("� caminho");
		pd1.setDataEmissao("27/09");
		pd1.setFormaDePagamento("Cart�o");
		pd1.setNumero(23);
		pd1.setValorTotal(357);
		System.out.println(pd1.toString());
		
		Pedido pd2 = new Pedido();
		pd2.setSituacao("� caminho");
		pd2.setDataEmissao("27/09");
		pd2.setFormaDePagamento("Cart�o");
		pd2.setNumero(23);
		pd2.setValorTotal(357);
		System.out.println(pd2.toString());
		
		
		Notebook nt1 = new Notebook();
		nt1.setDataCadastro("20/09");
		nt1.setDescricao("Aparelho eletr�nico");
		nt1.setEstoque(35);
		nt1.setFigura("Fr�gil");
		nt1.setModelo("2016");
		nt1.setNumeroNote(1);
		nt1.setPrecoUnitario(150);
		System.out.println(nt1.toString());
		
		Notebook nt2= new Notebook();
		nt2.setDataCadastro("20/09");
		nt2.setDescricao("Aparelho eletr�nico");
		nt2.setEstoque(36);
		nt2.setFigura("Fr�gil");
		nt2.setModelo("2016");
		nt2.setNumeroNote(2);
		nt2.setPrecoUnitario(150);		
		System.out.println(nt2.toString());
		
		Notebook nt3= new Notebook();
		nt3.setDataCadastro("20/09");
		nt3.setDescricao("Aparelho eletr�nico");
		nt3.setEstoque(37);
		nt3.setFigura("Fr�gil");
		nt3.setModelo("2016");
		nt3.setNumeroNote(3);
		nt3.setPrecoUnitario(150);
		System.out.println(nt3.toString());
		
		
		
		
		
		
		
		
	}

}
