package model.personagem;

import model.inter.Arma;
import model.inter.Personagem;

public class Rainha implements Personagem {

    private Arma arma;

    public Rainha(Arma arma) {
        this.arma = arma;
    }

    public void executarAtaque() {
        System.out.println("Rainha atacou");
        arma.atacar();
    };

}
