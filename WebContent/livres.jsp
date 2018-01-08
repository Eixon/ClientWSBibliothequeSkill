<%@page import="fr.ynov.biblioskill.service.CatalogueProxy" %>
<%@page import="fr.ynov.biblioskill.service.Livre" %>
<%@page import="java.util.Calendar" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Livres - Biblioskill</title>
</head>
<body>
	<% 
		CatalogueProxy stub = new CatalogueProxy();
	
		String isbn = null, photo = null, resume = null, titre = null;
		Calendar datePublication = null;
		int quantite = 0;
		Livre[] livres = stub.consulterLivres();
	%>
	<table>
		<tr>
			<th>Date de publication</th>
			<th>ISBN</th>
			<th>Photo</th>
			<th>Quantité</th>
			<th>Resume</th>
			<th>Titre</th>
		</tr>
		
		<%
		if(livres.length > 0) {
			for(Livre l : livres) {
			%> 
				<tr>
					<td><%=l.getDatePublication() %></td>
					<td><%=l.getIsbn() %></td>
					<td><%=l.getPhoto() %></td>
					<td><%=l.getQuantite() %></td>
					<td><%=l.getResume() %></td>
					<td><%=l.getTitre() %></td>
				</tr>
			<%
			}	
		}
		%>
	</table>
	
	<h1>Ajouter un livre :</h1>
	<form action="categories.jsp">
		Date de publication : <input type="date" name="datePublication" value="<%=datePublication %>" >
		ISBN : <input type="text" name="isbn" value="<%=isbn %>">
		Photo : <input type="text" name="photo" value="<%=photo %>">
		Quantité : <input type="text" name="quantite" value="<%=quantite %>">
		Resume : <input type="text" name="resume" value="<%=resume %>">
		Titre : <input type="text" name="titre" value="<%=titre %>">
	</form>
</body>
</html>