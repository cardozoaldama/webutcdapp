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
		<nav class="navbar navbar-dark bg-dark fixed-top">
			<div class="container-fluid">
				<a class="navbar-brand" href="#">Bienvenido <strong>${sessionScope.usuario.nombre}</strong> al Sistema de Quejas de Alumbrado Público</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="offcanvas" data-bs-target="#offcanvasDarkNavbar"
					aria-controls="offcanvasDarkNavbar">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="offcanvas offcanvas-end text-bg-dark" tabindex="-1"
					id="offcanvasDarkNavbar" aria-labelledby="offcanvasDarkNavbarLabel">
					<div class="offcanvas-header">
						<h5 class="offcanvas-title" id="offcanvasDarkNavbarLabel">Administrar</h5>
						<button type="button" class="btn-close btn-close-white"
							data-bs-dismiss="offcanvas" aria-label="Close"></button>
					</div>
					<div class="offcanvas-body">
						<ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
							<li class="nav-item"><a class="nav-link active"
								aria-current="page" href="#">Inicio</a></li>
							<li class="nav-item"><a class="nav-link active"
								aria-current="page" href="articulo?action=mostrar">Mostrar
									Articulos</a></li>
							<li class="nav-item"><a class="nav-link active"
								aria-current="page" href="articulo?action=nuevo">Nuevo
									Articulo</a></li>
							<li class="nav-item"><a class="nav-link active"
								aria-current="page" href="usuario?tipo=cerrarSesion">Cerrar
									Sesion</a></li>
						</ul>
					</div>
				</div>
			</div>
		</nav>
		<div class="flex-container">
			<div class="container">
				<div class="menu_container">
					<img class="menu_container__img" src="./img/android-chrome-512x512.png" alt="Logotipo de la empresa">
					<p class="menu_container__title"><i class="fa-solid fa-bars"></i> Menú de opciones</p>
					<div class="button"><a class="button__link button__link-text" href="principal.jsp"><i class="fa-solid fa-house-user"></i> Inicio</a></div>
					<div class="button"><a class="button__link button__link--quejas button__link-text" href="quejas.jsp"><i class="fa-solid fa-newspaper"></i> Ingresar una queja</a></div>
					<div class="button"><a class="button__link button__link--informe button__link-text" href="#"><i class="fa-solid fa-file-pdf"></i> Generar un informe</a></div>
					<div class="button"><a class="button__link button__link--logout button__link-text" href="usuario?tipo=cerrarSesion"><i class="fa-solid fa-right-from-bracket"></i> Cerrar sesión</a></div>
				</div>
			</div>
		</div>
	</body>
</html>