/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.service;

import atos.shop.dao.CategorieDAO;
import atos.shop.entity.Categorie;
import java.util.List;

/**
 *
 * @author Administrateur
 */
public class CategorieService {
    private CategorieDAO catDao = new CategorieDAO();
    public void ajouter(String nom) {
        Categorie c = new Categorie();
        c.setNom(nom);
        catDao.ajouter(c);
    }

    public List<Categorie> afficherListeCat() {
        List<Categorie> cat = catDao.lister();
        return cat;
    }

    public void delete(Long id){
        catDao.delete(id);
    }
}
