<%-- 
    Document   : ajouter-utilisateur
    Created on : 10 juil. 2018, 10:20:51
    Author     : Administrateur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ajouter un utilisateur</h1>
        <div class="container">
		<form class="col-lg-6" method="POST">
			<div class="row">
				<input class="form-control col-lg-5" type="text" name="nom" placeholder="nom">
				<input class="form-control col-lg-5 col-lg-offset-1" type="text" name="prenom" placeholder="prenom">
			</div>
			<div class="row">
				<input class="form-control col-lg-5" type="text" name="adresse" placeholder="adresse">
				<input class="form-control col-lg-5 col-lg-offset-1" type="text" name="num" placeholder="numero">
			</div>
			<div class="row">
				<input class="form-control col-lg-5" type="text" name="cPostal" placeholder="cPostal">
			</div>
			<button class="btn btn-success">Ajouter</button>
		</form>		
	</div>
    </body>
</html>
