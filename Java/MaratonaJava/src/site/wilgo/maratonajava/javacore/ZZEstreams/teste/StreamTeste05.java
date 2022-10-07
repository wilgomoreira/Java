package site.wilgo.maratonajava.javacore.ZZEstreams.teste;

import java.util.Arrays;
import java.util.List;

public class StreamTeste05 {
    public static void main(String[] args) {
        List<String> palavras = List.of("Gok", "u", "_mui", "to_forte");

        String[] letras = palavras.get(1).split("");

        System.out.println(Arrays.toString(letras));

       List<String> letras2 = palavras.stream()
                .map(p -> p.split(""))
                .flatMap(Arrays::stream)
                .toList();


        System.out.println(letras2);

    }
}
