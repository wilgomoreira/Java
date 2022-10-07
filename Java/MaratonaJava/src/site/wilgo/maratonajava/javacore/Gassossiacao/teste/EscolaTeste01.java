package site.wilgo.maratonajava.javacore.Gassossiacao.teste;

import site.wilgo.maratonajava.javacore.Gassossiacao.dominio.Escola;
import site.wilgo.maratonajava.javacore.Gassossiacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Carlos", "Fisica");
        Professor professor2 = new Professor("José", "Portugues");
        Professor[] professores = {professor1,professor2};
        Escola escola = new Escola("SESC", professores);

        escola.imprime();


    }
}
