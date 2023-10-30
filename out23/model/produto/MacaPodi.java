package model.produto;

import model.produto.base.Item;

public class MacaPodi extends Item {

  private final double precoMacaPodi = 5;

  public MacaPodi(int quantidade) {
    super(quantidade);
    precoUnitario = this.precoMacaPodi;
  }

  public MacaPodi(int quantidade, double desconto) {
    super(quantidade, desconto);
    precoUnitario = this.precoMacaPodi;
  }
}
