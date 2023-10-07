package model;

public class Jogador {

    protected int forca;
    protected int inteligencia;
    protected int defesaMagica;
    protected int defesaFisica;

    public Jogador(int forca, int inteligencia, int defesaMagica, int defesaFisica) {
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.defesaMagica = defesaMagica;
        this.defesaFisica = defesaFisica;
    }

    public int getForca() {
        return this.forca;
    }

    public void improveForca(int forca) {
        if (forca < 0) {
            return;
        }
        this.forca += forca;
    }

    public int getInteligencia() {
        return this.inteligencia;
    }

    public void improveInteligencia(int inteligencia) {
        if (inteligencia < 0) {
            return;
        }
        this.inteligencia += inteligencia;
    }

    public int getDefesaMagica() {
        return this.defesaMagica;
    }

    public void improveDefesaMagica(int defesaMagica) {
        if (defesaMagica < 0) {
            return;
        }
        this.defesaFisica += defesaMagica;
    }

    public int getDefesaFisica() {
        return this.defesaFisica;
    }

    public void improveDefesaFisica(int defesaFisica) {
        if (defesaFisica < 0) {
            return;
        }
        this.defesaFisica += defesaFisica;
    }

    public void print() {
        System.out.println("Força:" + this.forca);
        System.out.println("Inteligência:" + this.inteligencia);
        System.out.println("Defesa Mágica:" + this.defesaMagica);
        System.out.println("Defesa Física:" + this.defesaFisica + "\n");
    }
}
