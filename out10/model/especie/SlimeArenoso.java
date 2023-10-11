package model.especie;

import model.ambiente.SlimeTerrestre;

public class SlimeArenoso extends SlimeTerrestre {

    protected int defesaArenoso = 0;

    public SlimeArenoso(String nome, int nivelMalemolencia, int defesa) {
        super(nome, nivelMalemolencia, defesa);
    }

    public SlimeArenoso(String nome, int nivelMalemolencia, int defesa, int defesaArenoso) {
        super(nome, nivelMalemolencia, defesa);

        this.defesaArenoso = defesaArenoso;
    }

    public int getDefesaArenoso() {
        return this.defesaArenoso;
    }
}
