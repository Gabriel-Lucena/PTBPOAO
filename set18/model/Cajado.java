package model;

public class Cajado {

  public Cajado() {
  }

  public void executarPoderElementar(PedraAgua pedraAgua, PedraAgua pedraAgua2) {
    System.out.println("Poder: água.");
  }

  public void executarPoderElementar(PedraAr pedraAr, PedraAr pedraAr2) {
    System.out.println("Poder: ar.");
  }

  public void executarPoderElementar(PedraFogo pedraFogo, PedraFogo pedraFogo2) {
    System.out.println("Poder: fogo.");
  }

  public void executarPoderElementar(PedraTerra pedraTerra, PedraTerra pedraTerra2) {
    System.out.println("Poder: terra.");
  }

  public void executarPoderElementar(PedraFogo pedraFogo, PedraAr pedraAr) {
    System.out.println("Poder: combustão.");
  }

  public void executarPoderElementar(PedraAr pedraAr, PedraFogo pedraFogo) {
    System.out.println("Poder: combustão.");
  }

  public void executarPoderElementar(PedraAr pedraAr, PedraAgua pedraAgua) {
    System.out.println("Poder: neve.");
  }

  public void executarPoderElementar(PedraAgua pedraAgua, PedraAr pedraAr) {
    System.out.println("Poder: neve.");
  }

  public void executarPoderElementar(PedraFogo pedraFogo, PedraTerra pedraTerra) {
    System.out.println("Poder: lava.");
  }

  public void executarPoderElementar(PedraTerra pedraTerra, PedraFogo pedraFogo) {
    System.out.println("Poder: lava.");
  }

  public void executarPoderElementar(PedraTerra pedraTerra, PedraAgua pedraAgua) {
    System.out.println("Poder: planta.");
  }

  public void executarPoderElementar(PedraAgua pedraAgua, PedraTerra pedraTerra) {
    System.out.println("Poder: planta.");
  }
}
