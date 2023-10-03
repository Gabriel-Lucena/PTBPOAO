package app;

import model.Anel;
import model.Cajado;
import model.Jogador;
import model.Pedra;

import static model.Jogador.iniciarDuelo;

public class App {
    public static void main(String args[]) {

        Pedra pedraFogo = new Pedra("fogo");
        Pedra pedraTerra = new Pedra("terra");
        Pedra pedraAr = new Pedra("ar");
        Pedra pedraAgua = new Pedra("agua");

        Cajado cajado = new Cajado(pedraAgua, pedraAgua);
        Anel anel = new Anel(pedraAgua);

        Cajado cajado2 = new Cajado(pedraTerra, pedraTerra);
        Anel anel2 = new Anel(pedraTerra);

        Jogador jogador1 = new Jogador(anel, cajado);
        Jogador jogador2 = new Jogador(anel2, cajado2);

        iniciarDuelo(jogador1, jogador2);
    }

}