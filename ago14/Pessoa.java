package ago14;

public class Pessoa {

  private String nome;
  private int idade;

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public int getIdade() {
    return idade;
  }

  public void dizerNome() {
    System.out.println("Meu nome é " + nome + ".");
  }

  public void dizerIdade() {
    System.out.println("Minha idade é de " + idade + " anos.");
  }

}
