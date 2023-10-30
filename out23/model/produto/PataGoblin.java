package model.produto;

import model.produto.base.Item;

public class PataGoblin extends Item {

  private final double precoPataGoblin = 50;

  public PataGoblin(int quantidade) {
    super(quantidade);
    precoUnitario = this.precoPataGoblin;
  }

  public PataGoblin(int quantidade, double desconto) {
    super(quantidade, desconto);
    precoUnitario = this.precoPataGoblin;
  }
}
