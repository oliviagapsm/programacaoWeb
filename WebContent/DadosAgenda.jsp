<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Agenda de Contatos
 	<div>
 		Nome: <%=session.getAttribute("nome") %>
 		
    </div>
    <div>
        Telefone: <%=session.getAttribute("telefone") %>
    </div>
    <div>
        Data de Nascimento: <%=session.getAttribute("dataNascimento") %>
    </div>
</body>
</html>