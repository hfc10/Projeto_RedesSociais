package RedeSocial;

import Excecoes.SenhaInvalida;
import Excecoes.UsuarioNaoEncontrado;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<RedeSocial> redes1 = new HashSet<RedeSocial>();
        Set<RedeSocial> redes2 = new HashSet<RedeSocial>();

        // senha certas e funçoes executadas

       try{

           redes1.add(new Facebook("12345",1100));
           redes1.add(new GooglePlus("1234", 400));

           Usuario usuario1 = new Usuario("Pedro", "pedro567@gmail.com", redes1);
           usuario1.usandoAsRedes();


       }catch (SenhaInvalida e) {

           System.out.println("Erro de senha: " + e.getMessage());
       }


       // erro de senha

        try{

            redes2.add(new Instagram("12313" ,500));

            Usuario usuario2 = new Usuario("Pedro2", "pedro123@gmail.com", redes2);
            usuario2.usandoAsRedes();


        }catch (SenhaInvalida e) {

            System.out.println("Erro de senha: " + e.getMessage());
        }


        // erro de usuario nulo

       try{

           Usuario usuario2 = new Usuario("Henrique", "henrique568@gmail.com", null);

       }catch(UsuarioNaoEncontrado e){

           System.out.println("Erro de usuario: " + e.getMessage());

        }

    }
}