package academy.devdojo.domain;

import java.util.List;

public class Anime {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Anime(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public static List<Anime> getAnimes(){
        var jigokuraku = new Anime(1L, "jigokuraku");
        var konosuba = new Anime(2L, "konosuba");
        var drStone = new Anime(3L, "drStone");

        return List.of(jigokuraku, konosuba, drStone);
    }

}

