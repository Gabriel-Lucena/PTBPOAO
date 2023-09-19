package model;

public abstract class PedraElemento {

  private String elemento;

  public String getElemento() {
    return elemento;
  }

  public void setElemento(String elemento) {
    this.elemento = elemento;
  }

  public PedraElemento(String elemento) {
    this.elemento = elemento;
  }
}
