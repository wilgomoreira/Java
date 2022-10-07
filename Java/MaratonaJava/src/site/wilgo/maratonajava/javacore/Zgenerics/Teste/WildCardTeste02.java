package site.wilgo.maratonajava.javacore.Zgenerics.Teste;


import java.util.List;

public class WildCardTeste02 {
    public static void main(String[] args) {

        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());

        printConsulta(cachorros);
        printConsulta(gatos);

    }

    // o simbolo wildcard é o ponto de exclamação

    public static void printConsulta(List<? extends Animal> animals){   //so podendo ser usado para consulta
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    public static void printConsultaAnimal(List<? super Animal> animals){ // para add elementos, pega-se a classe mais acima, generica
        animals.add(new Cachorro());
        animals.add(new Gato());

    }
}
