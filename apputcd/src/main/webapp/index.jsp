<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Inicio de Sesión</title>
	<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"> 
	<link rel="stylesheet" href="css/bootstrapValidator.css">
	<link rel="stylesheet" href="css/style.css" />-->
	<link rel="stylesheet" href="css/normalize.css" />
	<link rel="stylesheet" href="css/styles.css" />
	<link rel="icon" type="image/x-icon" href="./img/favicon.ico" />
	<!-- Font Awesome -->
	<script src="https://kit.fontawesome.com/08f7b10637.js" crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<div class="container_img"><img src="./img/android-chrome-512x512.png" alt="Logotipo de la empresa"></div>
		<c:set var="mensaje" value="${requestScope.mensaje}" />
		<c:if test="${not empty mensaje}">
			<div id="alertLogin"
				class="alert alert-danger alert-dismissible fade in">
				${mensaje} <a href="#" class="close" data-dismiss="alert"
					aria-label="close">&times;</a>
			</div>
		</c:if>
		<div class="form-container">
			<h2>Iniciar sesión</h2>
			<form id="formLogin" action="usuario" method="post">
				<input type="hidden" name="tipo" value="iniciarSesion" />
				<div class="form-group">
					<label for="usuario"><i class="fa-solid fa-user fa-xs"></i> Usuario</label>
					<input type="text" id="usuario" class="form-control" name="nombre" placeholder="Nombre de usuario" />
				</div>

				<div class="form-group">
					<label for="clave"><i class="fa-solid fa-key fa-xs"></i> Contraseña</label>
					<input type="password" id="clave" class="form-control" name="clave" placeholder="Contraseña" />
				</div>
				<button type="submit" class="btn btn-success btn-block btn-lg">Iniciar sesión <i class="fa-solid fa-right-to-bracket"></i></button>
			</form>
		</div>
	</div>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<script src="js/bootstrapValidator.js"></script>
	<script src="js/script.js"></script>
</body>
</html>