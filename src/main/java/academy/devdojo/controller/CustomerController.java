package academy.devdojo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "v1/customers")
public class CustomerController {

    public static final List<String> NAMES = List.of("Isabela", "Mariana", "Luke");

    @GetMapping
    public List<String> list(){
        return NAMES;
    }

    @GetMapping("filter")
    public List<String> filter(@RequestParam(required = false) String name){
        return NAMES.stream().filter(n -> n.equalsIgnoreCase(name)).toList();
    }

    @GetMapping("filterOptional")
    public List<String> filter(@RequestParam Optional<String> name){
        return NAMES.stream().filter(n -> n.equalsIgnoreCase(name.orElse(""))).toList();
    }

    @GetMapping("filterList")
    public List<String> filterList(@RequestParam List<String> names){
        return NAMES.stream().filter(names::contains).toList();
    }

    @GetMapping("{name}")
    public String findByName(@PathVariable String name){
        return NAMES.stream().filter(n -> n.equalsIgnoreCase(name))
                .findFirst()
                .orElse("");
    }
}
