package site.wilgo.maratonajava.javacore.ZZEstreams.teste;

import site.wilgo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTeste08 {
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

        lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(ln -> ln > 5)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        // outra forma de fazer para evitar de usar o Wrap de DOUBLE para double que Java usa nas funções acima

        double sum = lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(ln -> ln > 3)
                .sum();

        System.out.println(sum);

    }
}
