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
import ma.projet.entities.Etudiant;
import connexion.Connexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EtudiantDao implements IDao<Etudiant> {
    private Connection connection = Connexion.getInstance().getCn();

    @Override
    public boolean create(Etudiant etudiant) {
        try {
            String query = "INSERT INTO etudiant (nom, prenom, email) VALUES (?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, etudiant.getNom());
            ps.setString(2, etudiant.getPrenom());
            ps.setString(3, etudiant.getEmail());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(Etudiant etudiant) {
        // Implémentation
        return false;
    }

    @Override
    public boolean delete(int id) {
        // Implémentation
        return false;
    }

    @Override
    public Etudiant findById(int id) {
        // Implémentation
        return null;
    }

    @Override
    public List<Etudiant> findAll() {
        // Implémentation
        return new ArrayList<>();
    }
}