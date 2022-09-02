package site.wilgo.maratonajava.javacore.Ycolecoes.teste;

import site.wilgo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import site.wilgo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.*;

class SmartphoneComparator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTeste01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneComparator());

        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);

        System.out.println(set);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaComparator());
        mangas.add(new Manga(1L,"Dragon Ball",4.55, 0));
        mangas.add(new Manga(2L,"Samurai X", 6.77, 2));
        mangas.add(new Manga(5L,"Berserk", 6.89, 0));
        mangas.add(new Manga(3L,"Yugio",2.56, 5));
        mangas.add(new Manga(4L,"Tarzan", 99.0, 0));
        mangas.add(new Manga(4L,"Tarzan", 99.0, 0));  // ele não permite entrar valores duplicados

        System.out.println("==============================================");

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        // Usar metodos que encontram obejtos logo abaixo ou acima do objeto em questão:
        // lower <
        // floor <=
        // higher >
        // ceiling >=

        Manga erupe = new Manga(4L,"Erupe", 19.0, 2);

        System.out.println("==============================================");
        System.out.println(mangas.lower(erupe));
        System.out.println(mangas.floor(erupe));
        System.out.println(mangas.higher(erupe));
        System.out.println(mangas.ceiling(erupe));



    }
}
