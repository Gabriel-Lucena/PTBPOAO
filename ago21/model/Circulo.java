class Circulo extends Forma {

  double raio;

  public Circulo(double raio, String cor) {
    this.raio = raio;
    this.cor = cor;
  }

  void calcularArea() {
    double area = Math.PI * raio * raio;

    System.out.println("Cálculo específico de círculo " + Math.round(area) + ".");
  }

}
