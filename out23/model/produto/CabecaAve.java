package model.produto;

import model.produto.base.Item;

public class CabecaAve extends Item {

  private final double precoCabeca = 40;

  public CabecaAve(int quantidade) {
    super(quantidade);
    precoUnitario = this.precoCabeca;
  }

  public CabecaAve(int quantidade, double desconto) {
    super(quantidade, desconto);
    precoUnitario = this.precoCabeca;
  }

}