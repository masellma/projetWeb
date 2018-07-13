<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-expand-lg navbar-dark ">
  <a class="navbar-brand logo-container " href="#"><img class="logo" src="./img/logo.png"></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
        <c:if test="${Client != null}">
            <li class="nav-item">
                <span class="nav-link">${Client.getLogin()}</span>
            </li>
        </c:if>
      <li class="nav-item">
        <a class="nav-link" href="#">Clients</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Produits</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Catégorie</a>
      </li>
      
      <!--Connecté ou non?-->
      <c:choose>
          <c:when test="${Client != null}">
            <li class="nav-item">
                <a class="nav-link" href="./monCompte">Mon compte</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="./logout">Logout</a>
            </li>
          </c:when>
          <c:otherwise>
              <li class="nav-item">
                 <a class="nav-link" href="./login">Login</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="./inscription">Inscription</a>
              </li>
          </c:otherwise>
      </c:choose>
      
      <!--Connecté ou non Fin-->
      <!--Dropdown begin-->
      <div class="dropdown">
  <button class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    Style
  </button>
  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
    <a class=" dropdown-item" href="changeStyle?style=france">France</a>
    <a class="btn btn-danger dropdown-item" href="changeStyle?style=belgique">Belgique</a>
  </div>
</div>
      <!--Dropdown End-->
      
    </ul>
      
      
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Categorie, Film..." aria-label="Search">
      <button class="btn btn-outline-warning my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>