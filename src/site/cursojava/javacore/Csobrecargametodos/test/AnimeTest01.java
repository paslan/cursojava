package site.cursojava.javacore.Csobrecargametodos.test;

import site.cursojava.javacore.Csobrecargametodos.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive", "TV", 12, "Ação");

        anime.imprime();

    }
}
