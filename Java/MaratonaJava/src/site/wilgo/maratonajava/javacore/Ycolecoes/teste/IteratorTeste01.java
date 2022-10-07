package site.wilgo.maratonajava.javacore.Ycolecoes.teste;

import site.wilgo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTeste01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga(1L,"Dragon Ball",4.55, 0));
        mangas.add(new Manga(2L,"Samurai X", 6.77, 2));
        mangas.add(new Manga(5L,"Berserk", 6.89, 0));
        mangas.add(new Manga(3L,"Yugio",2.56, 5));
        mangas.add(new Manga(4L,"Tarzan", 99.0, 0));

        // para remover um item da lista, usar o iterator para checar primeiro antes da remorção

        Iterator<Manga> mangaIterator = mangas.iterator();

        while(mangaIterator.hasNext()){
            Manga manga = mangaIterator.next();
            if(manga.getQuantidade() == 0){
                mangaIterator.remove();
            }
        }
        System.out.println(mangas);

        //utilizando outra forma de fazer (programação funcional) para remover um item

        mangas.removeIf( item -> item.getQuantidade() == 2);

        System.out.println(mangas);

    }
}
