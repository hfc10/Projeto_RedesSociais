package Excecoes;

public class UsuarioNaoEncontrado extends RuntimeException {

    public UsuarioNaoEncontrado(String message) {

        super(message);
    }
}
