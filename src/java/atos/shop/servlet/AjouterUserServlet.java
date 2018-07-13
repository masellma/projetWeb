/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.servlet;

import atos.shop.service.UtilisateurService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrateur
 */
@WebServlet(name = "AjouterUserServlet", urlPatterns = {"/ajouter-utilisateur"})
public class AjouterUserServlet extends HttpServlet {
    private UtilisateurService service = new UtilisateurService();
    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("ajouter-utilisateur.jsp").forward(req, resp);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nom = req.getParameter("nom");
        String prenom = req.getParameter("prenom");
        String adresse = req.getParameter("adresse");
        String numero = req.getParameter("num");
        int num = Integer.parseInt(numero);
        int cPostal = Integer.parseInt(req.getParameter("cPostal"));
        service.addUser(nom, prenom, adresse, num, cPostal);
        resp.sendRedirect("afficher-utilisateurs");
        
    }

    
}
