package site.wilgo.maratonajava.javacore.ZZEstreams.teste;

import java.util.List;

public class StreamTeste07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(2, 3, 4, 5);

        integers.stream().reduce((x,y) -> x+y).ifPresent(System.out::println);
        // caso coloque um valor inicial, não é necessário OPTIONAL
        System.out.println(integers.stream().reduce(0, (x,y) -> x+y));

        // usando reference
        integers.stream().reduce(Integer::sum).ifPresent(System.out::println);
        // caso coloque um valor inicial, não é necessário OPTIONAL
        System.out.println(integers.stream().reduce(0,Integer::sum));

        System.out.println("-------------------MULTIPLICAÇÃO------------------------");

        // MULTIPLICAÇÃO NÃO TEM REFERENCE NO INTEGERS
        integers.stream().reduce( (x,y) -> x*y).ifPresent(System.out::println);
        // caso coloque um valor inicial, não é necessário OPTIONAL
        System.out.println(integers.stream().reduce(1, (x,y) -> x*y));

        System.out.println("-------------------MAXIMO VALOR------------------------");
        integers.stream().reduce((x,y) -> x > y ? x : y).ifPresent(System.out::println);
        // caso coloque um valor inicial, não é necessário OPTIONAL
        System.out.println(integers.stream().reduce(0, (x,y) -> x > y ? x : y));

        // usando reference
        System.out.println("JEITINHO MELHOR");
        integers.stream().reduce(Integer::max).ifPresent(System.out::println);
        // caso coloque um valor inicial, não é necessário OPTIONAL
        System.out.println(integers.stream().reduce(0,Integer::max));

    }
}
