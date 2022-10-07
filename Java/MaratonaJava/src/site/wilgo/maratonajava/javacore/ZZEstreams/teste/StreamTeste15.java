package site.wilgo.maratonajava.javacore.ZZEstreams.teste;

import site.wilgo.maratonajava.javacore.ZZEstreams.dominio.Category;
import site.wilgo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import site.wilgo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static site.wilgo.maratonajava.javacore.ZZEstreams.dominio.Promotion.NORMAL_PRICE;
import static site.wilgo.maratonajava.javacore.ZZEstreams.dominio.Promotion.UNDER_PROMOTION;

public class StreamTeste15 {


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

        Map<Category, DoubleSummaryStatistics> collect = lightNovels
                .stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.summarizingDouble(LightNovel::getPrice)));

        System.out.println(collect);

        Map<Category, Set<Promotion>> collect1 = lightNovels
                .stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.mapping(StreamTeste15::getPromotion, Collectors.toSet())));

        System.out.println(collect1);

    }


    private static Promotion getPromotion(LightNovel lightNovel){

        return lightNovel.getPrice() < 6 ? UNDER_PROMOTION :  NORMAL_PRICE;
    }
}
