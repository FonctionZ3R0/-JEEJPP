<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Formulaire Création Produit</title>
	<%@ include file="commons/header.jsp" %>
</head>
<body>

	<%@ include file="commons/menu.jsp" %>

	<form action="formproduit" method="post">
		<label for="nom">Nom</label><input type="text" name="nomProduit"/>
		<label for="codeBarre">Code Barre</label><input type="text" name="codeBarre"/>				
		<input type="submit" value="Valider"/>
	</form>
        
	<%@ include file="commons/footer.jsp" %>
</body>
</html>