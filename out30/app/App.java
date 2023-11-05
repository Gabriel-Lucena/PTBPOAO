package app;

import java.util.Scanner;

import exceptions.mail.EmailNaoCadastradoException;
import exceptions.senha.OpcaoInvalidaException;
import exceptions.senha.SenhaInvalidaException;
import exceptions.usuario.cases.NumeroUsuarioInvalidoException;
import exceptions.usuario.cases.UsuarioNaoEncontrado;
import model.Usuario;

public class App {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Usuario usuario = new Usuario("Hécate", 12, true, "caliope@hotmail.com", "123");

        System.out.println("/----------------------\\");
        System.out.println("|  Digite uma opção:   |");
        System.out.println("|  1 - Validar Usuário |");
        System.out.println("|  2 - Buscar Usuário  |");
        System.out.println("|  3 - Validar Senha   |");
        System.out.println("|  4 - Buscar Email    |");
        System.out.println("\\----------------------/");

        int opcao = Integer.parseInt(leitor.nextLine());

        leitor.close();

        try {
            Usuario.validarUsuario(usuario, opcao);
        } catch (NumeroUsuarioInvalidoException numeroUsuarioInvalidoException) {
            numeroUsuarioInvalidoException.printStackTrace();
        } catch (UsuarioNaoEncontrado usuarioNaoEncontradoException) {
            usuarioNaoEncontradoException.printStackTrace();
        } catch (SenhaInvalidaException senhaInvalidaException) {
            senhaInvalidaException.printStackTrace();
        } catch (EmailNaoCadastradoException emailNaoCadastradoException) {
            emailNaoCadastradoException.printStackTrace();
        } catch (OpcaoInvalidaException opcaoInvalidaException) {
            opcaoInvalidaException.printStackTrace();
        }
    }
}
