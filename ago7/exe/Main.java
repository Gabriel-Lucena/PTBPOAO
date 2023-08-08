class Main {
  public static void main(String[] args) {

    Carro carro1 = new Carro();

    carro1.ano = 1980;
    carro1.marca = "VW";
    carro1.modelo = "Fusca";
    carro1.cor = "Azul";

    carro1.exibirModelo();
    carro1.exibirAnoECor();

    Carro carro2 = new Carro();

    carro2.ano = 2000;
    carro2.marca = "Ford";
    carro2.modelo = "Fiesta";
    carro2.cor = "Vermelho";

    carro2.exibirModelo();
    carro2.exibirAnoECor();

    Carro meuCarro = new Carro();

    meuCarro.ano = 2020;
    meuCarro.marca = "Toyota";
    meuCarro.modelo = "Prius";
    meuCarro.cor = "Branco";

    meuCarro.exibirModelo();
    meuCarro.exibirAnoECor();
  }
}