<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<!--
Design by Free CSS Templates
http://www.freecsstemplates.org
Released for free under a Creative Commons Attribution 2.5 License

Name       : GoodLife 
Description: A two-column, fixed-width design with dark color scheme.
Version    : 1.0
Released   : 20121013
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% response.addHeader("UUID", request.getHeader("UUID")); %>
-->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>MyExpert</title>
<link href='http://fonts.googleapis.com/css?family=Oswald:400,300' rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Abel|Satisfy' rel='stylesheet' type='text/css' />
<link href="http://localhost:8080/ME_PresentationLayer/css/default.css" rel="stylesheet" type="text/css" media="all" />
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
			<h1><img src="images/myexpert_256.png" alt=""/></h1>
		</div>
		<div id="menu">
			<ul>
				<li><a href="PaginaPerfil.html" accesskey="1" title="">Perfil</a></li>
				<li class="current_page_item"><a href="Buzon.html" accesskey="2" title="">Buzon</a></li>
				<li><a href="#" accesskey="3" title="">Busqueda de ti­tulos</a></li>
				<li><a href="logInMyExpert.html" accesskey="4" title="">Salir</a></li>

			</ul>
		</div>
	</div>
</div>

<!-- Fin de encabezado de la pagina web -->

<!-- Pare media de la pagina web -->

<div id="footer-wrapper">
	<div id="footer-content">
		<div>
			<form 
			 action="AddRecomendacion?UUID=<%= request.getParameter("UUID") %>&Id=<%= request.getParameter("Id") %>"
			 method="post" style="height: 234px">
				<p style="width: 351px" id="tituloSeccion">Responder solicitud</p>
				<p></p>
				<table class="auto-style1">
					<tr>
						<td><p>Para: ${it.destinatario}</p></td><td></td>
					</tr>
					<tr>
						<td>Descripcion:</td>
						<td><textarea rows="5" name="Descripcion" style="width: 300px"></textarea></td>
					</tr>
					<tr>
						<td></td>
					</tr>
					<tr>
						<td></td><td>
						<input name="enviar" type="submit" value="Enviar" /></td>
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