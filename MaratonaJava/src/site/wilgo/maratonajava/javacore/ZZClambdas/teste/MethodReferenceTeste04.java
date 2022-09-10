package site.wilgo.maratonajava.javacore.ZZClambdas.teste;

import site.wilgo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import site.wilgo.maratonajava.javacore.ZZClambdas.service.AnimeComparatores;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTeste04 {

    public static void main(String[] args) {

        // Supplier<AnimeComparatores> animeComparatoresSupplier = () -> new AnimeComparatores() //outra forma de fazer
        Supplier<AnimeComparatores> animeComparatoresSupplier = AnimeComparatores::new;

        AnimeComparatores animeComparatores = animeComparatoresSupplier.get();  // para criar o obejto tem que chamar o get

        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Pokemon", 500), new Anime("One Piece", 900),new Anime("Naruto", 350)));

        animeList.sort(animeComparatores::compareByEpisodesNoStatic);
        System.out.println(animeList);

        //no caso quando o construtor tem mais parametros

        BiFunction<String, Integer, Anime> animeBiFunction = (title, episodes) -> new Anime(title, episodes);
        //outra forma de fazer
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;
        Anime animeNovo = animeBiFunction2.apply("Super Campeões", 40);
        System.out.println(animeNovo);

    }

}
