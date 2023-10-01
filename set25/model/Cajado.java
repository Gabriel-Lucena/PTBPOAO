package model;

public class Cajado {

  protected Pedra[] pedras;
  protected int poderAtaque;

  public Cajado(Pedra pedra1, Pedra pedra2) {
    this.pedras[0] = pedra1;
    this.pedras[1] = pedra2;

    for (int i = 0; i < pedras.length; i++) {
      this.poderAtaque += pedras[i].getForcaNucleo();
    }
  }

  public int getPoderAtaque() {
    return poderAtaque;
  }
}
