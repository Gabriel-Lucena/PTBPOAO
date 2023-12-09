package model.personagem;

import model.inter.Arma;
import model.inter.Personagem;

public class Rei implements Personagem {

    private Arma arma;

    public Rei(Arma arma) {
        this.arma = arma;
    }

    public void executarAtaque() {
        System.out.println("Rei atacou");
        arma.atacar();
    };

}
