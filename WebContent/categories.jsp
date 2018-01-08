<%@page import="fr.ynov.biblioskill.service.CatalogueProxy" %>
<%@page import="fr.ynov.biblioskill.service.Categorie" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Categories - Biblioskill</title>
</head>
<body>
	<%
		CatalogueProxy stub = new CatalogueProxy();
		String nom = null, desc = null;
		Categorie[] categories = stub.consulterCategories();
	%>
	<table>
		<tr>
			<th>Nom</th>
			<th>Description</th>
		</tr>
		
		<%
		if(categories.length > 0) {
			for(Categorie c : categories) {
			%> 
				<tr>
					<td><%=c.getNom() %></td>
					<td><%=c.getDescription() %></td>
				</tr>
			<%
			}
		}
		%>
	</table>
	
	<h1>Ajouter une catégorie :</h1>
	<form action="categories.jsp">
		Nom : <input type="text" name="nom" value="<%=nom %>" >
		Description : <input type="text" name="desc" value="<%=desc %>">
		<input type="submit" value="Ajouter">
	</form>
</body>
</html>