package site.wilgo.maratonajava.javacore.ZZClambdas.service;

import site.wilgo.maratonajava.javacore.ZZClambdas.dominio.Anime;

public class AnimeComparatores {

        public static int compareByTitle(Anime a1, Anime a2){
            return a1.getTitle().compareTo(a2.getTitle());
        }

        public static int compareByEpisodes(Anime a1, Anime a2){
            return Integer.compare(a1.getEpisodies(), a2.getEpisodies());
        }

        public int compareByEpisodesNoStatic(Anime a1, Anime a2){
            return Integer.compare(a1.getEpisodies(), a2.getEpisodies());
        }
}
