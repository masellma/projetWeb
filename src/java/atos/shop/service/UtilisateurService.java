/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.service;

import atos.shop.dao.UtilisateurDAO;
import atos.shop.entity.Client;
import atos.shop.entity.Utilisateur;
import java.util.List;

/**
 *
 * @author Administrateur
 */
public class UtilisateurService {
    private UtilisateurDAO dao = new UtilisateurDAO();
    
    public void addUser(String nom, String prenom, String adresse, int num, int cPostal){
        Utilisateur user = new Utilisateur();
        user.setNom(nom);
        user.setPrenom(prenom);
        user.setAdresse(adresse);
        user.setNum(num);
        user.setcPostal(cPostal);
        dao.addUserDB(user);
    }
    
    public List<Utilisateur> afficherUser(){
        List<Utilisateur> users = dao.afficheUser();
        return users;
    }

    public Client loginVerify(String login, String password) {

        List<Client> clients = dao.loginVerify(login, password);
        Client client = clients.get(0);
        return client;
        
    }

    public void addClient(String login, String password) {
        
        Client client = new Client();
        client.setLogin(login);
        client.setPassword(password);
        dao.addClient(client);
    }
    
}
