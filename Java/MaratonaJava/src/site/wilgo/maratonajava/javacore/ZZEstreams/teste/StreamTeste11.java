package site.wilgo.maratonajava.javacore.ZZEstreams.teste;

import site.wilgo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTeste11 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Samurai X", 2.33),
            new LightNovel("Dragon Ball", 4.99),
            new LightNovel("Yokachu", 4.00),
            new LightNovel("Cavaleiros do Zodiaco", 2.99),
            new LightNovel("Cavaleiros do Zodiaco", 2.99),
            new LightNovel("Sailormoon", 8.99),
            new LightNovel("Jiraya", 7.99)
    ));

    public static void main(String[] args) {
        System.out.println(lightNovels.stream().count());
        System.out.println(lightNovels.stream().collect(Collectors.counting()));

        lightNovels
                .stream()
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);

        lightNovels
                .stream()
                .collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)))
                .ifPresent(System.out::println);

        System.out.println(lightNovels
                .stream()
                .mapToDouble(LightNovel::getPrice)
                .sum());

        System.out.println(lightNovels
                .stream()
                .collect(Collectors.summingDouble(LightNovel::getPrice)));

        DoubleSummaryStatistics collect = lightNovels
                .stream()
                .collect(Collectors.summarizingDouble(LightNovel::getPrice));

        System.out.println(collect);

        String collect1 = lightNovels
                .stream()
                .map(LightNovel::getTitle)
                .collect(Collectors.joining(", "));

        System.out.println(collect1);

    }
}
