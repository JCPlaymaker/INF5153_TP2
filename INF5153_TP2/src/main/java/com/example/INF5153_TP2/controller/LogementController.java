package com.example.INF5153_TP2.controller;

import com.example.INF5153_TP2.Logement;
import com.example.INF5153_TP2.repository.LogementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/logement")
public class LogementController {

    @Autowired
    private LogementRepository logementRepository;

    @GetMapping
    public List<Logement> getAllLogements() {
        return logementRepository.findAll();
    }

    @GetMapping("/{id}")
    public Logement getLogementById(@PathVariable int id) {
        return logementRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Logement non trouvé"));
    }

    @PostMapping
    public Logement createLogement(@RequestBody Logement logement) {
        return logementRepository.save(logement);
    }

    @DeleteMapping("/{id}")
    public void deleteLogement(@PathVariable int id) {
        if (!logementRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Logement non trouvé");
        }
        logementRepository.deleteById(id);
    }
}
