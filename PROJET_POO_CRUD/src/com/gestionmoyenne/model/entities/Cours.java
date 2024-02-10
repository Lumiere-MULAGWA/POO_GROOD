package com.gestionmoyenne.model.entities;

public class Cours {
    private String inititule;
    private String volumeHoraire;

    //CONSTRUCTEURS

    public Cours() {
    }

    public Cours(String inititule, String volumeHoraire) {
        this.inititule = inititule;
        this.volumeHoraire = volumeHoraire;
    }

    public String getInititule() {
        return inititule;
    }

    public void setInititule(String inititule) {
        this.inititule = inititule;
    }

    public String getVolumeHoraire() {
        return volumeHoraire;
    }

    public void setVolumeHoraire(String volumeHoraire) {
        this.volumeHoraire = volumeHoraire;
    }

    @Override
    public String toString() {
        return "Cours{" +
                "inititule='" + inititule + '\'' +
                ", volumeHoraire='" + volumeHoraire + '\'' +
                '}';
    }
}
