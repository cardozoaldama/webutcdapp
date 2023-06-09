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
		<!-- Incluir cabecera header.jsp -->
		<%@ include file="header.jsp" %>
		<%-- Container stuff --%>
		<div class="container">
			<img class="container_img" src="./img/clean.png" alt="Logotipo de la empresa" />
			<h1 class="container_title"><i class="fa-solid fa-pen fa-xs"></i> Ingresar una queja</h1>
			<div class="form_container">
				<form action="queja?action=register" method="post">
					<div class="label_container">
						<label for="nombre" class="label_container__label"><i class="fa-solid fa-user"></i> Nombre:</label>
						<input type="text" id="nombre" name="nombre" class="label_container__input" placeholder="Ej.: Alejandro Daniel" required>
					</div>
					<div class="label_container">
						<label for="apellido" class="label_container__label"><i class="fa-solid fa-user"></i> Apellido:</label>
						<input type="text" id="apellido" name="apellido" class="label_container__input" placeholder="Ej.: Pérez Suárez" required>
					</div>
					<div class="label_container">
						<label for="telefono" class="label_container__label"><i class="fa-solid fa-square-phone"></i> Teléfono:</label>
						<input type="text" id="telefono" name="telefono" class="label_container__input" placeholder="Ej.: 0991456789" required>
					</div>
					<!-- 
					<div class="label_container">
						<label for="numeroNIS" class="label_container__label"><i class="fa-solid fa-pager"></i> NIS:</label>
						<input type="text" id="numeroNIS" name="nis" class="label_container__input" placeholder="Ej.: 08241234">
					</div> 
					-->
					<div class="label_container">
						<label for="departamento" class="label_container__label"><i class="fa-solid fa-map-location-dot"></i> Departamento:</label>
						<input type="text" id="departamento" name="departamento" class="label_container__input" placeholder="Ingrese departamento">
					</div>
					<div class="label_container">
						<label for="ciudad" class="label_container__label"><i class="fa-solid fa-map-location-dot"></i> Ciudad:</label>
						<input type="text" id="ciudad" name="ciudad" class="label_container__input" placeholder="Ingrese ciudad">
					</div>
					<div class="label_container">
						<label for="barrio" class="label_container__label"><i class="fa-solid fa-map-location-dot"></i> Barrio:</label>
						<input type="text" id="barrio" name="barrio" class="label_container__input" placeholder="Ingrese barrio">
					</div>
					<div class="label_container">
						<label for="direccion" class="label_container__label"><i class="fa-solid fa-location-dot"></i> Dirección:</label>
						<input type="text" id="direccion" name="direccion" class="label_container__input" placeholder="Ej.: Calle San Isidoro, esquina tal..." required>
					</div>
					<div class="label_container">
						<label for="label_container__email" class="label_container__label"><i class="fa-solid fa-envelope"></i> Correo electrónico:</label>
						<input type="email" id="email" name="correo" class="label_container__email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" placeholder="Ej.: alejandro.perez@gmail.com">
					</div>
					<div class="label_container">
						<label for="referencia" class="label_container__label"><i class="fa-solid fa-map"></i> Referencias para llegar al lugar:</label>
						<textarea id="referencia" name="referencia" class="label_container__textarea" placeholder="Intente detallar lo máximo posible. Coloque color de la casa, N° de la casa, algunas referencias para tener encuenta." required></textarea>
					</div>
					<input type="submit" value="Enviar formulario" name="agregar" onclick="limpiarCampos()" class="btn btn-success btn-block btn-lg">
					<input type="button" onclick="redirigirPrincipal()" class="btn btn-danger btn-block btn-lg" value="Cancelar" name="cancelar" />
				</form>
			</div>
		</div>
		<script type="text/javascript" src="js/limpiar_datos.js"></script>
		<script type="text/javascript" src="js/redirigir_principal.js"></script>
	</body>
</html>