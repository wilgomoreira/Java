package site.wilgo.maratonajava.javacore.Npolimorfismo.Teste;

import site.wilgo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import site.wilgo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import site.wilgo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import site.wilgo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Toshiba", 2300);
        Tomate tomate = new Tomate("Vermelho", 3.00);
        Televisao televisao = new Televisao("Yamaha", 2000);

       /* CalculadoraImposto.calcularImpostoComputador(computador);  // codigo acoplado que sera melhorado com o polimorfismo
        System.out.println("-----------------------------------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);*/

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-----------------------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------------------------------------");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
