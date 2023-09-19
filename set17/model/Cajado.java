package model;

public class Cajado {

  public Cajado() {

  }

  public void executarPoderElementar(PedraElemento pedra_1, PedraElemento pedra_2) {

    String elemento_1 = pedra_1.getElemento();
    String elemento_2 = pedra_2.getElemento();

    String poder = elemento_1;

    if ((elemento_1 == "fogo" && elemento_2 == "ar") || (elemento_1 == "ar" && elemento_2 == "fogo")) {
      poder = "combustão";
    }

    if ((elemento_1 == "ar" && elemento_2 == "água") || (elemento_1 == "água" && elemento_2 == "ar")) {
      poder = "neve";
    }

    if ((elemento_1 == "fogo" && elemento_2 == "terra") || (elemento_1 == "terra" && elemento_1 == "fogo")) {
      poder = "lava";
    }

    if ((elemento_1 == "terra" && elemento_2 == "água") || (elemento_1 == "água" && elemento_2 == "terra")) {
      poder = "planta";
    }

    System.out.println("Poder: " + poder + ".");

  }

}
