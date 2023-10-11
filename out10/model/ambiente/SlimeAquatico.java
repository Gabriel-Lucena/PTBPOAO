package model.ambiente;

import model.SlimeBasico;

public class SlimeAquatico extends SlimeBasico {

    protected int defesaAquatico = 0;

    public SlimeAquatico(String nome, int nivelMalemolencia, int defesa, int defesaAquatico) {
        super(nome, nivelMalemolencia, defesa);

        this.defesaAquatico = defesaAquatico;
    }

    public SlimeAquatico(String nome, int nivelMalemolencia, int defesa) {
        super(nome, nivelMalemolencia, defesa);
    }

    public final int getDefesaAquatico() {
        return this.defesaAquatico;
    }
}
