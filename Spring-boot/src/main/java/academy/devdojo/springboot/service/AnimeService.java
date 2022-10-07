package academy.devdojo.springboot.service;

import academy.devdojo.springboot.domain.Anime;
import academy.devdojo.springboot.repository.AnimeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService{

    public List<Anime> listAll(){
        return List.of(new Anime(1L,"DBZ"), new Anime(2L,"Samurai X"), new Anime(3L, "Shurato"));
    }

}
