package model.base;

public abstract class Carne {

  protected int improveDefesaFisica = 0;
  protected int improveDefesaMagica = 0;
  protected int improveForca = 5;
  protected int improveInteligencia = 0;

  public Carne(String string) {
    switch (string) {
      case "frango":
        this.improveForca += 10;

        break;

      case "peixe":
        this.improveDefesaFisica += 10;

        break;

      default:
        break;
    }
  }

}
