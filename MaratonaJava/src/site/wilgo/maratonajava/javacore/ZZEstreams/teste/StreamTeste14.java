package site.wilgo.maratonajava.javacore.ZZEstreams.teste;

import site.wilgo.maratonajava.javacore.ZZEstreams.dominio.Category;
import site.wilgo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import site.wilgo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTeste14 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Samurai X", 2.33, Category.FANTASY),
            new LightNovel("Dragon Ball", 4.99, Category.DRAMA),
            new LightNovel("Yokachu", 4.00, Category.FANTASY),
            new LightNovel("Cavaleiros do Zodiaco", 2.99, Category.ROMANCE),
            new LightNovel("Cavaleiros do Zodiaco", 2.99, Category.ROMANCE),
            new LightNovel("Sailormoon", 8.99, Category.FANTASY),
            new LightNovel("Jiraya", 7.99, Category.DRAMA)
    ));

    public static void main(String[] args) {

        //Contar quantos items por categoria
        Map<Category, Long> collect = lightNovels
                .stream()
                .collect((Collectors.groupingBy(LightNovel::getCategory, Collectors.counting())));

        System.out.println(collect);

        //Saber o de maior preço por categoria

        Map<Category, Optional<LightNovel>> collect1 = lightNovels
                .stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.maxBy(
                        Comparator.comparing(LightNovel::getPrice))));

        System.out.println(collect1);


    }

}
