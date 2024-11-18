package com.example.INF5153_TP2;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LogementController {

    private final Map<Integer, Logement> db = new HashMap<>() {{
        put(1, new Logement("Petit condo 1 1/2", 1));
        put(2, new Logement("Grand condo 5 1/2", 2));
    }};

    @GetMapping("/")
    public List<String> hello() {
        return List.of("Hello", "World");
    }

    @GetMapping("/logement")
    public Collection<Logement> logement() {
        return db.values();
    }

    @GetMapping("/logement/{id}")
    public Logement logement(@PathVariable int id) {
        Logement logement = db.get(id);
        if (logement == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return logement;
    }
}
