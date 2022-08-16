package site.wilgo.maratonajava.javacore.Lclassesabstratas.Teste;

import site.wilgo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import site.wilgo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import site.wilgo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
       // Funcionario funcionario = new Funcionario("Rai", 20000); // classe abstrata não pode ser instanciada
        Gerente gerente = new Gerente("Savio", 30000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Wil",6000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);

        gerente.imprime();
        desenvolvedor.imprime();
    }
}
