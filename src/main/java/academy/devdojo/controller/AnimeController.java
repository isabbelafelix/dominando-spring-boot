package academy.devdojo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "v1/animes")
public class AnimeController {

    @GetMapping("")
    public List<String> listAllAnimes(){
        return List.of("Anime 01", "Anime 02", "Anime 03");
    }
}
