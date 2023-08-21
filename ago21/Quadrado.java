class Quadrado extends Forma {

  double lado;

  public Quadrado(double lado, String cor) {
    this.lado = lado;
    this.cor = cor;
  }

  void calcularArea() {
    double area = lado * lado;

    System.out.println("Calculo específico de quadrado " + Math.round(area) + ".");
  }
}
