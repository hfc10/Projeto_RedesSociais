package RedeSocial;

import Excecoes.SenhaInvalida;
import Excecoes.UsuarioNaoEncontrado;

import java.util.Set;

public class Usuario {

    private String nome;
    private String email;
    private Set<RedeSocial> redesSociais;

    public Usuario(String nome, String email, Set<RedeSocial> redesSociais) {

        if (redesSociais == null || redesSociais.isEmpty()) {
            throw new UsuarioNaoEncontrado("Nenhuma rede social foi adicionada");
        }
        this.nome = nome;
        this.email = email;
        this.redesSociais = redesSociais;
    }


    public void usandoAsRedes() throws SenhaInvalida {

        for(RedeSocial reds: redesSociais) {

         try {
             if (reds instanceof Facebook) {

                 Facebook FB = (Facebook) reds;

                 FB.verificarSenha("12345");
                 FB.postarVideo();
                 FB.postarComentario();
                 FB.fazStreaming();

             }
             if (reds instanceof Twitter) {

                 ///////////////////////////////////

             }
             if (reds instanceof Instagram) {

                 Instagram Ins = (Instagram) reds;

                 Ins.verificarSenha("123");
                 Ins.postarVideo();

             }
             if (reds instanceof GooglePlus) {

                 GooglePlus GP = (GooglePlus) reds;

                 GP.verificarSenha("1234");
                 GP.postarFoto();
                 GP.compartilhar();
                 GP.curtirPublicacao();
             }

         }catch(SenhaInvalida e) {

             System.out.println(e.getMessage());
         }
        }


    }

}
