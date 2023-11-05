package model.local;

public class Bairro {

  private String nome;

  public Bairro(String nome) {
    this.nome = nome;
  }

  public static boolean createBairro(String nome) {

    Boolean connect = true;

    if (connect) {
      return true;
    } else {
      return false;
    }
  }

  public boolean relactCidade(String nome) {

    Boolean connect = true;

    if (connect) {
      return true;
    } else {
      return false;
    }
  }
}
