package academy.devdojo.controller;

import academy.devdojo.domain.Anime;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Log4j2
@RestController
@RequestMapping(path = "v1/animes")
public class AnimeController {

    @GetMapping("")
    public List<Anime> listAllAnimes(@RequestParam(required = false) String name){
        log.info("Request received to list all animes, param name '{}'", name);
        var animes = Anime.getAnimes();
        if (name == null) return animes;
        return animes.stream().filter(anime -> anime.getName().equalsIgnoreCase(name)).toList();
    }

    @GetMapping("{id}")
    public Anime findById(@PathVariable Long id){
        log.info("Request received find anime by id '{}'", id);
        return Anime.getAnimes()
                .stream()
                .filter(anime -> anime.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @PostMapping
    public Anime save(@RequestBody Anime anime){
        anime.setId(ThreadLocalRandom.current().nextLong(100_000));
        Anime.getAnimes().add(anime);

        return anime;

    }


}
