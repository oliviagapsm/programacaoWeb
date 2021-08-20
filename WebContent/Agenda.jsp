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
 	<form action="ServletAgenda" method="post">
 	<div>
 		Nome
        <input type="text" name="nome" />
    </div>
    <div>
        Telefone
        <input type="text" name="telefone"/>
    </div>
    <div>
        Data de Nascimento
        <input type="date" name="dataNascimento" />
    </div>
    <button type="submit">Enviar</button>
    </form>
</body>
</html>