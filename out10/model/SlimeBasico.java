package model;

import model.especie.SlimeArenoso;
import model.especie.SlimeVulcanico;

public class SlimeBasico {

    protected String nome;
    protected int nivelMalemolencia = 0;
    protected int defesa = 0;

    public SlimeBasico() {
    }

    public SlimeBasico(String nome, int nivelMalemolencia, int defesa) {
        this.nome = nome;
        this.nivelMalemolencia = nivelMalemolencia;
        this.defesa = defesa;
    }

    public String getNome() {
        return this.nome;
    }

    public int getNivelMalemolencia() {
        return this.nivelMalemolencia;
    }

    public int getDefesa() {
        return this.defesa;
    }

    public final SlimeArenoso tornarArenoso(int defesaArenoso) {

        String nome = this.nome;
        int nivelMalemolencia = this.nivelMalemolencia;
        int defesa = this.defesa;

        SlimeArenoso slimeArenoso = new SlimeArenoso(nome, nivelMalemolencia, defesa, defesaArenoso);

        return slimeArenoso;
    }

    public final SlimeVulcanico tornarVulcanico(int defesaVulcanico) {

        String nome = this.nome;
        int nivelMalemolencia = this.nivelMalemolencia;
        int defesa = this.defesa;

        SlimeVulcanico slimeVulcanico = new SlimeVulcanico(nome, nivelMalemolencia, defesa, defesaVulcanico);

        return slimeVulcanico;
    }

}
