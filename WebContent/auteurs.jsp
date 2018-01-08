<%@page import="fr.ynov.biblioskill.service.CatalogueProxy" %>
<%@page import="fr.ynov.biblioskill.service.Auteur" %>
<%@page import="fr.ynov.biblioskill.service.TypeAuteur" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Auteurs - Biblioskill</title>
</head>
<body>
	<% 
		CatalogueProxy stub = new CatalogueProxy();
		String aProposDe = null, nationalite = null;
		TypeAuteur type;
		Auteur[] auteurs = stub.consulterAuteurs();
	%>
	<table>
		<tr>
			<th>À propos</th>
			<th>Nationalité</th>
			<th>Type</th>
		</tr>
		
		<%
		if(auteurs.length > 0) {
			for(Auteur a : auteurs) {
			%> 
				<tr>
					<td><%=a.getAProposDe() %></td>
					<td><%=a.getNationalite() %></td>
					<td><%=a.getType() %></td>
				</tr>
			<%
			}	
		}
		%>
	</table>
	
	<h1>Ajouter un auteur :</h1>
	<form action="auteurs.jsp">
		À propos : <input type="text" name="apropos" value="<%=aProposDe %>" >
		Nationalité : <input type="text" name="nationalite" value="<%=nationalite %>">
		Type : <select>
			<option value="PRINCIPAL">Principal</option>
			<option value="COAUTEUR">Co-auteur</option>
		</select>
		<input type="submit" value="Ajouter">
	</form>
</body>
</html>