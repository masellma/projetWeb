<%-- 
    Document   : lister-cat
    Created on : 9 juil. 2018, 16:29:39
    Author     : Administrateur
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:forEach items="${listeCat}" var="catAct">
            ${catAct.nom}
            <a class="btn btn-warning" href="<c:url value="/supprimer_cat"/>?idCat=${catAct.id}">Supprimer</a>
            <br>
        </c:forEach>
    </body>
</html>
