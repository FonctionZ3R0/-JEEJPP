<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Liste Clients</title>
	<%@ include file="commons/header.jsp" %>
</head>
<body>

	<%@ include file="commons/menu.jsp" %>

		<table>
	<c:forEach var="client" items="${listeClient}">
            <tr>
            <td>
            	<a href="clientDetail?nom=${client.nom}"><c:out value="${client.nom}"></c:out></a>
            </td>
            <td>
            	${client.adresse}
            </td>
            </tr>
            <br/>
        </c:forEach>
        </table>
        
        <table class="striped">
        <c:forEach var="client" items="${listeClient}">
	        <thead>
	          	<tr>
	              	<th>Nom</th>
	         		<th>Adresse</th>	              
	        	</tr>
	        </thead>
	
	        <tbody>
	          	<tr>
		            <td>${client.nom}</td>
		            <td>${client.adresse}</td>
	          	</tr>
	        </tbody>
	        </c:forEach>
      </table>
	
	<%@ include file="commons/footer.jsp" %>
</body>
</html>