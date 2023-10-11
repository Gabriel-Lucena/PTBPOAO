package model.especie;

import model.ambiente.SlimeAquatico;

public class SlimeMaritimo extends SlimeAquatico {

    protected int defesaMaritimo = 0;

    public SlimeMaritimo(String nome, int nivelMalemolencia, int defesa, int defesaMaritimo) {
        super(nome, nivelMalemolencia, defesa);

        this.defesaMaritimo = defesaMaritimo;
    }

    public int getDefesaMaritimo() {
        return this.defesaMaritimo;
    }
}