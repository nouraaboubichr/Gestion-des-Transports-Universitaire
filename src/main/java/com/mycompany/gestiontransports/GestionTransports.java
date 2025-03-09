/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestiontransports;

/**
 *
 * @author hp
 */


import ma.projet.entities.Bus;
import ma.projet.services.BusDao;


public class GestionTransports {
    public static void main(String[] args) {
       BusDao busDao = new BusDao();

        Bus bus1 = new Bus(0, "TEST-1230", 40); 
        if (busDao.create(bus1)) {
            System.out.println("Bus ajouté avec succès !");
        } else {
            System.out.println("Échec de l'ajout du bus.");
        }

        
        System.out.println("Liste des bus :");
        for (Bus b : busDao.findAll()) {
            System.out.println(" - " + b.getId() + " | " + b.getImmatriculation() + " | " + b.getNombrePlaces() + " places");
        }

        /* Supprimer le bus 
        if (!busDao.findAll().isEmpty()) {
            int idASupprimer = busDao.findAll().get(0).getId();
            if (busDao.delete(idASupprimer)) {
                System.out.println("Bus supprimé avec succès !");
            } else {
                System.out.println("Échec de la suppression du bus.");
            }
        }

        */

       /* Vérifier  suppression
        System.out.println("Liste des bus après suppression :");
        for (Bus b : busDao.findAll()) {
            System.out.println(" - " + b.getId() + " | " + b.getImmatriculation() + " | " + b.getNombrePlaces() + " places");
        }*/
    }
}



