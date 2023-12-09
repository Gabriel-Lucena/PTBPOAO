package model;

import model.inter.Arma;

public class Contexto {

  private Arma arma;

  public Contexto() {};

  public void setArma(Arma arma) {
    this.arma = arma;
  }

  public void executeArma() {
    arma.atacar();
  }
}
