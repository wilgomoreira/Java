package site.wilgo.maratonajava.javacore.Ycolecoes.teste;

import site.wilgo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


// para casos em que se deseja mudar a variavel de comparação, criar uma classe somente para isso

class MangaById implements Comparator<Manga> {   // usa-se o comparator nesse casos ao inves do comparable

    @Override
    public int compare(Manga o1, Manga o2) {
        return o1.getId().compareTo(o2.getId());
    }
}

public class MangaSortTeste01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga(1,"Dragon Ball",4.55));
        mangas.add(new Manga(2,"Samurai X", 6.77));
        mangas.add(new Manga(5,"Berserk", 6.89));
        mangas.add(new Manga(3,"Yugio",2.56));
        mangas.add(new Manga(4,"Tarzan", 99.0));

        System.out.println("LISTA DESORDENADA=============================================");
        for (Manga manga : mangas) {
            System.out.println(manga);

        }

        System.out.println("\nORDENADA POR NOME======================================");
        Collections.sort(mangas);

        for (Manga manga : mangas) {
            System.out.println(manga);

        }

        System.out.println("\nORDENADA POR ID======================================");
        // Collections.sort(mangas, new MangaById());  // ou
        mangas.sort(new MangaById());

        for (Manga manga : mangas) {
            System.out.println(manga);

        }
    }
}
