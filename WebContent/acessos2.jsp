<%@page import="aula06.Contador"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mostra a quantidade de acessos</title>
</head>
<body>

<%! int cont = 1; %>


Este é o acesso de número: <%= cont %><br>
Este acesso foi feito: <%= Contador.getDataHora() %>

<% cont = cont + 1; %>

</body>
</html>