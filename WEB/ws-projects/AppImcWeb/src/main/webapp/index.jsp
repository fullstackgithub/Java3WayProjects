<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calcular IMC</title>
<link rel="stylesheet" href="./css/bootstrap.min.css">
</head>
<body>
	<div class="card m-3">
		<div class="card-header">
			<h3 class="mb-0">Calculadora IMC Web</h3>
		</div>
		<div class="card-body">
			<form action="ImcSV" method="post">
				<div class="form-row">
					<div class="form-group col-md-6">
						<label for="nome">Nome</label> 
						<input type="text" id="nome" name="nome" class="form-control" required />
					</div>
					<div class="form-group col-md-6">
						<label for="sexo">Sexo</label> 
						<select id="sexo" name="sexo" class="form-control">
							<option value="">Selecione o sexo</option>
							<option value="Masculino">Masculino</option>
							<option value="Feminino">Feminino</option>
						</select>
					</div>
				</div>
				<div class="form-row">
					<div class="form-group col-md-4">
						<label for="dtNasc">Data de Nascimento</label> 
						<input type="date" id="dtNascimento" name="dtNasc" class="form-control" />
					</div>
					<div class="form-group col-md-4">
						<label for="altura">Altura</label> 
						<input type="text" id="altura" name="altura" class="form-control" />
					</div>
					<div class="form-group col-md-4">
						<label for="peso">Peso</label> 
						<input type="text" id="peso" name="peso" class="form-control" />
					</div>
				</div>
				<hr />
				<div class="form-group">
					<input class="btn btn-success" type="submit" name="btncc" value="Calcular IMC" /> 
					<input class="btn btn-danger" type="reset" name="btnrs" value="Cancelar" />
				</div>
			</form>
		</div>
	</div>
	<div class="card m-3">
		<div class="card-header" style="background-color: ${color}">
			<h5 class="mb-0">Resultado</h5>
		</div>
		<div class="card-body">${resultado}</div>
	</div>
</body>
</html>
</body>
</html>