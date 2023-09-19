package model.especie;

import model.comportamento.Pet;
import model.reino.Robo;

public class Mechanigato extends Robo implements Pet {

  private String modelo;
  private String numeroSerie;

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getNumeroSerie() {
    return numeroSerie;
  }

  public void setNumeroSerie(String numeroSerie) {
    this.numeroSerie = numeroSerie;
  }

  public void brincar() {
    System.out.println("Mechanigato está brincado");
  }

}
