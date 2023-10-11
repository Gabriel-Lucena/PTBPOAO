package model.especie;

import model.ambiente.SlimeAquatico;

public class SlimeVenenoso extends SlimeAquatico {

    protected int defesaVenenoso = 0;

    public SlimeVenenoso(String nome, int nivelMalemolencia, int defesa, int defesaVenenoso) {
        super(nome, nivelMalemolencia, defesa);

        this.defesaVenenoso = defesaVenenoso;
    }

    public int getDefesaVenenoso() {
        return this.defesaVenenoso;
    }
}