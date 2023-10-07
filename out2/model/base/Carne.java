package model.base;

import model.Jogador;

public abstract class Carne {

  public Carne(Jogador jogador) {
    jogador.improveForca(5);
  }

  public abstract void use(Jogador jogador);
}
