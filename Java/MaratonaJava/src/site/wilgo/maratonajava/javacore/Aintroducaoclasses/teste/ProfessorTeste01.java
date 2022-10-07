package site.wilgo.maratonajava.javacore.Aintroducaoclasses.teste;

import site.wilgo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Joana";
        professor.idade = 45;
        professor.sexo = 'F';

        System.out.println(professor.nome+ " " + professor.idade+ " anos de idade sexo: "+professor.sexo);
    }
}
