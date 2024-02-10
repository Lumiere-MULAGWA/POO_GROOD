package com.gestionmoyenne.model.entities;

public class Ensegnant  extends Utilisateur{


    private String grade ;

    private String matricule;


    public Ensegnant(){

    }
  

    public Ensegnant(String grade, String matricule) {
        this.grade = grade;
        this.matricule = matricule;
    }
    

    public Ensegnant(String grade, String matricule,String login ,String password ) {
        this.grade = grade;
        this.matricule = matricule;
        this.password = password;
        this.login = login;
        
    }
    


   
    
}
