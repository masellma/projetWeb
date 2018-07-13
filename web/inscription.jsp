<%-- 
    Document   : inscription
    Created on : 12 juil. 2018, 12:32:42
    Author     : Administrateur
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <c:import url="./_JAVASCRIPTS.jsp"/>
        <c:import url="_STYLESHEETS.jsp"/>
    </head>
    <body>
        <div class="container-flex">
            <div class="container">
                <c:import url="./_TITRE.jsp"/>
                <c:import url="./_MENU.jsp"/>
                <div class="styleChange"></div>
                <div id="login">
                    <h4>Inscription</h4>
                    <form method="POST">
                <label for="login">Login</label>
                <input type="text" name="login" placeholder="Login">
                <label for="password">Password</label>
                <input type="password" name="password">
                <label for="passwordConfirm">Password confirm</label>
                <input type="password" name="passwordConfirm">
                <button class="btn btn-success">Inscription</button>

            </form>
                </div>
            </div>
            
            <c:import url="./_PIED.jsp"/>
            
        </div>

    </body>
</html>
<h1>INSCRIPTION</h1>
        <div class="container">
            
        </div>