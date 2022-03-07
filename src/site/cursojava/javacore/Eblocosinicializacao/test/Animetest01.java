package site.cursojava.javacore.Eblocosinicializacao.test;

import site.cursojava.javacore.Eblocosinicializacao.domain.Anime;

public class Animetest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        for (int episodio:anime.getEpisodios()) {
            System.out.print(episodio+" ");
        }
    }
}
