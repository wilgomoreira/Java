package site.wilgo.maratonajava.javacore.ZZClambdas.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTeste02 {

    public static void main(String[] args) {

        List<String> nomes = List.of("Cavaleiro", "Chineses", "Rai");

        // List<Integer> tamanhos = map(nomes, (String s) -> s.length());
        List<Integer> tamanhos = map(nomes, String::length);   // outra forma de fazer usando o Method Reference

        System.out.println(tamanhos);

        //List<String> maiusculas = map(nomes, (String s) -> s.toUpperCase());
        List<String> maiusculas = map(nomes, String::toUpperCase);   // outra forma de fazer usando o Method Reference

        System.out.println(maiusculas);

    }

    public static <T,R> List<R> map(List<T> list, Function<T,R> function){
        List<R> result = new ArrayList<>();

        for(T t : list){
            R r = function.apply(t);
            result.add(r);
        }

        return result;
    }
}
