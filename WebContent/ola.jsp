<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Olá personalizado</title>
</head>
<body>
Digite o seu nome e clique em enviar:
<form action="ServletNome" method="post">
	<input type="text" name="nome"/>
	<input type="submit" value="Enviar" />
</form>
</body>
</html>