<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<!-- Latest compiled and minified CSS -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
		<!-- jQuery library -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		<!-- Popper JS -->
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
		<!-- Latest compiled JavaScript -->
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="css/bootstrap.min.css">
		<title>Insertar departamentos, ciudades, y barrios</title>
	</head>
	<body>
		<h1>Inserción de combos</h1>
		 <form style="margin: auto; display: table" method="GET" id="form">
	        <input type="hidden" name="idDepartamento" id="idDepartamento" /> 
	            <fieldset>
	                <br/>
					<label>Seleccione el departamento</label>
					<select name="departamentos" id="idDepartamento">
					    <option value="" selected>Seleccionar</option>
					    <c:forEach var="departamento" items="${listaDepartamentos}">
					        <option value="${departamento.id_departamento}">${departamento.nombre}</option>
					    </c:forEach>
					</select>
					
					<label>Seleccione la ciudad</label>
					<select name="ciudades" id="ciudades">
					    <option value="" selected>Seleccionar</option>
					    <c:forEach var="ciudad" items="${listaCiudades}">
					        <option value="${ciudad.id_ciudad}" data-departamento="${ciudad.id_departamento}">${ciudad.nombre}</option>
					    </c:forEach>
					</select>
	                <br/>    
	                <br/><p style="text-align: center;">
	                    <button type="submit">Agregar</button>
	                </p>               
	            </fieldset>
	        </form>
	</body>
</html>