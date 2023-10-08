package model.item;

import model.Jogador;
import model.base.Carne;
import model.base.Item;

public class Frango extends Carne implements Item {

  public Frango() {
    super("frango");
  }

  public void use(Jogador jogador) {
    jogador.improveForca(improveForca);
  }
}
