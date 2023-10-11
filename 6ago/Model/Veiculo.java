package Model;

public abstract class Veiculo {

    private String nome;
    private String marca;

    public Veiculo() {
    };

    public Veiculo(String _nome, String _marca) {
        this.nome = _nome;
        this.marca = _marca;
    }

    public void ligar() {
        System.out.println("O " + this.nome + " da " + this.marca + " foi ligado");
    }
}
