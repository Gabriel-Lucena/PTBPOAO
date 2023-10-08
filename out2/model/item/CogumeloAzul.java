package model.item;

import model.Jogador;
import model.base.Fungo;
import model.base.Item;

public class CogumeloAzul extends Fungo implements Item {

    public CogumeloAzul() {
        super("cogumelo azul");
    }

    public void use(Jogador jogador) {
        jogador.improveInteligencia(improveInteligencia);
    }
}
