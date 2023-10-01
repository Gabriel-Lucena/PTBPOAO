package model;

public class Pedra {

  protected int forcaNucleo;

  public Pedra(String elemento) {

    switch (elemento) {
      case "fogo":
        this.forcaNucleo = 10;
        break;
      case "agua":
        this.forcaNucleo = 11;
        break;
      case "vento":
        this.forcaNucleo = 9;
        break;
      case "terra":
        this.forcaNucleo = 8;
        break;
    }
  }

  public int getForcaNucleo() {
    return forcaNucleo;
  }
}
