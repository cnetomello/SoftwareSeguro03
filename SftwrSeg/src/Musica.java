public class Musica {
    String titulo;
    double duracao;
    String compositor;

    public Musica(String titulo, double duracao, String compositor) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.compositor = compositor;
    }

    public void tocarMusica() {
        System.out.println("Tocando a música: " + titulo);
    }
}
