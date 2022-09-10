package site.wilgo.maratonajava.javacore.ZZDoptional.teste;

import site.wilgo.maratonajava.javacore.ZZDoptional.dominio.Manga;
import site.wilgo.maratonajava.javacore.ZZDoptional.repositorio.MangaRepositorio;

import java.util.Optional;

public class OptionalTeste02 {
    public static void main(String[] args) {

        Optional<Manga> mangaByTitle = MangaRepositorio.findByTile("Super Campeoes");
        mangaByTitle.ifPresent(m -> m.setTitle("Capitão Tsubasa"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepositorio.findById(2).orElseThrow(IllegalAccessError::new);
        System.out.println((mangaById));

        Manga newManga = MangaRepositorio.findByTile("Samurai X").orElse(new Manga(3,"Samurai X", 50));
        System.out.println(newManga);

    }
}
