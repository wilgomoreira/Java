package site.wilgo.maratonajava.javacore.ZZDoptional.repositorio;

import site.wilgo.maratonajava.javacore.ZZDoptional.dominio.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepositorio {
    private static List<Manga> mangas = List.of(new Manga(1,"Dragon Ball", 60),
                                                new Manga(2, "Super Campeoes", 90));


    public static Optional<Manga> findByTile(String title){
        return findBy(m -> m.getTitle().equals(title));
    }

    public static Optional<Manga> findById(Integer id){
        return findBy(m -> m.getId().equals(id));
    }

    private static Optional<Manga> findBy(Predicate<Manga> predicate){
        Manga found = null;

        for (Manga manga : mangas){
            if(predicate.test(manga)){
                found = manga;
            }
        }

        return Optional.ofNullable(found);

    }

}
