<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
<script type="text/javascript" src="/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/bootstrap.min.js.map"></script>
<link rel="stylesheet" href="/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/bootstrap.min.css.map">
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>
<div class="card">
    <div class="card-header">
        <h2 class="mb-0">Veículos Cadastrados</h2>
    </div>
    <div class="card-body">
		<table class="table">
			<thead>
				<tr>
					<th>Marca</th>
					<th>Modelo</th>
					<th>Descrição</th>
					<th>Ano</th>
					<th>Editar</th>
					<th>Excluir</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${lstVeiculos}" var="item">
					<tr>
						<td>${item.marca}</td>
						<td>${item.modelo}</td>
						<td>${item.descricao}</td>
						<td>${item.ano}</td>
						<td><a class="btn btn-success btn-sm" href="/editar/${item.id}">Editar</a></td>
						<td><a class="btn btn-danger btn-sm" href="/excluir/${item.id}">Excluir</a></td>
					</tr>
				</c:forEach>
				<tr>
					<td colspan="6">Quantidade de veículos cadastrados:
						${fn:length(lstVeiculos)}</td>

				</tr>
				<tr>
					<td colspan="6">
						<button class="btn btn-secondary" name="btn" value="Home" onclick="window.location.href='/'" >Home</button> 
						<button	class="btn btn-primary" name="btn" value="Novo Veiculo" onclick="window.location.href='/novo'" >Novo Veículo</button>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
</div>
</body>
</html>
