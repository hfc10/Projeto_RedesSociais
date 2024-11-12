package RedeSocial;

public class Facebook extends RedeSocial implements Compartilhamento, VideoConferencia {


    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {

        System.out.println("Postou uma foto no Facebook");

    }

    @Override
    public void postarVideo() {

        System.out.println("Postou um video no Facebook");

    }

    @Override
    public void postarComentario() {

        System.out.println("Postou um comentario no Facebook");

    }

    @Override
    public void fazStreaming() {

        System.out.println("Realizando uma live no Facebook");

    }

    @Override
    public void compartilhar() {

        System.out.println("Compartilhou um post no Facebook");

    }

}
