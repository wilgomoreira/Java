package site.wilgo.maratonajava.javacore.ZZEstreams.teste;

import site.wilgo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

// 1. Order lightnovels by title
// 2. Retrieve the first 3 titles lightnovels with price less than 4

public class StreamTeste03 {

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

        //lightNovels.stream().forEach(System.out::println);      NUNCA USAR ISSO PARA IMPRIMIR, AO INVES DISSO :

        lightNovels.forEach(System.out::println);     // jeito correto de imprimir

        Stream<LightNovel> stream = lightNovels.stream();

        //long count = stream.filter(ln -> ln.getPrice() <= 4).count();  // conta tudo independente se tem repetidos
        //System.out.println(count);

        //long countDistinct = stream.distinct().filter(ln -> ln.getPrice() <= 4).count();  // da erro por que um stream fechada não pode ser utilizada
        //para corrigir isso:
        //long countDistinct = lightNovels.stream().distinct().filter(ln -> ln.getPrice() <= 4).count();

        // outra forma de fazer: (os outros precisam estar comentados acima)
        long countDistinct = stream
                .distinct()
                .filter(ln -> ln.getPrice() <= 4)
                .count();

        System.out.println(countDistinct);

    }
}
