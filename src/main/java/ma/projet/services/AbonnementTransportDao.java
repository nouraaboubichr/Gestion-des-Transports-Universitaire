/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.projet.services;

/**
 *
 * @author hp
 */

import ma.projet.dao.IDao;
import ma.projet.entities.AbonnementTransport;
import connexion.Connexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AbonnementTransportDao implements IDao<AbonnementTransport> {
    private Connection connection = Connexion.getInstance().getCn();

    @Override
    public boolean create(AbonnementTransport abonnement) {
        try {
            String query = "INSERT INTO abonnement_transport (bus_id, etudiant_id, date_abonnement) VALUES (?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, abonnement.getBusId());
            ps.setInt(2, abonnement.getEtudiantId());
            ps.setDate(3, abonnement.getDateAbonnement());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(AbonnementTransport abonnement) {
        // Implémentation
        return false;
    }

    @Override
    public boolean delete(int id) {
        // Implémentation
        return false;
    }

    @Override
    public AbonnementTransport findById(int id) {
        // Implémentation
        return null;
    }

    @Override
    public List<AbonnementTransport> findAll() {
        // Implémentation
        return new ArrayList<>();
    }
}