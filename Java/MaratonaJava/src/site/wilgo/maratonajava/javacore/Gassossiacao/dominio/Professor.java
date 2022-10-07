package site.wilgo.maratonajava.javacore.Gassossiacao.dominio;

public class Professor {
    private String nome;   // Uma escola pode ter muitos professores, mas 1 professor só pode ter uma escola
                              //  (relacionamento de muitos para 1). Você através da escola pega os professores.

    private String especialidade;
    private Seminario[] seminarios;


    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println("-----PROFESSOR-------");
        System.out.println("Nome: "+this.getNome());

        if(this.seminarios == null) return;

        System.out.println("-------SEMINARIO CADASTRADO-------");

        for (Seminario seminario : this.seminarios) {
            System.out.println("Seminario: "+seminario.getTitulo());
            System.out.println("Endereço: "+seminario.getLocal().getEndereco());

            if(seminario.getAlunos() == null || seminario.getAlunos().length == 0)  continue;

            System.out.println("-------ALUNOS--------");

            for (Aluno aluno : seminario.getAlunos()){
                System.out.println("Aluno: "+aluno.getNome());
                System.out.println("Idade: "+aluno.getIdade());
            }
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
