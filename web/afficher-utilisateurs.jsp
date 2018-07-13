<%-- 
    Document   : afficher-utilisateurs
    Created on : 10 juil. 2018, 11:42:30
    Author     : Administrateur
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <div class="container">
            <c:forEach items="${listeUsers}" var="userAct">
                <div class="card" style="width: 18rem;">
                    <img class="card-img-top" src=".../100px180/" style="background-color: rgb(51,51,51);">
                    <div class="card-body">
                      <h5 class="card-title">${userAct.nom} ${userAct.prenom}</h5>
                      <p class="card-text">${userAct.num} ${userAct.adresse}</p>
                    </div>
                </div>
            </c:forEach>
		
	</div>
    </body>
</html>
