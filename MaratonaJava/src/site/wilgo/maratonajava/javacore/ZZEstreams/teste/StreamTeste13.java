package site.wilgo.maratonajava.javacore.ZZEstreams.teste;

import site.wilgo.maratonajava.javacore.ZZEstreams.dominio.Category;
import site.wilgo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import site.wilgo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTeste13 {

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
        Map<Object, List<LightNovel>> collect = lightNovels
                .stream()
                .collect(Collectors.groupingBy(ln -> {
                    return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
                }));

        System.out.println(collect);

        // No caso de separar ainda por categoria, se faz um grouping 2x

        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels
                .stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.groupingBy(
                        ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE)));


        System.out.println(collect1);   ///dificil a visualização
    }
}
