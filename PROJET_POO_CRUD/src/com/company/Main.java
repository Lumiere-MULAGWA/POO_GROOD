package com.company;

import com.gestionmoyenne.model.entities.Ensegnant;
import com.gestionmoyenne.model.entities.Utilisateur;

public class Main {

    public static void main(String[] args) {
        Utilisateur user = new Utilisateur("log" , "pass");
        System.out.println(user.toString());
        Ensegnant enseignant = new Ensegnant(user.getLogin(),user.getPassword(),"E001","chef de travqux");

        System.out.println(user);




        /*
         *_------------------------ 
         * class Utilisateur
         * ------------------
         *  login:String
         *  password:String
         * -------------------
         * 
         * ----------------
         * class etudiant
         * ----------------
         * 
         * 
         * 
         * 
         * 
         */

    }
}
