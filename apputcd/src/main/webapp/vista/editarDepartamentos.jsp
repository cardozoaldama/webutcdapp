<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="css/bootstrap.min.css">
		<script src="js/bootstrap.min.js"></script>
		<title>Editar Departamentos</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
		<!-- Latest compiled and minified CSS -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
		<!-- jQuery library -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		<!-- Popper JS -->
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
		<!-- Latest compiled JavaScript -->
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script> 
	</head>
	<body>
	<!-- Incluye la cabecera -->
		<%@ include file="header.jsp"%>
		<p></p>
		<p></p>
		<p></p>
		<p></p>
		<p></p>
		<h1>XD</h1>
		<input type="button" onclick="history.back()" name="volver atrás" value="Atrás">
	     <p></p>
		<h1>Editar Departamento</h1>
		<form action="departamento?action=editar" method="post" >
			<table>
				<tr>
					<td><label></label></td>
					<td><input type="hidden" name="id" value="<c:out value="${departamento.iddepartamento}"></c:out>" ></td>
				</tr>
				<tr>
					<td><label>Nombre</label></td>
					<td><input type="text" name="nombre" value='<c:out value="${departamento.nombre}"></c:out>' ></td>
				</tr>
				<tr>
					<td><label>Observación</label></td>
					<td><input type="text" name="observacion" value='<c:out value="${departamento.observacion}"></c:out>' ></td>
				</tr>
				<!-- ACTION BUTTONS -->
				<tr>
					<td><input type="submit" value="Actualizar" name="agregar"></td>	
					<td><input type="button" onclick="redirigirPrincipal()" value="Cancelar" name="cancelar" /></td>	
				</tr>
			</table>
		</form>
		
		<%-- Verificar si hay un mensaje en la solicitud y mostrarlo --%>
		<c:if test="${not empty requestScope.mensaje}">
		    <div class="alert alert-success" role="alert">
		        ${requestScope.mensaje}
		    </div>
		</c:if>
	<script src="../js/limpiar_datos.js"></script>
	<script src="../js/redirigir_principal.js"></script>
	</body>
</html>