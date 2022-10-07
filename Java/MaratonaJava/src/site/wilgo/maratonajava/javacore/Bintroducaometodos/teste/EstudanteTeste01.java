package site.wilgo.maratonajava.javacore.Bintroducaometodos.teste;

import site.wilgo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import site.wilgo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.nome = "Joao";
        estudante1.idade = 23;
        estudante1.sexo = 'M';

        estudante2.nome = "Maria";
        estudante2.idade = 26;
        estudante2.sexo = 'F';

        impressora.imprime(estudante1);
        impressora.imprime(estudante2);

        System.out.println("-------------------"); //Mudamos os valores dos atributos do objeto por conta da referência
                                                   // que todo objeto tem essa propriedade

        impressora.imprime(estudante1);
        impressora.imprime(estudante2);

    }
}
