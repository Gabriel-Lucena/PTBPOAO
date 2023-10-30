package model.produto.base;

public abstract class Item {

  protected double precoUnitario;
  protected int quantidade;
  protected double desconto;

  public Item(int quantidade) {
    this.quantidade = quantidade;
  }

  public Item(int quantidade, double desconto) {
    this.quantidade = quantidade;
    this.desconto = desconto;
  }

  public int getQuantidade() {
    return this.quantidade;
  }

  public double getDesconto() {
    return this.desconto;
  }

  public double getPrecoUnitario() {
    return this.precoUnitario;
  }
}
