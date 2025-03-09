/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.projet.entities;

/**
 *
 * @author hp
 */


import java.sql.Date;

public class AbonnementTransport {
    private int id;
    private int busId;
    private int etudiantId;
    private Date dateAbonnement;

    public AbonnementTransport(int id, int busId, int etudiantId, Date dateAbonnement) {
        this.id = id;
        this.busId = busId;
        this.etudiantId = etudiantId;
        this.dateAbonnement = dateAbonnement;
    }

    public AbonnementTransport(int busId, int etudiantId, Date dateAbonnement) {
        this.busId = busId;
        this.etudiantId = etudiantId;
        this.dateAbonnement = dateAbonnement;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) { 
        this.id = id; 
    }
    public int getBusId() { 
        return busId; 
    }
    public void setBusId(int busId) { 
        this.busId = busId; 
    }
    public int getEtudiantId() {
        return etudiantId;
    }
    public void setEtudiantId(int etudiantId) { 
        this.etudiantId = etudiantId; 
    }
    public Date getDateAbonnement() {
        return dateAbonnement;
    }
    public void setDateAbonnement(Date dateAbonnement) {
        this.dateAbonnement = dateAbonnement;
    }
}