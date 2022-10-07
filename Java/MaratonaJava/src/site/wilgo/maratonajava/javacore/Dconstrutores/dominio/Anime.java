package site.wilgo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {

    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;


    // Uso de um construtor, o padrão é esse abaixo. Ele é a primeira coisa a ser inicializada.
    // Para chamar o contrustor é através do this(), ele so pode ser usado dentro de construtores e tem que ser
    // obrigatoriamente a primeira linha

    public Anime(String nome, String tipo, int episodios, String genero){
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodios, String genero, String estudio){
        this(nome, tipo, episodios,genero);
        this.estudio = estudio;
    }

    // uso de sobrecarga de construtores, com um construtor que não recebe parametro
    public Anime(){

    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }


    // Metodos SET e GET geralmente ficam no final, nunca no começo, a importância se da pelos metodos que estão no começo


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }

    public int getEpisodios(){
        return this.episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
