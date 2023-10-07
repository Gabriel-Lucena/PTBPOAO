package model.base;

import model.Jogador;

public abstract class Fungo {

  public Fungo(Jogador jogador) {
    jogador.improveInteligencia(5);
  }

  public abstract void use(Jogador jogador);
}
