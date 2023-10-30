package model.produto;

import model.produto.base.Item;

public class PresasLobo extends Item {

  private final double precoPresasLobo = 11;

  public PresasLobo(int quantidade) {
    super(quantidade);
    precoUnitario = this.precoPresasLobo;
  }

  public PresasLobo(int quantidade, double desconto) {
    super(quantidade, desconto);
    precoUnitario = this.precoPresasLobo;
  }
}
