package site.wilgo.maratonajava.javacore.Ycolecoes.teste;

import site.wilgo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import site.wilgo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTeste03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Wil");
        Consumidor consumidor2 = new Consumidor("David");

        Manga manga1 = new Manga(1L,"Dragon Ball",4.55);
        Manga manga2 = new Manga(2L,"Samurai X", 6.77);
        Manga manga3 = new Manga(5L,"Berserk", 6.89);
        Manga manga4 = new Manga(3L,"Yugio",2.56);
        Manga manga5 = new Manga(4L,"Tarzan", 99.0);

        List<Manga> mangaList1 = List.of(manga1, manga2, manga3);
        List<Manga> mangaList2 = List.of(manga4, manga5);


        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();

        consumidorMangaMap.put(consumidor1, mangaList1);
        consumidorMangaMap.put(consumidor2, mangaList2);

        for(Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()){
            System.out.println("--" +entry.getKey().getNome());

            for(Manga manga : entry.getValue()){
                System.out.println("--------" +manga.getNome());
            }
        }
    }
}
