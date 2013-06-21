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
<link href="/ME_PresentationLayer/css/default.css" rel="stylesheet" type="text/css" media="all" />
<!--[if IE 6]>
<link href="default_ie6.css" rel="stylesheet" type="text/css" />
<![endif]-->
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

<div id="footer-wrapper">
	<div id="footer-content">
		<div>
			<form action="Titulo/Busqueda?UUID=<%= request.getParameter("UUID") %>" method="post" style="height: 577px">
				<p style="width: 351px" id="tituloSeccion">Búsqueda de títulos</p>
				<p></p>
				<table style="width: 1000px; height: 261px;">
					<tr>
						<td>
							<table style="width: 1000px">
								<tr>
									<td style="width: 230px" align="center">
									<select name="Criterio">
										<option>Película o serie</option>
										<option>Director</option>
									</select></td>
									<td align="center" style="width: 568px">
									<input name="PalabraClave" style="width: 492px" type="text" /></td>
									<td align="center">
									<input name="BuscarButton" type="submit" value="Buscar" /></td>
								</tr>
							</table>

						</td>
					</tr>
					<tr>
						<td style="height: 21px">
						</td>
					</tr>
					<tr>
						<td style="height:404px; border:thin">
						</td>
					</tr>
					<tr>
						<td align="center"></td>
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
