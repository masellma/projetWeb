<%-- 
    Document   : _TEMPLATE
    Created on : 10 juil. 2018, 16:42:27
    Author     : Administrateur
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <!--<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">-->
        <title>JSP Page</title>
        <c:import url="_STYLESHEETS.jsp"/>
    </head>
    <body>
        <div class="container-flex">
            <div class="container">
                <c:import url="_TITRE.jsp"/>
                <c:import url="_MENU.jsp"/>
                <div class="styleChange"></div>
                <div>CONTENU PAR DEFAUT</div>
            </div>
            
            <c:import url="_PIED.jsp"/>
            <c:import url="_JAVASCRIPTS.jsp"/>
        </div>
        
    </body>
</html>
