package site.wilgo.maratonajava.javacore.Bintroducaometodos.teste;

import site.wilgo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros();

        System.out.println("Finalizando");
        calculadora.subtrairDoisNumeros();
    }

}
