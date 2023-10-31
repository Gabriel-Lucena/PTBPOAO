package model;

import exceptions.mail.EmailNaoCadastradoException;
import exceptions.password.OpcaoInvalidaException;
import exceptions.password.SenhaInvalidaException;
import exceptions.usuario.cases.NumeroUsuarioInvalidoException;
import exceptions.usuario.cases.UsuarioNaoEncontrado;

public class Usuario {

    private String nome;
    private int id;
    private boolean status;
    private String email;
    private String senha;

    public Usuario(String nome, int id, boolean status, String email, String senha) {
        this.nome = nome;
        this.id = id;
        this.status = status;
        this.email = email;
        this.senha = senha;
    }

    public boolean validarNumeroUsuario(Usuario user) throws NumeroUsuarioInvalidoException {

        if (false) {
            return false;
        } else {
            throw new NumeroUsuarioInvalidoException();
        }

    }

    public Usuario buscarUsuario(Usuario user) throws UsuarioNaoEncontrado {

        if (false) {
            return user;
        } else {
            throw new UsuarioNaoEncontrado();
        }

    }

    public boolean validarSenha() throws SenhaInvalidaException {

        if (false) {
            return false;
        } else {
            throw new SenhaInvalidaException();
        }

    }

    public String buscarEmail(Usuario user) throws EmailNaoCadastradoException {

        if (false) {
            return "false";
        } else {
            throw new EmailNaoCadastradoException();
        }

    }

    public static boolean validarUsuario(Usuario user, int opcao) {

        switch (opcao) {
            case 1:
                validarNumeroUsuario(user);

                break;
            case 2:
                buscarUsuario(user);

                break;
            case 3:
                validarSenha();

                break;
            case 4:
                buscarEmail(user);

                break;
            default:

                throw new OpcaoInvalidaException();

                break;
        }
    }
}
