<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Carteira de investimentos</title>

<!-- Importação do Bootstrap -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
	crossorigin="anonymous">

</head>
<body class="container">
	<!-- Para centralizar todo conteúdo na tela -->
	<form action="<c:url value="/transacoes"/>" method="POST">
		<!-- Para redirecionar para página transacoes ao clicar no input -->
		<div class="form-group">
			<label for="ticker">Ticker</label>
			<!-- O for identifica para quem serve -->
			<input id="ticker " class="form-control" name="ticker">
			<!-- o id identifica para o for, para vincular o label para o input -->
		</div>
		<div class="form-group">
			<label for="data">Data</label> <input id="data" class="form-control"
				name="data">
		</div>
		<div class="form-group">
			<label for="preco">Preço</label> <input id="preco"
				class="form-control" name="preco">
		</div>
		<div class="form-group">
			<label for="quantidade">Quantidade</label> <input id="quantidade"
				class="form-control" name="quantidade">
		</div>
		<div class="form-group">
			<label for="tipo">Tipo</label> <input id="tipo" class="form-control"
				name="tipo">
		</div>
		<input type="submit" value="Gravar" class="mt-2 btn-primary">
	</form>

	<h1 class="text-center">Lista de transações</h1>
	<table class="table  table-striped table-hover table-bordered">
		<thead>
			<!-- Cabeçalho -->
			<tr>
				<!-- Linha do cabeçalho -->
				<th>TICKER</th>
				<!-- Colunas -->
				<th>DATA</th>
				<th>PREÇO</th>
				<th>QUANTIDADE</th>
				<th>TIPO</th>
			</tr>
		</thead>
		<tbody>
			<!-- Corpo da tabela -->
			<c:forEach items="${transacoes}" var="t">
				<!-- forEach para percorrer cada elemento da lista de transações feitas -->
				<tr>
					<td>${t.ticker}</td>
					<!-- Linha do corpo da tabela -->
					<td>${t.data}</td>
					<!-- Para referenciar uma variável usamos $_{variavel} -->
					<td>${t.preco}</td>
					<!-- Cada $_{variavel} chama o get que está implementado na classe -->
					<td>${t.quantidade}</td>
					<td>${t.tipo}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>