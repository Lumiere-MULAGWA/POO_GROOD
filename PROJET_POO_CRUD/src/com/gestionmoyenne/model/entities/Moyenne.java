package com.gestionmoyenne.model.entities;
//import java.util.Objects;

public class Moyenne {

    private Etudiant etudiant;

    private Cours cours ;

    private  float note;

    //CONSTRUCTEURS

    public Moyenne() {
    }

    public Moyenne(float notes , Etudiant etudiant, Cours cours) {
        this.note = notes;
        this.etudiant = etudiant;
        this.cours = cours;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public Etudiant getEtudiant() {
        return this.etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Cours getCours() {
        return this.cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }




    @Override
    public String toString() {
        return "{" +
            " etudiant='" + getEtudiant() + "'" +
            ", cours='" + getCours() + "'" +
            ", note='" + getNote() + "'" +
            "}";
    }
   

}

