package academy.devdojo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Producer {

    private Long id;
    @JsonProperty("")
    private String name;

    private static List<Producer> producers = new ArrayList<>();

    static {
        var mappa = new Producer(1L, "Mappa");
        var kiotoAnimation = new Producer(2L, "Kyoto Animation");
        var madHouse = new Producer(3L, "Madhouse");

        producers.addAll(List.of(mappa, kiotoAnimation, madHouse));
    }

    public static List<Producer> getProducers() {
        return producers;
    }
}
