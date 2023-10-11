package model.especie;

import model.ambiente.SlimeTerrestre;

public class SlimeVulcanico extends SlimeTerrestre {

    protected int defesaVulcanico = 0;

    public SlimeVulcanico(String nome, int nivelMalemolencia, int defesa) {
        super(nome, nivelMalemolencia, defesa);
    }

    public SlimeVulcanico(String nome, int nivelMalemolencia, int defesa, int defesaVulcanico) {
        super(nome, nivelMalemolencia, defesa);

        this.defesaVulcanico = defesaVulcanico;
    }

    public int getDefesaVulcanico() {
        return this.defesaVulcanico;
    }
}
