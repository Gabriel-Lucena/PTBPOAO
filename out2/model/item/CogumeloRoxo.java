package model.item;

import model.Jogador;
import model.base.Fungo;
import model.base.Item;

public class CogumeloRoxo extends Fungo implements Item {

    public CogumeloRoxo() {
        super("cogumelo roxo");
    }

    public void use(Jogador jogador) {
        jogador.improveInteligencia(improveInteligencia);
        jogador.improveDefesaMagica(improveDefesaMagica);
    }
}
