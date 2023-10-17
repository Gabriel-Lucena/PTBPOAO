package app;

import model.SlimeBasico;
import model.especie.SlimeArenoso;
import model.especie.SlimeVulcanico;

public class App {

    public static void main(String args[]) {

        SlimeBasico slimeBasico = new SlimeBasico("Horácio", 10, 10);
        SlimeBasico slimeBasico2 = new SlimeBasico("Catulo", 20, 20);

        System.out.println("Defesa comum:");
        System.out.println(slimeBasico.getDefesa());
        System.out.println(slimeBasico2.getDefesa());

        SlimeArenoso slimeArenoso = slimeBasico.tornarArenoso(20);
        SlimeVulcanico slimeVulcanico = slimeBasico2.tornarVulcanico(20);

        System.out.println("Defesa específica:");
        System.out.println(slimeArenoso.getDefesaArenoso());
        System.out.println(slimeVulcanico.getDefesaVulcanico());

    }
}