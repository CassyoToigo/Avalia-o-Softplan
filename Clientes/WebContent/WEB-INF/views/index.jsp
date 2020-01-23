<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cliente Manager</title>
</head>
<body>
	<div align="center">
		<h2>Cliente Manager</h2>
		<form method="get" action="search">
			<input type="text" name="keyword" /> &nbsp; <input type="submit"
				value="Search" />
		</form>
		<h3>
			<a href="/new">Novo Cliente</a>
		</h3>
		<table border="1" cellpadding="5">
			<tr>
				<th>ID</th>
				<th>Nome</th>
				<th>Sexo</th>
				<th>CPF</th>
				<th>Status</th>
				<th>Endereço</th>

			</tr>
			<c:forEach items="${listCliente}" var="cliente">
				<tr>
					<td>${cliente.id}</td>
					<td>${cliente.nome}</td>
					<td>${cliente.sexo}</td>
					<td>${cliente.cpf}</td>
					<td>${cliente.status}</td>
					<td>${cliente.endereco}</td>

					<td><a href="/edit?id=${cliente.id}">Edit</a>
						&nbsp;&nbsp;&nbsp; <a href="/delete?id=${cliente.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>