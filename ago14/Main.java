package ago14;

class Main {
  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa();

    pessoa.setNome("Sêneca");
    pessoa.setIdade(68);

    pessoa.dizerNome();
    pessoa.dizerIdade();
  }
}
