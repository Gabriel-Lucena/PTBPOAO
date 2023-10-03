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
        int[] jogador1Array = new int[2];
        int[] jogador2Array = new int[2];

        jogador1Array[0] = jogador1.atacar();
        jogador1Array[1] = jogador1.defender();

        jogador2Array[0] = jogador2.atacar();
        jogador2Array[1] = jogador2.defender();

        while (jogador1Array[1] > 0 || jogador2Array[1] > 0) {
            jogador2Array[1] -= jogador1Array[0];
            jogador1Array[1] -= jogador2Array[0];
        }

        if (jogador1Array[1] > jogador2Array[1]) {
            System.out.println("O Jogador 1 Ganhou!!!");
        } else {
            System.out.println("O Jogador 2 Ganhou!!!");
        }
    }
}