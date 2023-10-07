package model.base;

import model.Jogador;

public interface Item {

  public void melhorarForca(Jogador jogador);

  public void melhorarInteligencia(Jogador jogador);

  public void melhorarDefesaMagica(Jogador jogador);

  public void melhorarDefesaFisica(Jogador jogador);
}
