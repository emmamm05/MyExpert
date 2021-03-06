<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<!--
Design by Free CSS Templates
http://www.freecsstemplates.org
Released for free under a Creative Commons Attribution 2.5 License

Name       : GoodLife 
Description: A two-column, fixed-width design with dark color scheme.
Version    : 1.0
Released   : 20121013

-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>MyExpert</title>
<link href='http://fonts.googleapis.com/css?family=Oswald:400,300' rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Abel|Satisfy' rel='stylesheet' type='text/css' />
<link href="/ME_PresentationLayer/css/default.css" rel="stylesheet" type="text/css" media="all" />
<!--[if IE 6]>
<link href="default_ie6.css" rel="stylesheet" type="text/css" />
<![endif]-->
<style type="text/css">
.auto-style1 {
	margin-left: 300px;
}
</style>
</head>
<body>

<!-- Encabezado de la pagina web -->

<div id="header-wrapper">
	<div id="header">
		<div id="logo">
			<h1><img src="/ME_PresentationLayer/images/myexpert_256.png" alt=""/></h1>
		</div>
		<div id="menu">
			<ul>
				<jsp:include page="adminMenu.jsp"/>
			</ul>
		</div>
	</div>
</div>

<!-- Fin de encabezado de la pagina web -->

<!-- Pare media de la pagina web -->

<div id="footer-wrapper">
	<div id="footer-content" style="height: 272px">
		<div>
			<form action="/ME_PresentationLayer/rest/Titulo/Add?UUID=<%= request.getParameter("UUID") %>" method="post" style="height: 205px">
				<p style="width: 351px" id="tituloSeccion">Crear un titulo</p>
				<p></p>
				<table class="auto-style1">
					<tr>
						<td><p>Titulo:</p></td><td><input name="Titulo" style="width: 300px" type="text" /></td>
					</tr>
					<tr>
						<td>Director:</td><td><input name="Director" style="width: 300px" type="text" /></td>
					</tr>
					<tr>
						<td>Año:</td><td><input name="Anno" style="width: 300px" type="text" /></td>
					</tr>
					<tr>
						<td>Fotografia:</td><td><input name="Fotografia" style="width: 300px" type="file" /></td>
					</tr>
					<tr>
						<td>Link de trailer:</td><td><input name="Link" style="width: 300px" type="text" /></td>
					</tr>
					<tr>
						<td>Genero:</td><td><select name="Genero">
						<c:forEach items="${it}" var="genero">
							<option> ${genero.nombre} </option>
						</c:forEach>
						</select></td>
					</tr>
					<tr>
						<td><p>Tipo:</p></td><td>
						<input type="radio" name="Tipo" value="Pelicula" checked> Pelicula</input><br>
						<input type="radio" name="Tipo" value="Temporada"> Temporada</input><br>
					</tr>
					<tr>
						<td></td>
					</tr>
					<tr>
						<td></td><td><input name="CrearGenero" type="submit" value="Crear" /></td>
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
