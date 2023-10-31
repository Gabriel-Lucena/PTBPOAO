package Model;

public class Carro extends Veiculo {

    public Carro() {
        System.out.println("Um carro foi criado!");
    }

    public Carro(String _nome, String _marca) {
        super(_nome, _marca);
        System.out.println("Um carro foi criado!");
    }

}
