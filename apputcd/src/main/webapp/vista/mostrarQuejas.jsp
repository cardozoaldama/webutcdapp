<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="css/bootstrap.min.css">
		<script src="js/bootstrap.min.js"></script>
		<title>Mostrar Quejas</title>
		<link rel="icon" type="image/x-icon" href="../img/favicon.ico" />
		<!-- Font Awesome -->
		<script src="https://kit.fontawesome.com/08f7b10637.js" crossorigin="anonymous"></script>
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
		<div class="container-fluid">
	            <h1>La clase columna</h1>
	     <input type="button" onclick="history.back()" name="volver atrás" value="Atrás">
	     <p></p>
	            <p>Lista de Quejas</p>
	        </div>
	        <div class="container-fluid">
	            <h2></h2>
	            <div class="table-responsive">
	                <table class="table table-hover">
	                    <thead>
	                        <tr>
	                            <!-- <th>Id</th>-->
	                            <th>Nombre</th>
								<th>Apellido</th>
								<th>Teléfono</th>
								<th>Departamento</th>
								<th>Ciudad</th>
								<th>Barrio</th>
								<th>Dirección</th>
								<th>Correo Electrónico</th>
								<th>Referencias para llegar al lugar</th>
								<th colspan=2>Acciones</th>
	                        </tr>
	                    </thead>
	                    <tbody>
	                        <c:forEach var="queja" items="${lista}">
								<tr>
									<!--<td><c:out value="${articulo.idarticulo}"/></td>-->
									<td><c:out value="${queja.nombre}"/></td>
									<td><c:out value="${queja.apellido}"/></td>
									<td><c:out value="${queja.telefono}"/></td>
									<td><c:out value="${queja.departamento}"/></td>
									<td><c:out value="${queja.ciudad}"/></td>
									<td><c:out value="${queja.barrio}"/></td>
									<td><c:out value="${queja.direccion}"/></td>
									<td><c:out value="${queja.correo}"/></td>
									<td><c:out value="${queja.referencia}"/></td>
									<%-- 
									<td><a href="articulo?action=showedit&id=<c:out value="${articulo.idarticulo}" />">Editar</a></td>
									<td><a href="articulo?action=eliminar&id=<c:out value="${articulo.idarticulo}"/>">Inactivar</a> </td>
									 --%>				
								</tr>
							</c:forEach>
	                    </tbody>
	                </table>
	            </div> 
	        </div>
			<table>
			<tr>
			</tr>
		</table>
	</body>
</html>