package model.base;

public abstract class Fungo {

  protected int improveDefesaFisica = 0;
  protected int improveDefesaMagica = 0;
  protected int improveForca = 0;
  protected int improveInteligencia = 5;

  public Fungo(String string) {
    switch (string) {
      case "cogumelo azul":
        this.improveInteligencia += 10;

        break;

      case "cogumelo roxo":
        this.improveDefesaMagica += 10;

        break;

      default:
        break;
    }
  }

}
