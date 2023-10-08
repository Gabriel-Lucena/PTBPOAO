package app;

import model.Jogador;
import model.item.CogumeloAzul;
import model.item.CogumeloRoxo;
import model.item.Frango;
import model.item.Peixe;

public class App {

	public static void main(String args[]) {
		Jogador jogador = new Jogador(10, 10, 10, 10);

		jogador.print();

		CogumeloAzul cogumeloAzul = new CogumeloAzul();
		CogumeloRoxo cogumeloRoxo = new CogumeloRoxo();
		Frango frango = new Frango();
		Peixe peixe = new Peixe();

		cogumeloAzul.use(jogador);
		cogumeloRoxo.use(jogador);
		frango.use(jogador);
		peixe.use(jogador);

		jogador.print();
	}

}
