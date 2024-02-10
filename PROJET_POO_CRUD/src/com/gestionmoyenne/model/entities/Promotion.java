package com.gestionmoyenne.model.entities;

public class Promotion {
    
    private String nom;
    private int nombreEtudiant;

    public Promotion(){

    }

    public Promotion(String name,int nbre){

        this.nom = name;
        this.nombreEtudiant = nbre;
    }


}
