<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculadora Web</title>
<link rel="stylesheet" href="./css/bootstrap.min.css">
</head>
<body>
	<div class="card">
		<h5 class="card-header">Calculadora Web</h5>
		<div class="card-body">
			<form action="">

				<div class="form-row">
					
					<div class="col">

						<label>Valor 1</label> <input class="form-control" type="text"
							name="valor1" required>
					</div>
					<div class="col">

						<label>Valor 2</label> <input class="form-control" type="text"
							name="valor2" required>

					</div>
				</div>
				
				<hr>

				<input class="btn btn-primary" type="submit" name="btn" value="+">
				<input class="btn btn-danger" type="submit" name="btn" value="-">
				<input class="btn btn-warning" type="submit" name="btn" value="/">
				<input class="btn btn-success" type="submit" name="btn" value="*">

				<hr>
				
				<label>Resultado: ${resultado}</label>
				
			</form>

		</div>
	</div>



</body>
</html>