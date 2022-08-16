package site.wilgo.maratonajava.javacore.Bintroducaometodos.teste;

import site.wilgo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTeste01 {      //Acoplamento é o quanto uma classe sabe da outra e são dependentes
                                  // é bom ter baixo acoplamento.
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Davi");
        pessoa.setIdade(25);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
