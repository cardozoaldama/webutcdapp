<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Inserción de departamentos, ciudades, y barrios</title>
	</head>
	<body>
		<!-- Incluir cabecera header.jsp -->
		<%@ include file="header.jsp" %>
		<h1>Insertar datos</h1>
		<form action="combos?action=register" method="post">
			<label for="departamento">Insertar departamento</label>
			<input type="text" id="departamento" name="departamento" placeholder="Ej.: Concepción" >
			<label for="departamento">Insertar ciudad</label>
			<input type="text" id="ciudad" name="ciudad" placeholder="Ej.: Horqueta" >
			<label for="departamento">Insertar barrio</label>
			<input type="text" id="barrio" name="barrio" placeholder="Ej.: Las Palmas" >
			<input type="submit" value="Enviar datos" name="agregar" onclick="limpiarCampos()" class="btn btn-success btn-block btn-lg">
			<input type="button" onclick="redirigirPrincipal()" class="btn btn-danger btn-block btn-lg" value="Cancelar" name="cancelar" />
		</form>
	</body>
</html>