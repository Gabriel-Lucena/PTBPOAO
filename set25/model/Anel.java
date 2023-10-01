package model;

public class Anel {

  protected Pedra pedra;
  protected int poderDefesa;

  public Anel(Pedra pedra) {
    this.poderDefesa = pedra.getForcaNucleo();
  }

  public int getPoderDefesa() {
    return poderDefesa;
  }
}
