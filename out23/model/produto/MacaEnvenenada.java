package model.produto;

import model.produto.base.Item;

public class MacaEnvenenada extends Item {

  private final double precoMacaEnvenenada = 20;

  public MacaEnvenenada(int quantidade) {
    super(quantidade);
    precoUnitario = this.precoMacaEnvenenada;
  }

  public MacaEnvenenada(int quantidade, double desconto) {
    super(quantidade, desconto);
    precoUnitario = this.precoMacaEnvenenada;
  }

}
