package com.example.tpannuaire.entities;

import javax.persistence.*;

@Entity
public class Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;

    @ManyToOne(cascade = CascadeType.ALL) //Une ou +ieurs personne(s) peut(vent) disposer la meme adresse.
    @JoinColumn(name = "adresse_id")
    private Adresse adresse;

    public Personne() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Personne{" + "id=" + id + ", nom='" + nom + '\'' + ", prenom='" + prenom + '\'' + ", adresse=" + adresse + '}';
    }
}
