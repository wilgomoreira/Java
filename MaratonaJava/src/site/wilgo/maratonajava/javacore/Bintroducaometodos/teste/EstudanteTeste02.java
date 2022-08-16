package site.wilgo.maratonajava.javacore.Bintroducaometodos.teste;

import site.wilgo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTeste02 {     //Neste exemplo não estamos usando uma classe para imprimir.
                                    // Estamos usando um metodo imprimir dentro da propria classe
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Joao";
        estudante1.idade = 23;
        estudante1.sexo = 'M';

        estudante2.nome = "Maria";
        estudante2.idade = 26;
        estudante2.sexo = 'F';

        estudante1.imprime();
        estudante2.imprime();
    }
}
