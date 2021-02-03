<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Barre Menu BusinessCorp</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

</head>
<body>
  <nav>  	
    <div class="nav-wrapper">
      <a href="/TP_Voiture_EJB-0.0.1-SNAPSHOT/home" class="brand-logo">Business Corp</a>
      <ul id="nav-mobile" class="right hide-on-med-and-down">
      	<li><a href="clientListe">Liste client</a></li>
        <li><a href="produitListe">Liste produit</a></li> 
        <li><a href="produitDetail">Détail produit</a></li>
        <li><a href="clientForm">Création client</a></li>   
        <li><a href="produitForm">Création produit</a></li>     
      </ul>
    </div>
  </nav>
</body>
</html>