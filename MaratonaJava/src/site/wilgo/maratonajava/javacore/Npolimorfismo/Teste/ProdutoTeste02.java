package site.wilgo.maratonajava.javacore.Npolimorfismo.Teste;

import site.wilgo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import site.wilgo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import site.wilgo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Sony", 7000);  //Polimorfismo
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        System.out.println("----------------------------");

        Produto produto2 = new Tomate("Verde", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
        System.out.println("----------------------------");





    }
}
