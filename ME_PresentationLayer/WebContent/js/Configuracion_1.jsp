<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>MyExpert</title>
<link href='http://fonts.googleapis.com/css?family=Oswald:400,300' rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Abel|Satisfy' rel='stylesheet' type='text/css' />
<link href="../css/default.css" rel="stylesheet" type="text/css" media="all" />
<!--[if IE 6]>
<link href="default_ie6.css" rel="stylesheet" type="text/css" />
<![endif]-->
<style type="text/css">
.auto-style1 {
	margin-left: 43px;
}
.auto-style4 {
	margin-left: 30px;
}
.auto-style7 {
	margin-left: 205px;
}
.auto-style8 {
	margin-left: 510px;
	margin-top: 0px;
}
</style>
</head>
<body>

<!-- Encabezado de la pagina web -->

<div id="header-wrapper">
	<div id="header">
		<div id="logo">
			<h1><img src="../images/myexpert_256.png" alt=""/></h1>
		</div>
		<div id="menu">
			<ul>
				<li><a href="logInMyExpert.html" accesskey="4" title="">Salir</a></li>
			</ul>
		</div>
	</div>
</div>

<!-- Fin de encabezado de la pagina web -->

<!-- Pare media de la pagina web -->

<div id="footer-wrapper">
	<div id="footer-content" style="height: 374px">
		<div style="width: 313px; height: 168px; position: relative; left: 32px; top: -18px">
			<img src="../images/icono_perfil.png" alt="" height="145" width="148"/>
			<form action="" method="post">
				Seleccionar imagen de perfil:<input name="File1" type="file" />
			</form>
		</div>
		<div class="auto-style8" style="position: relative; left: -100px; top: -193px; height: 361px">
			<form action="userConfig" method="post" style="height: 314px; width: 436px;" class="auto-style1">
				<p></p>
				<table>
					<tr>
					<td>Usuario:</td><td><input name="user" type="text" class="auto-style4" style="width: 200px" value="${it.username}" /></td>
					</tr>
					<tr>
					<td>Nombre:</td><td><input name="name" type="text" class="auto-style4" style="width: 200px" value="" /></td>
					</tr>
					<tr>
					<td>Email:</td><td><input name="correo" type="text" class="auto-style4" style="width: 200px" value="${it.mail}" /></td>
					</tr>
					<tr>
					<td>Genero:</td><td><input name="femenino" type="radio" class="auto-style4" value="femenino" />Femenino<input name="masculino" type="radio" class="auto-style4" value="masculino" />Masculino</td>
					</tr>
					<tr>
					<td>Pais:</td><td>
						<select class="auto-style4" name="paises" style="width: 200px">
						<option value="Costa Rica">Costa Rica</option>
						<option value="USA">USA</option>
						<option value="España">España</option>
						<option value="Brasil">Brasil</option>
						</select></td>
					</tr>
					<tr>
					<td>Experiencia:</td><td><input name="experiencia" type="text" class="auto-style4" style="width: 200px" /></td>
					</tr>
					<tr>
					<td>Generos:</td><td>
						<select class="auto-style4" name="generos" style="width: 200px">
						<option value="Comedia">Comedia</option>
						<option value="Terror">Terror</option>
						<option value="Drama">Drama</option>
						<option value="Suspenso">Suspenso</option>
						</select></td>
					</tr>
					<tr>
					<td>Informacion personal:</td><td>
						<textarea rows="3" name="comentarios" class="auto-style4" style="width: 200px"></textarea></td>
					</tr>
				</table>
				<div><input class="auto-style7" name="resgistro" type="submit" value="Registrarse" /></div>
			</form>
		</div>
	</div>
</div>

<!-- Fin Pare media de la pagina web -->

<!-- Parte inferior de la pagina web -->

<!-- Fin de Parte inferior de la pagina web -->

<!-- Pie de la pagina web -->

<div id="footer">
	<p>Copyright (c) 2012 Sitename.com. All rights reserved. Design by <a href="http://www.freecsstemplates.org/" rel="nofollow">FreeCSSTemplates.org</a>. Photos by <a href="http://fotogrph.com/">Fotogrph</a>.</p>
</div>

<!-- Fin de la pagina web -->

</body>
</html>
