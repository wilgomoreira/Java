package site.wilgo.maratonajava.javacore.ZZClambdas.teste;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTeste01 {
    public static void main(String[] args) {
        List<String> strings = List.of("WIL", "GIL", "RITA");

        List<Integer> numeros = List.of(1,4,5,6,7);

        paraCada(strings, (String s) -> System.out.println(s));
        paraCada(numeros, (Integer n) -> System.out.println(n));

    }

    public static <T> void paraCada(List<T> list, Consumer<T> consumer){
        for (T t : list){
            consumer.accept(t);
        }
    }
}
