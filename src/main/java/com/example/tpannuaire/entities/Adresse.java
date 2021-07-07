package com.example.tpannuaire.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Adresse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numero;
    private String rue;
    private String codePostal;
    private String ville;

    @OneToMany(mappedBy="adresse") //Une adresse pourrait être associée à une ou plusieurs personnes
    @JsonIgnore //ignorer le format JSON
    private Set<Personne> personnes = new HashSet<>();

    /**
     * Constructeur par défaut de la classe
     */
    public Adresse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Adresse{" + " numéro='" + numero + '\'' + ", rue='" + rue + '\'' + ", codePostal='" + codePostal + '\'' + ", ville='" + ville + '\'' + '}';
    }
}
