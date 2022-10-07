package site.wilgo.maratonajava.javacore.Ycolecoes.teste;

import java.util.ArrayList;
import java.util.List;

public class ListTeste01 {
    public static void main(String[] args) {

        //List é uma inferface generica que tem várias classes abaixo dela, uma delas é a ArrayList
        List<String> nomes = new ArrayList<>();  //capacidade inicial é 16, que vai aumentando a medida que vai se usando além desse limite

        nomes.add("Schumacher");
        nomes.add("Michael");

        List<String> nomes2 = new ArrayList<>();

        nomes2.add("Emerson");
        nomes2.add("Fittipaldi");

        // add duas listas

        nomes.addAll(nomes2);
        System.out.println(nomes);

        // para varrer a lista tem 2 formas e que são já conhecidas as formas:

        for(String nome: nomes){
            System.out.println(nome);
        }

        nomes.add("Rubinho");

        // segunda forma:

        for (int i=0; i< nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

        // usar sempre classes Wraps, nunca variaveis primitivas para criar as listas
        List<Integer> numeros = new ArrayList<>(3); // com capacidade inicial para 3 números
        numeros.add(1);
        System.out.println(numeros);

    }
}
