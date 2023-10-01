package model;

public class Jogador {

    protected int ataque = 0;
    protected int defesa = 0;

    protected Anel anel;
    protected Cajado cajado;

    public Jogador(Anel anel, Cajado cajado) {
        this.anel = anel;
        this.cajado = cajado;
    }

    public Jogador() {
    }

    public int atacar() {
        return ataque + cajado.getPoderAtaque();
    }

    public int defender() {
        return defesa + anel.getPoderDefesa();
    }

    public static void iniciarDuelo(Jogador jogador1, Jogador jogador2) {
        int ataque = jogador1.atacar();
        int defesa = jogador2.defender();

        if (ataque >= defesa) {
            System.out.println("jogador 1 ganhou");
        } else {
            System.out.println("jogador 2 ganhou");
        }
    }
}