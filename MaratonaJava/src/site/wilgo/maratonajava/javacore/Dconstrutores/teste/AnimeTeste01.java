package site.wilgo.maratonajava.javacore.Dconstrutores.teste;

import site.wilgo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Maike","TV", 12,"ACAO", "Production IG");   // usando o construtor da classe
        Anime anime2 = new Anime();
        anime.imprime();
    }
}
