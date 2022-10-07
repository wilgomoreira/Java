package site.wilgo.maratonajava.javacore.Isobrescrita.dominio;

public class Anime extends Object {     // Classe que todos os objetos são filhos, mas não é explicito e nem precisa estar
    private String nome;

    public Anime(String nome) {
        this.nome = nome;
    }


    // Pode ser acessado para imprimir o objeto atraves do ALT + INSERT escolhendo o metodo toString
    // Metodo da classe pai de Object que será sobrescrito
    @Override     // usado para dar certeza que esta sobrescrevendo o metodo @override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                '}';
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
