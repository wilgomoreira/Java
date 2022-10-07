package site.wilgo.maratonajava.javacore.ZZEstreams.teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTeste09 {

    public static void main(String[] args) {

        IntStream
                .rangeClosed(1,50)
                .filter(i -> i % 2 == 0)
                .forEach(s -> System.out.print(s + " "));

        System.out.println();
        System.out.println("-------------------");

        IntStream
                .range(1,50)
                .filter(i -> i % 2 == 0)
                .forEach(s -> System.out.print(s + " "));

        System.out.println();
        System.out.println("-------------------");

        Stream.of("O melhor", "Curso", "da intenet")
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s + " "));

        System.out.println();
        System.out.println("-------------------");

        int num[] = {1, 2, 3, 4};

        Arrays.stream(num).average().ifPresent(System.out::println);


        try(Stream<String> lines = Files.lines(Paths.get("teste.txt"))){
            lines.forEach(System.out::println);

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
