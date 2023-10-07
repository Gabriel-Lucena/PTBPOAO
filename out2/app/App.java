package app;

import model.Jogador;
import model.item.CogumeloAzul;

public class App {

	public static void main(String args[]) {
		Jogador jogador = new Jogador(10, 10, 10, 10);

		jogador.print();

		CogumeloAzul cogumeloAzul = new CogumeloAzul(jogador);

		jogador.print();
	}

}
