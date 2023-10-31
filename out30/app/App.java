package app;

import exceptions.usuario.UsuarioException;
import exceptions.usuario.cases.UsuarioNaoEncontrado;
import model.Usuario;

public class App {
    public static void main(String[] args) {

        Usuario user = new Usuario("Calíope", 12, true, "caliope@hotmail.com", "123");

        try {
            user.validarUsuario(user, 1);
        } catch (Exception e) {
        } catch (Exception e) {
        } catch (Exception e) {
        } catch (Exception e) {
        } catch (Exception e) {
        } catch (UsuarioNaoEncontrado e) {
        } catch (UsuarioException e) {
        }
    }
}
