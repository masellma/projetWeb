/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.dao;

import atos.shop.entity.Categorie;
import atos.shop.entity.Client;
import atos.shop.entity.Utilisateur;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Administrateur
 */
public class UtilisateurDAO {

    public void addUserDB(Utilisateur user) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
    }
    public List<Utilisateur> afficheUser(){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        Query query = em.createQuery("SELECT u FROM Utilisateur u ORDER BY u.nom");
        
        return query.getResultList();
    }

    public List<Client> loginVerify(String login, String password) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        Query query = em.createQuery("SELECT c FROM Client c WHERE c.login=:login AND c.password = :password");
        query.setParameter("login", login);
        query.setParameter("password", password);
        List<Client> clients = query.getResultList();
        return clients;
            
    }

    public void addClient(Client client) {

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        em.persist(client);
        em.getTransaction().commit();
    }

    
    
}
