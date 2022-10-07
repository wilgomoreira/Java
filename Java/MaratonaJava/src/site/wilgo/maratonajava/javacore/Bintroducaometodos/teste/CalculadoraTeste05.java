package site.wilgo.maratonajava.javacore.Bintroducaometodos.teste;

import site.wilgo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] numeros = {1,2,3,45,6};

        calculadora.somaArray(numeros); // forma tradicional de chamar um array

        calculadora.somaVarArgs(numeros);   // forma nova com Varargs, podem ser desta forma ou da forma de baixo
        calculadora.somaVarArgs(1,3,4,5,6);  // outra forma de passar varArgs como array


    }
}
