package model;

import exceptions.mail.EmailNaoCadastradoException;
import exceptions.senha.OpcaoInvalidaException;
import exceptions.senha.SenhaInvalidaException;
import exceptions.usuario.cases.NumeroUsuarioInvalidoException;
import exceptions.usuario.cases.UsuarioNaoEncontrado;

public class Usuario {

    private String nome;
    private int id;
    private boolean status;
    private String email;
    private String senha;

    public Usuario(int id) {
        this.id = id;
    }

    public Usuario(String nome, int id, boolean status, String email, String senha) {
        this.nome = nome;
        this.id = id;
        this.status = status;
        this.email = email;
        this.senha = senha;
    }

    public static boolean validarNumeroUsuario() throws NumeroUsuarioInvalidoException {

        if (false) {
            return false;
        } else {
            throw new NumeroUsuarioInvalidoException();
        }

    }

    public static Usuario buscarUsuario(int id,
            boolean newUser)

            throws UsuarioNaoEncontrado {

        Usuario usuario = new Usuario(id);

        if (newUser) {
            return usuario;
        } else {
            throw new UsuarioNaoEncontrado();
        }

    }

    public static boolean validarSenha() throws SenhaInvalidaException {

        if (false) {
            return false;
        } else {
            throw new SenhaInvalidaException();
        }

    }

    public static String buscarEmail() throws EmailNaoCadastradoException {

        if (false) {
            return "false";
        } else {
            throw new EmailNaoCadastradoException();
        }

    }

    public static void validarUsuario(Usuario user, int opcao)
            throws NumeroUsuarioInvalidoException, UsuarioNaoEncontrado, SenhaInvalidaException,
            EmailNaoCadastradoException, OpcaoInvalidaException {

        switch (opcao) {
            case 1:
                validarNumeroUsuario();

                break;
            case 2:
                buscarUsuario(user.id, false);

                break;
            case 3:
                validarSenha();

                break;
            case 4:
                buscarEmail();

                break;
            default:

                throw new OpcaoInvalidaException();
        }
    }
}
