import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa:");
        String nomePessoa = scanner.nextLine();
        System.out.println("Digite a idade da pessoa:");
        int idadePessoa = scanner.nextInt();
        scanner.nextLine();

        Pessoa pessoa = new Pessoa(nomePessoa, idadePessoa);

        System.out.println("Digite o título da música:");
        String nomeMusica = scanner.nextLine();
        System.out.println("Digite a duração da música em minutos:");
        double duracaoMusica = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite o compositor da música:");
        String compositor = scanner.nextLine();

        Musica musica = new Musica(nomeMusica, duracaoMusica, compositor);

        ArrayList<Musica> musicasAlbum = new ArrayList<>();
        musicasAlbum.add(musica);

        System.out.println("Digite o gênero do álbum:");
        String generoAlbum = scanner.nextLine();
        System.out.println("Digite o ano do álbum:");
        int anoAlbum = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o nome do álbum:");
        String nomeAlbum = scanner.nextLine();
        System.out.println("Digite o nome do artista do álbum:");
        String artistaAlbum = scanner.nextLine();

        Album album = new Album(generoAlbum, anoAlbum, nomeAlbum, artistaAlbum, musicasAlbum);

        System.out.println("\nDados do álbum:");
        album.mostraTodosOsDados();

        scanner.close();
    }
}
