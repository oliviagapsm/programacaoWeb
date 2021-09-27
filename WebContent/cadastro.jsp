<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dados Pessoais</title>
</head>
<body>
	Preencha os dados pessoais:
	<form action="Cadastrotela1sessao" method="post">
		Nome: <input type="text" name="nome">
		Sobrenome: <input type="text" name="sobrenome"><br>
		Endereço Residencial: <br>
		Rua: <input type="text" name="rua">
		Complemento: <input type="text" name="complemento">
		Cidade: <input type="text" name="cidade">
		Cep: <input type="text" name="cep">
		Estado: <input type="text" name="estado"><br><br>
		<input type="submit" value="Próxima tela">
	</form>
</body>
</html>