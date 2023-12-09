import java.util.Scanner;

import model.Contexto;
import model.arma.Cajado;
import model.arma.Espada;
import model.arma.Faca;
import model.arma.Machado;
import model.personagem.BoboCorte;
import model.personagem.Rainha;
import model.personagem.Rei;
import model.personagem.Troll;

public class App {
  public static void main(String[] args) {

    Contexto contexto = new Contexto();

    Rei rei = new Rei(new Cajado());
    BoboCorte boboDaCorte = new BoboCorte(new Espada());
    Rainha rainha = new Rainha(new Faca());
    Troll troll = new Troll(new Machado());

    rei.executarAtaque();

    trocarArma(contexto);
    contexto.executeArma();
    trocarArma(contexto);
    contexto.executeArma();

    boboDaCorte.executarAtaque();

    trocarArma(contexto);
    contexto.executeArma();
    trocarArma(contexto);
    contexto.executeArma();

    rainha.executarAtaque();

    trocarArma(contexto);
    contexto.executeArma();
    trocarArma(contexto);
    contexto.executeArma();

    troll.executarAtaque();

    trocarArma(contexto);
    contexto.executeArma();
    trocarArma(contexto);
    contexto.executeArma();
  }

  private static void trocarArma(Contexto contexto) {
    Scanner scanner = new Scanner(System.in);
    String novaArma;

    System.out.println("Digite a nova arma:");
    novaArma = scanner.nextLine();

    switch (novaArma) {
      case "Cajado":
        contexto.setArma(new Cajado());

        break;
      case "Espada":
        contexto.setArma(new Espada());

        break;
      case "Faca":
        contexto.setArma(new Faca());

        break;
      case "Machado":
        contexto.setArma(new Machado());

        break;
      default:
        break;
    }

  }
}