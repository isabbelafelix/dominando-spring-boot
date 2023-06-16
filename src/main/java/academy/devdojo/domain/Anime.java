package academy.devdojo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class Anime {
    private Long id;
    private String name;

    public static List<Anime> getAnimes(){
        var jigokuraku = new Anime(1L, "jigokuraku");
        var konosuba = new Anime(2L, "konosuba");
        var drStone = new Anime(3L, "drStone");

        return List.of(jigokuraku, konosuba, drStone);
    }

}

