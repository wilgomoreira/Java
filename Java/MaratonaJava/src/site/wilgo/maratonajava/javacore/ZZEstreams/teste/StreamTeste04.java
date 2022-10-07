package site.wilgo.maratonajava.javacore.ZZEstreams.teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTeste04 {

    public static void main(String[] args) {

        List<List<String>> colegioDeoclecio = new ArrayList<>();

        List<String> professores = List.of("Mauricio", "Barata", "Sandro");
        List<String> diretores = List.of("Dona Angela", "Seu Acrisio");
        List<String> alunos = List.of("Kelly", "Henrique", "Dayane");

        colegioDeoclecio.add(professores);
        colegioDeoclecio.add(diretores);
        colegioDeoclecio.add(alunos);

        for(List<String> people : colegioDeoclecio){
            for(String person : people){
                System.out.println(person);
            }
        }
        System.out.println("-----------------------------------");

        // uso de flatMap para retirar elementos dentros de outros, que é o caso, lista de lista

        colegioDeoclecio.stream().flatMap(Collection::stream).forEach(System.out::println);

    }
}
