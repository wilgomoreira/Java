package site.wilgo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {

    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    //Sobrecarga de metodos é quando usa o mesmo nome de um metodo, porém com numero de paramentos diferentes ou
    // tipos diferentes

    public void init(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void init(String nome, String tipo, int episodios, String genero){
        this.init(nome,tipo,episodios); // chamando a função init para não repetir o codígo.
        this.genero = genero;
    }


    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }


    // Metodos SET e GET geralmente ficam no final, nunca no começo, a importância se da pelos metodos que estão no começo
    // Há um atalho para gerar elas automaticamente (ALT INSERT)


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
