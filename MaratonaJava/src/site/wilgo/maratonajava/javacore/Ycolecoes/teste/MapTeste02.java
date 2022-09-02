package site.wilgo.maratonajava.javacore.Ycolecoes.teste;

import site.wilgo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import site.wilgo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTeste02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Wil");
        Consumidor consumidor2 = new Consumidor("David");

        System.out.println(consumidor1);

        Manga manga1 = new Manga(1L,"Dragon Ball",4.55);
        Manga manga2 = new Manga(2L,"Samurai X", 6.77);
        Manga manga3 = new Manga(5L,"Berserk", 6.89);
        Manga manga4 = new Manga(3L,"Yugio",2.56);
        Manga manga5 = new Manga(4L,"Tarzan", 99.0);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga3);
        consumidorManga.put(consumidor2, manga2);

        System.out.println("=======================================");

        for(Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey().getNome() +" : "+ entry.getValue().getNome());
        }
    }
}
