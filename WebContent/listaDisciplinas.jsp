<%@page import="avaliacao.model.Disciplina"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista Disciplinas</title>
<jsp:include page="header.jsp">
	<jsp:param value="Professor" name="usuario"/>
</jsp:include>
<body>
<h3>Lista de disciplinas e notas finais:</h3>

<table border="1">
<tr>
	<td>Disciplina</td>
	<td>Nota Final</td>
	<td>Resultado</td>
</tr>
<%
List<Disciplina> lista = (List<Disciplina>) request.getAttribute("lista");
for (Disciplina disciplina: lista){
%>

<tr>
	<td><%= disciplina.getDisciplina() %></td>
	<td><%= disciplina.getNota() %></td>
	<td><%= disciplina.getResultado() %></td>
</tr>
<%
}
%>

</table>
<br><br>
<br><a href="menuAvaliacao.jsp">Menu</a>
</body>
</html>