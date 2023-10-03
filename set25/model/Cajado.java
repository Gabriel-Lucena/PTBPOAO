package model;

public class Cajado {

  protected Pedra pedra1;
  protected Pedra pedra2;
  protected int poderAtaque = 0;

  public Cajado(Pedra pedra1, Pedra pedra2) {
    this.pedra1 = pedra1;
    this.poderAtaque = pedra1.getForcaNucleo();

    this.pedra2 = pedra2;
    this.poderAtaque += pedra2.getForcaNucleo();
  }

  public int getPoderAtaque() {
    return poderAtaque;
  }
}
