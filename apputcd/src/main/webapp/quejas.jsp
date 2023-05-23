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
		<!-- Font Awesome -->
		<script src="https://kit.fontawesome.com/08f7b10637.js" crossorigin="anonymous"></script>
		<title>Quejas de alumbrado público</title>
	</head>
	<body>
		<%-- 	<jsp:include page="encabezado.jsp" />
		Bienvenido ${sessionScope.usuario.nombre}
	 --%>
		<nav class="navbar navbar-dark bg-dark fixed-top">
			<div class="container-fluid">
				<a class="navbar-brand" href="principal.jsp">Bienvenido <strong>${sessionScope.usuario.nombre}</strong> al Sistema de Quejas de Alumbrado Público</a>
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
		<div class="container">
			<img class="container_img" src="./img/android-chrome-512x512.png" alt="Logotipo de la empresa" />
			<h1 class="container_title"><i class="fa-solid fa-pen fa-xs"></i> Ingresar una queja</h1>
			<div class="form_container">
				<div class="label_container">
					<label class="label_container__label">Nombre:</label>
					<input type="text" class="label_container__text" placeholder="Ej.: Alejandro Daniel" required>
				</div>
				<div class="label_container">
					<label class="label_container__label">Apellido:</label>
					<input type="text" class="label_container__text" placeholder="Ej.: Pérez Suárez" required>
				</div>
				<div class="label_container">
					<label class="label_container__label">Teléfono:</label>
					<input type="text" class="label_container__text" placeholder="Ej.: 0991456789" required>
				</div>
				<div class="label_container">
					<label class="label_container__label">NIS:</label>
					<input type="text" class="label_container__text" placeholder="Ej.: 08241234">
				</div>
				<div class="label_container">
					<label class="label_container__label">Departamento:</label>
					<select class="label_container__select">
						<option class="label_container__option">Seleccionar una opción</option>
					</select>
				</div>
				<div class="label_container">
					<label class="label_container__label">Ciudad:</label>
					<select class="label_container__select">
						<option class="label_container__option">Seleccionar una opción</option>
					</select>
				</div>
				<div class="label_container">
					<label class="label_container__label">Barrio:</label>
					<select class="label_container__select">
						<option class="label_container__option">Seleccionar una opción</option>
					</select>
				</div>
				<div class="label_container">
					<label class="label_container__label">Dirección:</label>
					<input type="text" class="label_container__text" placeholder="Ej.: Calle San Isidoro, esquina tal..." required>
				</div>
				<div class="label_container">
					<label class="label_container__label">Correo electrónico:</label>
					<input type="email" id="label_container__email" class="label_container__email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" placeholder="Ej.: alejandro.perez@gmail.com">
				</div>
				<div class="label_container">
					<label class="label_container__label">Referencias para llegar al lugar:</label>
					<textarea class="label_container__textarea" placeholder="Intente detallar lo máximo posible. Coloque color de la casa, N° de la casa, algunas referencias para tener encuenta." required></textarea>
				</div>
				<button class="button_send">Enviar formulario</button>
			</div>
		</div>
	</body>
</html>