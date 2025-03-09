/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ma.projet.dao;

/**
 *
 * @author hp
 */


import java.util.List;

public interface IDao<T> {
    boolean create(T obj);
    boolean update(T obj);
    boolean delete(int id);
    T findById(int id);
    List<T> findAll();
}

