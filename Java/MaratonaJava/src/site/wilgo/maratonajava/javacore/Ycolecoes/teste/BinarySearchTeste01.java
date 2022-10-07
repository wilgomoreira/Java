package site.wilgo.maratonajava.javacore.Ycolecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTeste01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(2);
        numeros.add(4);
        numeros.add(3);
        numeros.add(1);
        numeros.add(0);

        // Binary Search pode retornar (-(ponto de inserção) - 1) quando nao acha o index daquele valor
        // sempre ordenar a lista antes de usar o Binary Search

        Collections.sort(numeros);
        System.out.println(Collections.binarySearch(numeros, 2));  // retorna 2, ou seja, encontro o valor na lista
        System.out.println(Collections.binarySearch(numeros, 8)); // retorna -6, ou seja, não encontrou o valor na lista
    }
}
