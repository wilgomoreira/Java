package site.wilgo.maratonajava.javacore.Npolimorfismo.servico;

import site.wilgo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import site.wilgo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import site.wilgo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    // Com o polimorfismo conseguimos eleminar todos os esses codigos acoplados
   /* public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatorio de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador: "+computador.getNome());
        System.out.println("Valor: "+computador.getValor());
        System.out.println("Imposto a ser pago de:" +imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatorio de imposto do computador");
        double imposto = tomate.calcularImposto();
        System.out.println("Computador: "+tomate.getNome());
        System.out.println("Valor: "+tomate.getValor());
        System.out.println("Imposto a ser pago de:" +imposto);*/


    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de Imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto:" +produto.getNome());
        System.out.println("Valor: "+produto.getValor());
        System.out.println("Imposto a ser pago de:" +imposto);


        if(produto instanceof Tomate) {        //caso em que o filho tem variaveis a mais e que não tem nos irmãos
            Tomate tomate = (Tomate) produto;    // uso de casting, forçar sem de uma variavel
            System.out.println("Data de Validade é: " + tomate.getDataValidade());
        }

        // Outra forma de escrever o codigo acima
       /* if(produto instanceof Tomate) {        //caso em que o filho tem variaveis a mais e que não tem nos irmãos
            String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println("Data de Validade é: " + dataValidade);
        }*/
    }
}
