/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.dao;

import atos.shop.entity.Categorie;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Administrateur
 */
public class CategorieDAO {
    
    public void ajouter(Categorie c){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
       
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        
    }
    public List<Categorie> lister(){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        Query query = em.createQuery("SELECT c FROM Categorie c ORDER BY c.nom");
        
        return query.getResultList();
        
        
    }
    public void delete(Long id) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        Categorie categorie = em.find(Categorie.class, id);
        em.getTransaction().begin();
        em.remove(categorie);
        em.getTransaction().commit();
    }
}
