package site.wilgo.maratonajava.javacore.Gassossiacao.teste;

import site.wilgo.maratonajava.javacore.Gassossiacao.dominio.Aluno;
import site.wilgo.maratonajava.javacore.Gassossiacao.dominio.Local;
import site.wilgo.maratonajava.javacore.Gassossiacao.dominio.Professor;
import site.wilgo.maratonajava.javacore.Gassossiacao.dominio.Seminario;

public class ExercicioTeste01 {
    public static void main(String[] args) {
        Local local = new Local("Aracaju");  // Começa por ela por não ter nenhuma dependência (com nenhuma classe)
        Aluno aluno = new Aluno("Henrique", 23);
        Professor professor = new Professor("Roberto Carlos","Fisica");
        Seminario seminario = new Seminario("Congresso Brasileiro");

        Aluno[] alunos = new Aluno[]{};
        Seminario[] seminarios = new Seminario[]{seminario};

        aluno.setSeminario(seminario);   // 1 aluno podera estar apenas em 1 seminário
        seminario.setLocal(local);           // 1 seminário téra um local
        seminario.setAlunos(alunos);     // 1 seminario poderá ter vários alunos
        professor.setSeminarios(seminarios); // 1 professor poderá ministrar vários seminários


        System.out.println("------------------------------");

        professor.imprime();

    }

}
