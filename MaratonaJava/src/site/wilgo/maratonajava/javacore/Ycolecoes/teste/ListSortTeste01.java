package site.wilgo.maratonajava.javacore.Ycolecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTeste01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);

        mangas.add("Dragon Ball");
        mangas.add("Samurai X");
        mangas.add("Berserk");
        mangas.add("Yugio");
        mangas.add("Tarzan");

        Collections.sort(mangas);

        for (String manga: mangas){
            System.out.println(manga);
        }

        List<Double> dinheiros = new ArrayList<>();

        dinheiros.add(34.56);
        dinheiros.add(21.232);
        dinheiros.add(45.554);
        dinheiros.add(19.34);

        Collections.sort(dinheiros);

        System.out.println(dinheiros);

    }
}
