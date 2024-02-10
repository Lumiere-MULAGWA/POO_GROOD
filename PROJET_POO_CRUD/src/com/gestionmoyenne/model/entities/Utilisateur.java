package com.gestionmoyenne.model.entities;

public class Utilisateur {
    protected String login;

    protected String password;

    public Utilisateur() {
    }

    public Utilisateur(String login, String password) {
        this.login = login;
        this.password = password;
    }

    //getter et setter
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return  "login=" + login + ' ' +
                "| password= " + password ;
    }
}
