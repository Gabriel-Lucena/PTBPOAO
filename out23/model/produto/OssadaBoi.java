package model.produto;

import model.produto.base.Item;

public class OssadaBoi extends Item {

  private final double precoOssadaBoi = 10;

  public OssadaBoi(int quantidade) {
    super(quantidade);
    precoUnitario = this.precoOssadaBoi;
  }

  public OssadaBoi(int quantidade, double desconto) {
    super(quantidade, desconto);
    precoUnitario = this.precoOssadaBoi;
  }
}
