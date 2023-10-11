package model.especie;

import model.ambiente.SlimeTerrestre;

public class SlimeGrama extends SlimeTerrestre {

    protected int defesaGrama = 0;

    public SlimeGrama(String nome, int nivelMalemolencia, int defesa, int defesaGrama) {
        super(nome, nivelMalemolencia, defesa);

        this.defesaGrama = defesaGrama;
    }

    public int getDefesaGrama() {
        return this.defesaGrama;
    }
}
