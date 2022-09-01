package site.wilgo.maratonajava.javacore.Ycolecoes.teste;

import site.wilgo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTeste02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga(1,"Dragon Ball",4.55));
        mangas.add(new Manga(2,"Samurai X", 6.77));
        mangas.add(new Manga(5,"Berserk", 6.89));
        mangas.add(new Manga(3,"Yugio",2.56));
        mangas.add(new Manga(4,"Tarzan", 99.0));

        Collections.sort(mangas);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaSearch = new Manga(4, "Tarzan", 99.0);

        System.out.println(Collections.binarySearch(mangas, mangaSearch));
    }
}
