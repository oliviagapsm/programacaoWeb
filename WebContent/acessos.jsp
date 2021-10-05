<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mostra a quantidade de acessos</title>
</head>
<body>
<%aula06.Contador.novoAcesso(); %>

Quantidade de acessos a esta página: 
<b><%=aula06.Contador.getQuantidadeAcessos() %></b>
</body>
</html>