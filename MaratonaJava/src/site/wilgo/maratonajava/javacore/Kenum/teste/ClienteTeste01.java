package site.wilgo.maratonajava.javacore.Kenum.teste;

import site.wilgo.maratonajava.javacore.Kenum.dominio.Cliente;
import site.wilgo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import site.wilgo.maratonajava.javacore.Kenum.dominio.TipoPagamento;


public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Wilgo", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Priscilla", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO); // ALT + ENTER para puxar o import

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calculaDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calculaDesconto(100));

        // chamar o metodo para saber a numeração baseado em algum argumento
        TipoCliente tipoCliente = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");

        System.out.println(tipoCliente);

    }
}
