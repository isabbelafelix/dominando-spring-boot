package academy.devdojo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@ToString
public class Anime {
    private Long id;
    @JsonProperty(value = "name")
    private String name;
    private static List<Anime> animes = new ArrayList<>();

    static {
        var jigokuraku = Anime.builder().id(1L).name("jigokuraku").build();
        var konosuba = Anime.builder().id(2L).name("konosuba").build();
        var drStone = Anime.builder().id(3L).name("drStone").build();

        animes.addAll(List.of(jigokuraku, konosuba, drStone));
    }

    public static List<Anime> getAnimes() {
        return animes;
    }
}

