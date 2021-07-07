package com.example.tpannuaire.service;

import com.example.tpannuaire.entities.Personne;
import com.example.tpannuaire.repository.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class PersonneService {

    //pour le repertoire de la classe personne
    @Autowired
    PersonneRepository personneRepository;

    private List<Personne> personnes = new ArrayList<Personne>();

    public List<Personne> getPersonne(){ // retourner la liste des personnes

        return personneRepository.findAll();
    }

    public void addPersonne(Personne pers){ // rajouter une personne en base de données

        personneRepository.save(pers);
    }

    public void putPersonne(Long id){ // mettre à jour la personne en base de données
        personneRepository.findById(id);
    }

    public void deletePersonne(Long id){ // Supprimer la personne en base de données
        Iterator<Personne> pers = personnes.iterator();
        while(pers.hasNext()){
            Personne p = pers.next();
            if(p.getId() == id){
                personnes.remove(p);
               personneRepository.delete(p);
            }
        }

    }

}
