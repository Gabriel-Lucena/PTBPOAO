package model;

public class Alerta {

  private String texto;
  private String dataHora;
  private int nivel;

  public Alerta(String texto, String dataHora, int nivel) {
    this.texto = texto;
    this.dataHora = dataHora;
    this.nivel = nivel;
  }

  public static boolean createAlerta(String texto, String dataHora, int nivel) {

    Boolean connect = true;

    if (connect) {
      return true;
    } else {
      return false;
    }

  }
}
