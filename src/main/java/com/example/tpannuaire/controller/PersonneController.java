package com.example.tpannuaire.controller;

import com.example.tpannuaire.entities.Personne;
import com.example.tpannuaire.service.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("personne") //pour avoir un format JSON
public class PersonneController {

    @Autowired
    PersonneService servicePersonne;

    @GetMapping("personne")  // recuperer la liste des personne
    public List<Personne> listePersonnes(){
        return servicePersonne.getPersonne();
    }

    @PostMapping("personne")
    public String addPersonne(@RequestBody Personne nouvellePersonne){
        servicePersonne.addPersonne(nouvellePersonne);
        return "Ajout OK !";

    }

    @DeleteMapping("/personne/{id}")
    public String deletePersonne(@PathVariable("id") Long id) {
        servicePersonne.deletePersonne(id);
        return "Suppression ok !";
    }

}
