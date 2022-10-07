package site.wilgo.maratonajava.javacore.ZZEstreams.teste;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTeste10 {
    public static void main(String[] args) {
        Stream
                .iterate(1, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);

        //sequence de Fibonnaci

        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...

        System.out.println("-----------------------------");

        Stream
                .iterate(new int[]{0, 1}, n -> new int[] {n[1], n[0] + n[1]})
                .limit(10)
                .map(a -> a[0])
                .forEach(System.out::println);

        System.out.println("-----------------------------");

        ThreadLocalRandom random = ThreadLocalRandom.current();

        Stream
                .generate(() -> random.nextInt(1, 1000))
                .limit(10)
                .forEach(s -> System.out.print(s + " "));
    }
}
