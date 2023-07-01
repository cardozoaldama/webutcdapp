<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insertar departamentos</title>
	</head>
	<body>
		<!-- Incluir cabecera header.jsp -->
		<%@ include file="header.jsp" %>
		<h1>Insertar datos</h1>
		<form action="departamento?action=register" method="post">
			<label for="departamento">Insertar departamento</label>
			<input type="text" id="departamento" name="departamento" placeholder="Ej.: Concepción" >
			<input type="submit" value="Enviar datos" name="agregar" onclick="limpiarCampos()" class="btn btn-success btn-block btn-lg">
			<input type="button" onclick="redirigirPrincipal()" class="btn btn-danger btn-block btn-lg" value="Cancelar" name="cancelar" />
		</form>
	</body>
</html>