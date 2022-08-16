package site.wilgo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    // ORDEM DE INICIALIZAÇÃO:
    // 1 - Alocado espaço e memória para o objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3 - Bloco de inicialização é criado
    // 4 - Construtor é criado.

    //Bloco de inicialização é executado antes dos metodos e dos construtores. Ele vem entre chaves e pode vim em qualquer
    // linha. Geralmente ele vem depois dos atributos.

    {
        episodios = new int[100];

        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }

    }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime(){

        for(int episodio: this.episodios){
            System.out.print(episodio + " ");
        }

        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
