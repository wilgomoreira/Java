package site.wilgo.maratonajava.javacore.ZZEstreams.teste;

import site.wilgo.maratonajava.javacore.ZZEstreams.dominio.Category;
import site.wilgo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import site.wilgo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static site.wilgo.maratonajava.javacore.ZZEstreams.dominio.Promotion.NORMAL_PRICE;
import static site.wilgo.maratonajava.javacore.ZZEstreams.dominio.Promotion.UNDER_PROMOTION;

public class StreamTeste16 {

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_000;

        sumFor(num);
        StreamIterate(num);
        ParallelStreamIterate(num);
        LongStreamIterate(num);
        LongParallelStreamIterate(num);
    }

    private static void sumFor(long num){
        System.out.println("SUM FOR");

        long result = 0;
        long init = System.currentTimeMillis();

        for(long i=0; i <= num; i++){
            result += i;
        }

        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end-init) + "ms");

    }

    private static void StreamIterate(long num){
        System.out.println("STREAM ITERATE FOR");

        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end-init) + "ms");

    }

    private static void ParallelStreamIterate(long num){
        System.out.println("PARALLEL STREAM ITERATE FOR");

        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).parallel().limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end-init) + "ms");

    }

    private static void LongStreamIterate(long num){
        System.out.println("LONG STREAM ITERATE FOR");

        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end-init) + "ms");

    }

    private static void LongParallelStreamIterate(long num){
        System.out.println("LONG PARALLEL STREAM ITERATE FOR");

        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end-init) + "ms");

    }

}
