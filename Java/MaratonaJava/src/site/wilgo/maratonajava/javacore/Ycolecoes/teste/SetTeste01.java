package site.wilgo.maratonajava.javacore.Ycolecoes.teste;

import site.wilgo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTeste01 {
    public static void main(String[] args) {


        Set<Manga> mangas = new HashSet<>();   // não existe index na classe Hash e não tem ordem
        mangas.add(new Manga(1L,"Dragon Ball",4.55, 0));
        mangas.add(new Manga(2L,"Samurai X", 6.77, 2));
        mangas.add(new Manga(5L,"Berserk", 6.89, 0));
        mangas.add(new Manga(3L,"Yugio",2.56, 5));
        mangas.add(new Manga(4L,"Tarzan", 99.0, 0));
        mangas.add(new Manga(4L,"Tarzan", 99.0, 0));  // ele não permite entrar valores duplicados

        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}
