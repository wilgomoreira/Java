
import java.util.ArrayList;
import java.util.function.Consumer;


public class teste {

    public static void main(String[] args) {
        

        ArrayList<String> carros = new ArrayList<>();

        carros.add("Polo");
        carros.add("Passat");
        carros.add("Vectra");
        carros.add("Fusca");

        Consumer<String> imprimir = item -> System.out.println(item);

        carros.stream().sorted().findFirst().ifPresent(System.out::println);

    }
}