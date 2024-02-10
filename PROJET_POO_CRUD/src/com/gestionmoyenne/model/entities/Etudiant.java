package com.gestionmoyenne.model.entities;

public class Etudiant {
    private  String matricule;
    private  String nom;
    private  String postnom;
    private  String prenom;
    private  String promotion;
    private  String dateNaissance;
    private  String email;

    //CONSTRUCTEURS

    public Etudiant() {
    }

    public Etudiant(String matricule, String nom, String postnom, String prenom, String promotion, String dateNaissance, String email) {
        this.matricule = matricule;
        this.nom = nom;
        this.postnom = postnom;
        this.prenom = prenom;
        this.promotion = promotion;
        this.dateNaissance = dateNaissance;
        this.email = email;
    }

    //setter et getter

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPostnom() {
        return postnom;
    }

    public void setPostnom(String postnom) {
        this.postnom = postnom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "matricule='" + matricule + '\'' +
                ", nom='" + nom + '\'' +
                ", postnom='" + postnom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", promotion='" + promotion + '\'' +
                ", dateNaissance='" + dateNaissance + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}



