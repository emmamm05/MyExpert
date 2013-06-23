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
				<jsp:include page="basicMenu.jsp">
					<jsp:param value="1" name="current"/>
				</jsp:include>
			</ul>
		</div>
	</div>
</div>

<!-- Fin de encabezado de la pagina web -->

<!-- Pare media de la pagina web -->

<div id="footer-wrapper" style="height: 800px;">
	<div id="footer-content">
		<div>
			<form action="/ME_PresentationLayer/rest/Titulo/Busqueda?UUID=<%= request.getParameter("UUID") %>" method="post" style="height: 254px">
				<p style="width: 351px" id="tituloSeccion">Búsqueda de títulos</p>
				<p></p>
				<table style="width: 1000px; height: 51px;">
					<tr>
						<td>
							<table style="width: 1000px">
								<tr>
									<td style="width: 230px" align="center">
									<select name="Criterio">
										<option>Titulo</option>
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
				</table>
				<table border="0" >
						<c:forEach items="${it.resultadoBusqueda}" var="titulo" >
						<tr style=" height: 50px;">
							<td>Nombre: ${titulo.nombre} </td>
							<td><a href="/ME_PresentationLayer/rest/Titulo/Mostrar?UUID=<%= request.getParameter("UUID") %>&Codigo=${titulo.nombre}"><input type="button" value="Ver"/></input></a></td>
							<td><a href="/ME_PresentationLayer/rest/Titulo/Deshabilitar?UUID=<%= request.getParameter("UUID") %>&Codigo=${titulo.nombre}"><input type="button" value="Deshabilitar"/></input></a></td>
						</tr>
						</c:forEach>
					</table>
<!-- 			</form> -->
<%-- 			<form action="/ME_PresentationLayer/rest/Titulo/Mostrar?UUID=<%= request.getParameter("UUID") %>" method="post" style="height: 577px"> --%>
<!-- 				<table> -->
<!-- 					<tr>
<!-- 						<td style="height: 21px"> -->
<!-- 						</td> -->
<!-- 					</tr>--> -->
<!-- 					<tr> -->
<!-- 						<td style="border:thin"> -->
<!-- 							<table> -->
<%-- 								<c:forEach items="${it.resultadoBusqueda}" var="element"> --%>
<!-- 									<tr> -->
<%-- 										<td><input name="verTitulo" type="submit" value="${element.nombre}" /><input type="hidden" name="verTipo" value="${element.tipoDeTitulo}" /></td><td>Director: ${element.director}</td> --%>
<%-- 										<td><a href="/ME_PresentationLayer/rest/Titulo/Mostrar?UUID=<%= request.getParameter("UUID") %>"><input type="button" value="deshabilitar"/></input></a></td> --%>
<!-- 									</tr> -->
<%-- 								</c:forEach> --%>
<!-- 							</table> -->
<!-- 						</td> -->
<!-- 					</tr> -->
<!-- 					<tr> -->
<!-- 						<td align="center"></td> -->
<!-- 					</tr> -->
	
<!-- 				</table> -->
<!-- 			</form> -->
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

