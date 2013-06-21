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
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
-->
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
	margin-left: 51px;
}
.auto-style2 {
	margin-left: 52px;
}
.auto-style3 {
	margin-left: 96px;
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
				<jsp:include page="adminMenu.jsp">
					<jsp:param value="1" name="current"/>
				</jsp:include>
			</ul>
		</div>
	</div>
</div>

<!-- Fin de encabezado de la pagina web -->

<!-- Pare media de la pagina web -->

<div id="footer-wrapper" style="height: 475px">
	<div id="footer-content">
		<div class="auto-style1" style="position: relative; left: 0px; top: 0px; width: 281px; height: 152px">
			<img src="/ME_PresentationLayer/images/icono_perfil.png" alt="" height="145" width="148"/>
		</div>
		<div style="position: relative; left: 378px; top: -149px; width: 622px; height: 410px">
			<p></p>
			<table class="auto-style2">
				<tr>
					<td>Usuario: ${it.user}</td><td></td>
				</tr>
				<tr><td></td><td></td></tr>
				<tr>
					<td>Nombre: ${it.nombre}</td><td></td>
				</tr>
				<tr><td></td><td></td></tr>
				<tr>
					<td>E-mail:  ${it.email}</td><td></td>
				</tr>
				<tr><td></td><td></td></tr>
				<tr>
					<td>Genero: ${it.genero}</td><td></td>
				</tr>
				<tr><td></td><td></td></tr>
				<tr>
					<td>Pais: ${it.pais}</td><td></td>
				</tr>
				<tr><td></td><td></td></tr>
				<tr>
					<td>Experiencia: </td><td></td>
				</tr>
				<tr><td></td><td></td></tr>
				<tr>
					<td>Generos:</td><td></td>
				</tr>
				<tr><td></td><td></td></tr>
				<tr>
					<td>Informacion personal:</td><td></td>
				</tr>
			</table>
			<p></p>
			<form method="post">
				<table>
					<tr>
						<td style="width: 279px">
						<input name="darseDeBaja" type="button" value="Darse de baja" class="auto-style3" /></td><td><input name="Editar" type="button" value="Editar" /></td>
					</tr>	
				</table>
			</form>
		</div>
	</div>
</div>

<!-- Fin Pare media de la pagina web -->

<!-- Parte inferior de la pagina web -->

<div id="page-wrapper">
	<div id="page">
	</div>
</div>

<!-- Fin de Parte inferior de la pagina web -->

<!-- Pie de la pagina web -->

<div id="footer">
	<p>Copyright (c) 2012 Sitename.com. All rights reserved. Design by <a href="http://www.freecsstemplates.org/" rel="nofollow">FreeCSSTemplates.org</a>. Photos by <a href="http://fotogrph.com/">Fotogrph</a>.</p>
</div>

<!-- Fin de la pagina web -->

</body>
</html>
