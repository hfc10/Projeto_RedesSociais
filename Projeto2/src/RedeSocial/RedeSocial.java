package RedeSocial;

import Excecoes.SenhaInvalida;

public abstract class RedeSocial {

    protected String senha;
    protected int numAmigos;

    public RedeSocial(String senha, int numAmigos) {

        this.senha = senha;
        this.numAmigos = numAmigos;
    }


    public void verificarSenha(String senha) throws SenhaInvalida {
        if (!this.senha.equals(senha)) {
            throw new SenhaInvalida("Senha inválida");
        }
        System.out.println("Entrou com sucesso");
    }

    public abstract void postarFoto();
    public abstract void postarVideo();
    public abstract void postarComentario();

    public void curtirPublicacao(){

        System.out.println("Curtiu uma publicação");

    }

}
