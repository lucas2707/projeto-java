package controller;

import model.*;

public class Teste {

	public static void main(String[] args) {

		UsuarioOld user = new UsuarioOld(1, "joseph", "climber", "Joseph Climber", "josephclimber@gmail.com", "2222-3344");

		user.mostrar();

		System.out.println("=======================================");

		ItemDePedido Idp1 = new ItemDePedido(3, 48.73);
		Idp1.mostrar();

		
		
		System.out.println("=======================================");

		ItemDePedido Idp2 = new ItemDePedido(1, 23.49);
		Idp2.mostrar();

		System.out.println("=======================================");

		Endereco edc = new Endereco("Grokono", "37825048", "Imaginondo", "Imaginândia", "Número 257", "Casa 05",
				"ao lado da Estátua de Gogino");
		edc.mostrar();

		System.out.println("=======================================");

		Pedido pd = new Pedido("27/09", "Cartão", "À caminho", 23, 357.54);
		pd.mostrar();

		System.out.println("=======================================");

		Notebook nt1 = new Notebook("Aparelho eletrônico", "20/09", "Frágil", "2016", 1, 35, 150.50);
		nt1.mostrar();

		System.out.println("=======================================");

		Notebook nt2 = new Notebook("Aparelho eletrônico", "20/09", "Frágil", "2016", 2, 36, 150.50);
		nt2.mostrar();

		System.out.println("=======================================");

		Notebook nt3 = new Notebook("Aparelho eletrônico", "20/09", "Frágil", "2016", 3, 37, 150.50);
		nt3.mostrar();

	}

}
