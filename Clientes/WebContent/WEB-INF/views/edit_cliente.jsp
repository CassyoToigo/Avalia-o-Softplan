<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Editar Cliente</title>
</head>
<body>
	<div align="center">
		<h2>Editar Cliente</h2>
		<form:form action="save" method="post" modelAttribute="cliente">
			<table border="0" cellpadding="5">
				<tr>
					<td>ID:</td>
					<td>${cliente.id}<form:hidden path="id" />
					</td>
				</tr>
				<tr>
					<td>Nome:</td>
					<td><form:input path="nome" /></td>
				</tr>

				<tr>
					<td>Sexo:</td>
					<td><form:input path="sexo" /></td>
				</tr>
				<tr>
					<td>CPF:</td>
					<td><form:input path="cpf" /></td>
				</tr>
				<tr>
					<td>Status:</td>
					<td><form:input path="status" /></td>
				</tr>
				<tr>
					<td>Endereço:</td>
					<td><form:input path="endereco" /></td>
				</tr>



				<tr>
					<td colspan="2"><input type="submit" value="Save"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>