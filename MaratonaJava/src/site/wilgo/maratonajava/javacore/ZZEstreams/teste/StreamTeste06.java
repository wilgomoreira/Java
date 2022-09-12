package site.wilgo.maratonajava.javacore.ZZEstreams.teste;

import site.wilgo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTeste06 {

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
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() >4));  //retorna um boolean para determinada condição
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 4));
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() > 15));

        lightNovels.stream().filter(ln -> ln.getPrice() > 4).findAny().ifPresent(System.out::println);   // findAny retorna um Optional, o que podemos tratar depois

//        lightNovels.stream()
//                .filter(ln -> ln.getPrice() > 4)
//                .sorted(Comparator.comparing(LightNovel::getPrice))
//                .findFirst()
//                .ifPresent(System.out::println);

        // outra forma de fazer:

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 4)
                .min(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);

        //----------------------------------------------------------------------

        /*lightNovels.stream()
                .filter(ln -> ln.getPrice() > 4)
                .sorted(Comparator.comparing(LightNovel::getPrice).reversed())
                .findFirst()
                .ifPresent(System.out::println);*/

        //outra forma de fazer

        lightNovels.stream()
                .filter(ln -> ln.getPrice() >4)
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);

    }
}
