package com.example.tpannuaire.repository;

import com.example.tpannuaire.entities.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository <Personne, Long> {


}
