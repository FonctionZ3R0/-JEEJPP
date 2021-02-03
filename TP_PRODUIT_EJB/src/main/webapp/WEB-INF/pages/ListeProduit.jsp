<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Liste Produits</title>
	<%@ include file="commons/header.jsp" %>
</head>
<body>

	<%@ include file="commons/menu.jsp" %>

		<table>
	<c:forEach var="produit" items="${listeProduit}">
            <tr>
            <td>
            	<a href="produitDetail?nom=${produit.nom}"><c:out value="${produit.nom}"></c:out></a>
            </td>
            <td>
            	${produit.code}
            </td>
            </tr>
            <br/>
        </c:forEach>
        </table>
        
        <table class="striped">
        <c:forEach var="produit" items="${listeProduit}">
	        <thead>
	          	<tr>
	              	<th>Nom</th>
	         		<th>Code Barre</th>	              
	        	</tr>
	        </thead>
	
	        <tbody>
	          	<tr>
		            <td>${produit.nom}</td>
		            <td>${produit.codeBarre}</td>
	          	</tr>
	        </tbody>
	        </c:forEach>
      </table>
	
	<%@ include file="commons/footer.jsp" %>
</body>
</html>