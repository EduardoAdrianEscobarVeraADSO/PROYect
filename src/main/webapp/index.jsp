<%-- 
    Document   : index
    Created on : 25/04/2024, 1:10:44 p. m.
    Author     : Eduardito
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exchange</title>
        <link rel="stylesheet" href="styles.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Inter:wght@100..900&display=swap" rel="stylesheet">
        <script src="main.js"></script>
        <link rel="icon" type="image" href="img/logopage.jpg">
    </head>
    <body>
        <!-- menu de navegacion principal -->
        <header class="header">
          <!-- Icono para abrir el menú -->
          <div class="header__menu-icon" onclick="toggleMenu()">
            <i class="fas fa-bars"></i>
          </div>

          <!-- Logo -->
          <div class="header__logo">
            <img src="img/logoh2.png" alt="Logo" id="logoImage">
          </div>

          <!-- Items de navegación -->
          <div class="header__items" id="header__items">
            <a href="#favoritos" class="fas fa-heart"></a>
            <a href="login/inicio_sesion.jsp" class="fas fa-user"></a>
            <a href="#carrito" class="fas fa-shopping-cart"></a>
          </div>

          <!-- Menú desplegable -->
          <div id="myNav" class="header__menu">
            <!-- Botón para cerrar el menú -->
            <i class="fas fa-times header__menu-icon--close" onclick="toggleMenu()"></i>
            <a href="#">Camisetas</a>
            <a href="#">Pantalones</a>
            <a href="#">Oversizes</a>
            <a href="#">Oversizes</a>
            <a href="#">Oversizes</a>
            <a href="#">Oversizes</a>
            <a href="#">Oversizes</a>
          </div>
           <!-- Menú desplegable search -->
          <div id="searchNav" class="header__menu-search">
            <!-- Botón para cerrar el menú -->
            <i class="fas fa-times header__menu-search-icon--close" onclick="toggleMenuSearch()"></i>
            <form class="search-form" onsubmit="event.preventDefault();" role="search">
              <label class="search-form__label" for="search">Search for stuff</label>
              <input class="search-form__input" id="search" type="search" placeholder="Search..." autofocus required />
              <button class="search-form__button" type="submit"><a class="fas fa-search"></a></button>    
            </form>
          </div>

        </header>
        <section>
          <div class="video-container">
            <video width="100%" height="auto" autoplay loop muted>
              <source src="vids/vidH.mp4" type="video/mp4">
            </video>
          </div>
        </section>
        <section>

        </section>

    </body>
</html>
