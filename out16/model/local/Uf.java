package model.local;

public class Uf {

  private String sigla;

  public Uf(String sigla) {
    this.sigla = sigla;
  }

  public static boolean createUf(String sigla) {
    // db create

    Boolean connect = true;

    if (connect) {
      return true;
    } else {
      return false;
    }
  }

}
