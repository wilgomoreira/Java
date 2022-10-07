package site.wilgo.maratonajava.javacore.ZZClambdas.teste;

import site.wilgo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import site.wilgo.maratonajava.javacore.ZZClambdas.service.AnimeComparatores;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTeste03 {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>(List.of("Carlos", "Edmundo", "Bruno", "Andre"));

        nomes.sort(String::compareTo);
        System.out.println(nomes);

        Function<String, Integer> tranformStringInt = Integer::parseInt;

        Integer num = tranformStringInt.apply("10");
        System.out.println(num);

        BiPredicate<List<String>, String> checkName = List::contains;
        Boolean isFound = checkName.test(nomes,"Edmundo");
        System.out.println(isFound);

    }

}
