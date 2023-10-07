package model.item;

import model.Jogador;
import model.base.Fungo;
import model.base.Item;

public class CogumeloRoxo extends Fungo implements Item {

    public CogumeloRoxo(Jogador jogador) {
        super(jogador);
        jogador.improveDefesaMagica(10);
    }

    @Override
    public void melhorarForca(Jogador jogador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'melhorarForca'");
    }

    @Override
    public void melhorarInteligencia(Jogador jogador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'melhorarInteligencia'");
    }

    @Override
    public void melhorarDefesaMagica(Jogador jogador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'melhorarDefesaMagica'");
    }

    @Override
    public void melhorarDefesaFisica(Jogador jogador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'melhorarDefesaFisica'");
    }

    @Override
    public void use(Jogador jogador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'use'");
    }

}
