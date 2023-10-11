package model.ambiente;

import model.SlimeBasico;

public class SlimeTerrestre extends SlimeBasico {

    protected int defesaTerrestre = 0;

    public SlimeTerrestre(String nome, int nivelMalemolencia, int defesa, int defesaTerrestre) {
        super(nome, nivelMalemolencia, defesa);

        this.defesaTerrestre = defesaTerrestre;
    }

    public SlimeTerrestre(String nome, int nivelMalemolencia, int defesa) {
        super(nome, nivelMalemolencia, defesa);
    }

    public final int getDefesaTerrestre() {
        return this.defesaTerrestre;
    }
}
