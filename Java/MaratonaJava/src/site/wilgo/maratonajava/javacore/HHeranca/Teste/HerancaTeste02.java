package site.wilgo.maratonajava.javacore.HHeranca.Teste;

import site.wilgo.maratonajava.javacore.HHeranca.dominio.Funcionario;

public class HerancaTeste02 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Rodolfo");

        // Ordem que o programa é inicializado com herança, blocos de inicialização estático e não estatico e construtores

        /*Dentro do bloco de inicializa��o Estatico de Pessoa  (superclass)
        Dentro do bloco de inicializa��o Estatico de Funcionario (subclass)***** observação nessa aqui
        Dentro do bloco de inicializa��o N�o Estatico de Pessoa 1 (superclass)
        Dentro do bloco de inicializa��o N�o Estatico de Pessoa 2 (superclass)
        Dentro do construtor de Pessoa (superclass)
        Dentro do bloco de inicializa��o N�o Estatico de Funcionario 1 (subclass)
        Dentro do bloco de inicializa��o N�o Estatico de Funcionario 2 (subclass)
        Dentro  do Construtor da classe Funcionario  (subclass) */
    }
}
