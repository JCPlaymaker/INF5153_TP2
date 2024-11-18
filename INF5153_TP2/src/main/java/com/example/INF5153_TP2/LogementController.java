package com.example.INF5153_TP2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LogementController {
    @GetMapping("/")
    public List<String> hello() {
        return List.of("Hello", "World");
    }

    @GetMapping("/logement")
    public String logement() {
        return "Pas de logement pour le moment";
    }
}
