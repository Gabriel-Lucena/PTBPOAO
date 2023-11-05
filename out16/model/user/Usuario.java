package model.user;

public class Usuario {

  private String idUsuario;
  private String nomeUsuario;
  private String senha;
  private String dataCriacao;

  public Usuario(String idUsuario, String nomeUsuario, String senha, String dataCriacao) {
    this.idUsuario = idUsuario;
    this.nomeUsuario = nomeUsuario;
    this.senha = senha;
    this.dataCriacao = dataCriacao;
  }

  public boolean criarUsuario(String nome, String nomeUsuario, String senha, String dataCriacao) {
    // db
    // create *****

    Boolean create = true;

    if (create) {
      return true;
    } else {
      return false;
    }
  }
}