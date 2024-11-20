package com.example.INF5153_TP2.repository;

import com.example.INF5153_TP2.Logement;
import org.springframework.data.jpa.repository.JpaRepository;

// Interface pour gérer les opérations CRUD sur les Logements
public interface LogementRepository extends JpaRepository<Logement, Integer> {
}
