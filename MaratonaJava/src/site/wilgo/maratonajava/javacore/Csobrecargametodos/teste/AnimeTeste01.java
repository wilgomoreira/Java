package site.wilgo.maratonajava.javacore.Csobrecargametodos.teste;

import site.wilgo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Akuma Drive", "TV", 12, "Acao");
        anime.imprime();
    }
}
