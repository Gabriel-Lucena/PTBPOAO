package app;

import model.comportamento.Pet;

import model.especie.Cao;
import model.especie.Caotron;
import model.especie.Gato;
import model.especie.Mechanigato;

public class Main {
  public static void main(String[] args) {

    Pet[] array = new Pet[4];

    array[0] = new Gato();
    array[1] = new Cao();
    array[2] = new Caotron();
    array[3] = new Mechanigato();

    for (Pet pet : array) {
      pet.brincar();
    }

  }
}
