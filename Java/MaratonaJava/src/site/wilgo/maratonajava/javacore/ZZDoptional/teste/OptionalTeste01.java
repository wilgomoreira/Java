package site.wilgo.maratonajava.javacore.ZZDoptional.teste;

import java.util.List;
import java.util.Optional;

public class OptionalTeste01 {
    public static void main(String[] args) {

        Optional<String> optionalName = findName("Junior");    //Optional encapsula o que esta dentro para evitar exceções e tratar elas
        String vazio = optionalName.orElse("VAZIO");   //opção a mais que ele faz
        System.out.println(vazio);

        optionalName.ifPresent(s -> System.out.println(s.toUpperCase()));
    }

    public static Optional<String> findName(String name){
        List<String> list = List.of("Raimundo", "Kelly");

        int i = list.indexOf(name);

        if(i != -1){
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
