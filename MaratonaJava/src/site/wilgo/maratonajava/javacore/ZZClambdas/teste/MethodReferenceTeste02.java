package site.wilgo.maratonajava.javacore.ZZClambdas.teste;

import site.wilgo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import site.wilgo.maratonajava.javacore.ZZClambdas.service.AnimeComparatores;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTeste02 {

    public static void main(String[] args) {

        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Pokemon", 500), new Anime("One Piece", 900),new Anime("Naruto", 350)));

        AnimeComparatores animeComparatores = new AnimeComparatores();  // sem o uso de metodo estatico, cria-se o objeto

        animeList.sort(animeComparatores::compareByEpisodesNoStatic);   // sem o uso de metodo estatico

        //animeList.sort((a1,a2) -> animeComparatores.compareByEpisodesNoStatic(a1,a2)); fazendo usando lambda, chama também o objeto

        System.out.println(animeList);
    }



}
