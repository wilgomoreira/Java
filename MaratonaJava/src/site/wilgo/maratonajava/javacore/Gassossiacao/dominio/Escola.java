package site.wilgo.maratonajava.javacore.Gassossiacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professores;   // Relação de muitos para 1. Uniderecional
    // A escola conhece e tem muitos professores. A relação inversa não é possível


    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprime(){
        System.out.println((this.nome));
        if(professores == null) return;
        for (Professor professor: this.professores) {
            System.out.println(professor.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
