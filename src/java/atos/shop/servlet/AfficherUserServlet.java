/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.servlet;

import atos.shop.entity.Utilisateur;
import atos.shop.service.UtilisateurService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrateur
 */
@WebServlet(name = "AfficherUser", urlPatterns = {"/afficher-utilisateurs"})
public class AfficherUserServlet extends HttpServlet {
    private UtilisateurService service = new UtilisateurService();

   @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        List<Utilisateur> users = service.afficherUser();
         
        req.setAttribute("listeUsers", users);
        req.getRequestDispatcher("afficher-utilisateurs.jsp").forward(req, resp);
    }

    
    
    
}
