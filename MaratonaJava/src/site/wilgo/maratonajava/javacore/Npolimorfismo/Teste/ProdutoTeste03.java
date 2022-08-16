package site.wilgo.maratonajava.javacore.Npolimorfismo.Teste;

import site.wilgo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import site.wilgo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import site.wilgo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import site.wilgo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Sony", 7000);  //Polimorfismo

        Tomate tomate = new Tomate("Verde", 20);
        tomate.setDataValidade("11/03/2025");   // atributo a mais que não tem nos irmãos

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------------------------");
        CalculadoraImposto.calcularImposto(produto);


    }
}
