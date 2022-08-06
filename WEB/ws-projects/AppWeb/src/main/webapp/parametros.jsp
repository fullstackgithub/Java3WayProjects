<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Parâmetros</title>
</head>
<body>
	<h1>Recebendo Parâmetros</h1>
	
	<p>Usando JSP - Java Server Pages</p>
	
	Nome: <%=request.getParameter("nome") %><br>
	Idade: <%=request.getParameter("idade") %> <br>
	Email: <%=request.getParameter("email") %> <br>
	Password: <%=request.getParameter("password") %> <br>
	Data de Nascimento: <%=request.getParameter("dtnascimento") %> <hr>
	
	<p>Usando EL - Expression Language</p>
	
	Nome: ${param.nome} <br>
	Idade: ${param.idade} <br>
	Email: ${param.email} <br>
	Password: ${param.password} <br>
	Data de Nascimento: ${param.dtnascimento} <br>
	
</body>
</html>