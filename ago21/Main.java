class Main {
  public static void main(String[] args) {

    Circulo circulo = new Circulo(3.14, "Branco");
    Triangulo triangulo = new Triangulo(3, 4, 5, "Verde");
    Quadrado quadrado = new Quadrado(2.71, "Amarelo");

    Forma[] formaArray = new Forma[3];

    formaArray[0] = circulo;
    formaArray[1] = triangulo;
    formaArray[2] = quadrado;

    for (Forma forma : formaArray) {
      forma.calcularArea();
      forma.mostrarCor();
    }

  }
}