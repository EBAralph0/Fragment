package com.example.fragment;

public class livre {
    String nomLivre;
    String Description;
    String nomAuteur;

    public livre(String nomLivre, String description, String nomAuteur) {
        this.nomLivre = nomLivre;
        Description = description;
        this.nomAuteur = nomAuteur;
    }

    public String getNomLivre() {
        return nomLivre;
    }

    public void setNomLivre(String nomLivre) {
        this.nomLivre = nomLivre;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }

    public String getDescription() {
        return Description;
    }

    public String getNomAuteur() {
        return nomAuteur;
    }

    public livre() {
    }
}
