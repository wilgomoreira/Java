package academy.devdojo.springboot.controller;

import academy.devdojo.springboot.domain.Anime;
import academy.devdojo.springboot.service.AnimeService;
import academy.devdojo.springboot.util.DateUtil;
import academy.devdojo.springboot.domain.Anime;
import academy.devdojo.springboot.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("animes")
@Log4j2
@RequiredArgsConstructor
public class AnimeController {

    private final DateUtil dateUtil;
    private final AnimeService animeService;

    //localhost:8080/animes
    @GetMapping
    public List<Anime> list(){
        log.info(dateUtil.formatLocalDateTimeToDatebaseStyle(LocalDateTime.now()));
        return animeService.listAll();
    }





}
