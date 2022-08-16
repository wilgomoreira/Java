package site.wilgo.maratonajava.javacore.Bintroducaometodos.teste;

import site.wilgo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.divideDoisNumeros(10,0);

        System.out.println(resultado);

        System.out.println("------------------------------");

        calculadora.imprimeDivisaoDoisNumeros(20,3);
    }
}
