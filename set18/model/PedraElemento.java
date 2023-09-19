package model;

public abstract class PedraElemento {
  private String elemento;

  public String getElemento() {
    return elemento;
  }

  public void setElemento(String elemento) {
    this.elemento = elemento;
  }

  private int forcaElemento;

  public int getForcaElemento() {
    return forcaElemento;
  }

  public void setForcaElemento(int forcaElemento) {
    this.forcaElemento = forcaElemento;
  }

  public PedraElemento(String elemento) {
    this.elemento = elemento;
  }
}
