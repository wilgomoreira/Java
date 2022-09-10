package site.wilgo.maratonajava.javacore.ZZEstreams.teste;

import site.wilgo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// 1. Order lightnovels by title
// 2. Retrieve the first 3 titles lightnovels with price less than 4

public class StreamTeste02 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Samurai X", 2.33),
            new LightNovel("Dragon Ball", 4.99),
            new LightNovel("Yokachu", 4.00),
            new LightNovel("Cavaleiros do Zodiaco", 2.99),
            new LightNovel("Sailormoon", 8.99),
            new LightNovel("Jiraya", 7.99)
    ));


    public static void main(String[] args) {

        List<String> titles = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .toList();      // (substitui, no codigo do professor era collect(Collectors.toList())

        System.out.println(titles);
    }
}
