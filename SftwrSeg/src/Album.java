import java.util.ArrayList;

public class Album {
    String genero;
    int ano;
    String nome;
    String artista;
    ArrayList<Musica> musicas;

    public Album(String genero, int ano, String nome, String artista, ArrayList<Musica> musicas) {
        this.genero = genero;
        this.ano = ano;
        this.nome = nome;
        this.artista = artista;
        this.musicas = musicas;
    }

    public void mostraTodosOsDados() {
        System.out.println("Gênero - " + genero);
        System.out.println("Ano - " + ano);
        System.out.println("Nome - " + nome);
        System.out.println("Artista - " + artista);
        System.out.println("Músicas -");
for (Musica musica : musicas) {
            System.out.println("Título: " + musica.titulo);
            System.out.println("Duração: " + musica.duracao);
            System.out.println("Compositor: " + musica.compositor);
        }
    }
}
