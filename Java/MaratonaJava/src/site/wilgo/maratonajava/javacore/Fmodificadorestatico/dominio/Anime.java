package site.wilgo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;   // atributo para classe



   //Como os episodios são iguais para todos os objetos, não precisa que eles sejam inicilizados com cada objeto.
   // colocando a variavel e o bloco com static fazermos com que seja algo da classe, inicializada uma vez e repetida para
   // todos os objetos

    // 0 - O bloco de inicilização é executado quando a JVM carregar a classe, antes mesmo de alocar memoria para as variaveis
    // Isso é antes de tudo por conta do static, que é o primeiro a ser executado
    // Mais de um bloco de inicialização static, ele são inicializados na ordem de cima para baixo

  static{

        System.out.println("Dentro do bloco de Inicialização estatico 1");

        episodios = new int[100];

        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    static{

        System.out.println("Dentro do bloco de Inicialização estatico 2");
    }

    static{

        System.out.println("Dentro do bloco de Inicialização estatico 3");

    }

    {  // Não estatico é executado toda vez que o objeto é criado, o que é ruim pro processamento do PC
        // se for uma variavel comum para todos os objetos

        System.out.println("Dentro do bloco de Inicialização não estatico 3");

    }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime(){

        for(int episodio: Anime.episodios){
            System.out.print(episodio + " ");
        }

        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return Anime.episodios;
    }
}
