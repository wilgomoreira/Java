package site.wilgo.maratonajava.javacore.ZZClambdas.teste;

import org.w3c.dom.ls.LSOutput;
import site.wilgo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import site.wilgo.maratonajava.javacore.ZZClambdas.service.AnimeComparatores;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTeste01 {

    public static void main(String[] args) {

        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Pokemon", 500), new Anime("One Piece", 900),new Anime("Naruto", 350)));

        // Collections.sort(animeList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        // animeList.sort( (a1,a2) -> a1.getTitle().compareTo(a2.getTitle()));

        // usado method reference, a linha de cima não pode usar por que ela chama dois metodos,e o method reference precisa de 1 uma classe com apenas um metodo. Ex:

        //Collections.sort(AnimeComparatores::compareByTitle);
        animeList.sort(AnimeComparatores::compareByTitle);                // utilizando metodo estatico
        System.out.println(animeList);

        //Collections.sort(animeList, AnimeComparatores::compareByEpisodes);   // utilizando metodo estatico
        animeList.sort(AnimeComparatores::compareByEpisodes);
        System.out.println(animeList);

    }



}
