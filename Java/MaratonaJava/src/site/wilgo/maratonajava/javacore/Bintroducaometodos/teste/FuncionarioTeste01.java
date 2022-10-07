package site.wilgo.maratonajava.javacore.Bintroducaometodos.teste;

import site.wilgo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Rafael");
        funcionario.setIdade(23);
        funcionario.setSalario(new double[]{200, 300, 400});

        funcionario.imprime();
    }
}
