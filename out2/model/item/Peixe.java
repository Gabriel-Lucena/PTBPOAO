package model.item;

import model.Jogador;
import model.base.Carne;
import model.base.Item;

public class Peixe extends Carne implements Item {

  public Peixe() {
    super("peixe");
  }

  public void use(Jogador jogador) {
    jogador.improveForca(improveForca);
    jogador.improveDefesaFisica(improveDefesaFisica);
  }

}
