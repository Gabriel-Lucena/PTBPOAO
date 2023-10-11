package model;

import model.especie.SlimeArenoso;

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

    public static final void tornarArenoso(SlimeBasico slimeBasico) {

        String nome = slimeBasico.getNome();
        int nivelMalemolencia = slimeBasico.getNivelMalemolencia();
        int defesa = slimeBasico.getDefesa();

        SlimeArenoso slimeArenoso = new SlimeArenoso(nome, nivelMalemolencia, defesa);
    }
}
