<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro disciplina</title>
<jsp:include page="header.jsp">
	<jsp:param value="Professor" name="usuario"/>
</jsp:include>
</head>
<body>
<form action="Controlador" method="post">
   <input type="hidden" name="acao" value="confirmarCadastro"><br>
	Disciplina: <input type="text" name="disciplina" value=""><br>
	Nota Final: <input type="text" name="nota" value=""><br><br>
	<input type="submit" value="Cadastrar">

</form>
<%
Boolean isCadastrado = (Boolean) request.getAttribute("isCadastrado");
if(isCadastrado){
	
%>
<h3> Disciplina cadastrado com sucesso!</h3>
<%
} 
%>

<br><a href="menuAvaliacao.jsp">Menu</a>
</body>
</html>