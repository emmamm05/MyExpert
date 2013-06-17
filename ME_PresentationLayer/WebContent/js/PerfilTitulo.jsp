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
<link href="default.css" rel="stylesheet" type="text/css" media="all" />
<!--[if IE 6]>
<link href="default_ie6.css" rel="stylesheet" type="text/css" />
<![endif]-->
</head>
<body>

<!-- Encabezado de la pagina web -->

<div id="header-wrapper">
	<div id="header">
		<div id="logo">
			<h1><img src="images/myexpert_256.png" alt=""/></h1>
		</div>
		<div id="menu">
			<ul>
				<li><a href="#" accesskey="1" title="">Perfil</a></li>
				<li><a href="Buzon.html" accesskey="2" title="">Buzón</a></li>
				<li class="current_page_item"><a href="#" accesskey="3" title="">Búsqueda de títulos</a></li>
				<li><a href="logInMyExpert.html" accesskey="4" title="">Salir</a></li>
			</ul>
		</div>
	</div>
</div>

<!-- Fin de encabezado de la pagina web -->

<!-- Pare media de la pagina web -->

<div id="footer-wrapper" style="height: 541px">
	<div id="footer-content" style="height: 422px">
		<div>
			<form id="formLogIn" method="post">
				<p style="width: 351px" id="tituloSeccion">Nombre del titulo</p>
			</form>
		</div>	
		<p></p>
		<div class="auto-style1" style="position: relative; left: 0px; top: 0px; width: 281px; height: 152px">
			<table>
				<tr>
					<td><img src="images/icono_perfil.png" alt="" height="145" width="148"/></td>
				</tr>
				<tr>
					<td align="center"><a href="#">Ver trailer</a></td>
				</tr>
			</table>
		</div>
		<div style="position: relative; left: 378px; top: -149px; width: 622px; height: 410px">
			<p></p>
			<table class="auto-style2">
				<tr>
					<td>Director:</td><td>${it.director}</td>
				</tr>
				<tr><td></td><td></td></tr>
				<tr>
					<td>Año:</td><td>${it.anno }</td>
				</tr>
				<tr><td></td><td></td></tr>
				<tr>
					<td>Calificación:</td><td>${it.calificacionesimdb }</td>
				</tr>
				<tr><td></td><td></td></tr>
				<tr>
					<td>Género:</td><td>${it.genero}</td>
				</tr>
			</table>
			<p></p>
			<form method="post">
				<table>
					<tr>
						<td style="width: 279px">
						&nbsp;</td><td><input name="Resenar" type="button" value="Reseñar" /></td>
					</tr>	
				</table>
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
