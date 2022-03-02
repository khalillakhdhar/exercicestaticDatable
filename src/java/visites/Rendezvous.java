/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visites;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author khali
 */
@ManagedBean
@RequestScoped
public class Rendezvous {
    private String lieu,date,heure,titre;
    // JJ/MMM/AAAA
    //MM/JJ/AA

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Rendezvous() {
    }

    public Rendezvous(String lieu, String date, String heure, String titre) {
        this.lieu = lieu;
        this.date = date;
        this.heure = heure;
        this.titre = titre;
    }
    
    
    
    
    
    
    
}
