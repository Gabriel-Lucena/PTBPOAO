class Triangulo extends Forma {

  double ladoA;
  double ladoB;
  double ladoC;

  public Triangulo(double ladoA, double ladoB, double ladoC, String cor) {
    this.ladoA = ladoA;
    this.ladoB = ladoB;
    this.ladoC = ladoC;
    this.cor = cor;
  }

  void calcularArea() {
    double semiperimetro = (ladoA + ladoB + ladoC) / 2;

    double area = Math
        .sqrt(semiperimetro * (semiperimetro - ladoA) * (semiperimetro - ladoB) * (semiperimetro - ladoC));

    System.out.println("Cálculo específico de triângulo " + Math.round(area) + ".");
  }
}
