<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Web</title>
</head>
<body style="background-color: tomato">
	<h1>Java Web</h1>
	<form action="parametros.jsp">
		<input type="text" name="nome" placeholder="Insira o neu nome"><br>
		<input type="text" name="idade" placeholder="Insira a sua idade"><br>
		<input type="email" name="email" placeholder="Insira o neu email" requiered><br>
		<input type="password" name="password" placeholder="Password"><br>
		<input type="date" name="dtnascimento"><br>
		
		
		<input type="submit" value="Submeter">
	</form>
</body>
</html>