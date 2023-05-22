<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" type="text/css" href="./css/normalize.css">
		<link rel="stylesheet" href="css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="./css/quejas.css">
		<script src="js/bootstrap.min.js"></script>
		<link rel="icon" type="image/x-icon" href="./img/favicon.ico" />
		<title>Quejas de alumbrado público</title>
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
								aria-current="page" href="principal.jsp">Inicio</a></li>
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
		<div>Hola</div>	
	</body>
</html>