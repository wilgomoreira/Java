package site.wilgo.maratonajava.javacore.Aintroducaoclasses.teste;

import site.wilgo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();  // variável de referência (estudante) está sendo alocado a um objeto Estudante

        estudante.nome = "Davi";
        estudante.idade = 23;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println(estudante);  // Imprime apenas o endereço de memória da variável de referência estudante
    }

}
