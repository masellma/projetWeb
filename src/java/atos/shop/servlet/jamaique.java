/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrateur
 */
@WebServlet(name = "jamaique", urlPatterns = {"/changeStyle"})
public class jamaique extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pays = req.getParameter("style");
        Cookie cookieStyle = new Cookie("style", pays);
        cookieStyle.setMaxAge(100000);
        resp.addCookie(cookieStyle);
        String url = req.getContextPath();
        resp.sendRedirect(url+"/_TEMPLATE.jsp");
    }
    
}
