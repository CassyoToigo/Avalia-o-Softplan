<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resultado da Pesquisa</title>
</head>
<body>
	<div align="center">
		<h2>Resultado da Pesquisa</h2>
		<table border="1" cellpadding="5">
			<tr>
				<th>ID</th>
				<th>Nome</th>
				<th>Sexo</th>
				<th>CPF</th>
				<th>Status</th>
				<th>Endereço</th>
			</tr>
			<c:forEach items="${result}" var="cliente">
				<tr>
					<td>${cliente.id}</td>
					<td>${cliente.nome}</td>
					<td>${cliente.sexo}</td>
					<td>${cliente.cpf}</td>
					<td>${cliente.status}</td>
					<td>${cliente.endereco}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>