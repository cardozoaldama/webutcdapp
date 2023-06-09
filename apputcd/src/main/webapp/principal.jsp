<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" type="text/css" href="./css/normalize.css">
		<link rel="stylesheet" href="css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="./css/principal.css">
		<script src="js/bootstrap.min.js"></script>
		<title>Principal</title>
		<link rel="icon" type="image/x-icon" href="./img/favicon.ico" />
		<!-- Font Awesome -->
		<script src="https://kit.fontawesome.com/08f7b10637.js" crossorigin="anonymous"></script>
	</head>
	<body>
<%-- 	<jsp:include page="encabezado.jsp" />
	Bienvenido ${sessionScope.usuario.nombre}
 --%>	
 		<!-- Cabecera de menú -->
		<%@ include file="./vista/header.jsp"%>
		<div class="flex-container">
			<div class="container">
				<div class="menu_container">
					<img class="menu_container__img" src="./img/clean.png" alt="Logotipo de la empresa">
					<h1>¡Bienvenido a SIGRAP!</h1>
					<p class="menu_container__title"><i class="fa-solid fa-bars"></i> Menú de opciones</p>
					<div class="button"><a class="button__link button__link-text" href="principal.jsp"><i class="fa-solid fa-house-user"></i> Inicio</a></div>
					<div class="button"><a class="button__link button__link--quejas button__link-text" href="queja?action=registrarQuejas"><i class="fa-solid fa-newspaper"></i> Ingresar una queja</a></div>
					<div class="button"><a class="button__link button__link--informe button__link-text" href="queja?action=mostrarQuejas"><i class="fa-solid fa-file-pdf"></i> Mostrar quejas</a></div>
				</div>
			</div>
		</div>
	</body>
</html>