package site.wilgo.maratonajava.javacore.HHeranca.Teste;

import site.wilgo.maratonajava.javacore.HHeranca.dominio.Endereco;
import site.wilgo.maratonajava.javacore.HHeranca.dominio.Funcionario;
import site.wilgo.maratonajava.javacore.HHeranca.dominio.Pessoa;

// Evitar usar herança, pois o codigo fica fortemente acoplado, ou seja, qualquer alteração em uma classe passa para outra
// e sempre é bom deixar o codigo desacoplado.

// No Java não existe herença multipla, ou seja, uma classe filha herdando de vários pais diferentes.

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();

        endereco.setRua("Rua 3");
        endereco.setCep("8798789");

        Pessoa pessoa = new Pessoa("Rafael");
        pessoa.setCpf("78246237");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("------------------------------------");

        Funcionario funcionario = new Funcionario("Junior");
        funcionario.setCpf("34567774");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(23450);

        funcionario.imprime();
    }
}
