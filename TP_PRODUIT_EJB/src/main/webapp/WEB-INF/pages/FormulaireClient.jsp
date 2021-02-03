<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Formulaire Création Client</title>
	<%@ include file="commons/header.jsp" %>
</head>
<body>

	<%@ include file="commons/menu.jsp" %>

	<form action="formclient" method="post">
		<label for="nom">Nom</label><input type="text" name="nomClient"/>
		<label for="codeBarre">Adresse</label><input type="text" name="adresseClient"/>				
		<input type="submit" value="Valider"/>
	</form>
        
	<%@ include file="commons/footer.jsp" %>
</body>
</html>