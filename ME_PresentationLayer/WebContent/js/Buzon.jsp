<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!--
Design by Free CSS Templates
http://www.freecsstemplates.org
Released for free under a Creative Commons Attribution 2.5 License

Name       : GoodLife 
Description: A two-column, fixed-width design with dark color scheme.
Version    : 1.0
Released   : 20121013

-->
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:x="http://java.sun.com/jsp/jstl/xml">
<head>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>MyExpert</title>
<link href='http://fonts.googleapis.com/css?family=Oswald:400,300'
	rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Abel|Satisfy'
	rel='stylesheet' type='text/css' />
<link href="/ME_PresentationLayer/css/default.css"
	rel="stylesheet" type="text/css" media="all" />
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
				<h1>
					<img
						src="/ME_PresentationLayer/images/myexpert_256.png"
						alt="" />
				</h1>
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

	<div id="footer-wrapper" style="height: 475px">
		<div id="footer-content" style="height: 346px">
			<div>
				<form>
					<p id="tituloSeccion">Buzón</p>
					<table border="1" style="height: 150px; width: 994px">
						<c:forEach items="${it}" var="recomendacion">
							<tr>
								<c:if test="${recomendacion.value.answered}" >
									<td>${recomendacion.value.autor} </td>
								</c:if>
							</tr>
						</c:forEach>
					</table>
				</form>
			</div>
			<div>
				<form>
					<p id="tituloSeccion">Histórico</p>
					<table border="1" style="height: 150px; width: 994px">
						<c:forEach items="${it}" var="recomendacion">
							<tr>
								<c:if test="${! recomendacion.value.answered}" >
									<td><a href="Buzon/VerRecomendacion?UUID=<%= request.getParameter("UUID") %>&Id=${recomendacion.key}"> ${ recomendacion.value.autor } </a></td>
								</c:if>
							</tr>
						</c:forEach>
					</table>
				</form>
			</div>

		</div>
	</div>

	<!-- Fin Pare media de la pagina web -->

	<!-- Parte inferior de la pagina web -->

	<div id="page-wrapper">
		<div id="page"></div>
	</div>

	<!-- Fin de Parte inferior de la pagina web -->

	<!-- Pie de la pagina web -->

	<div id="footer">
		<p>
			Copyright (c) 2012 Sitename.com. All rights reserved. Design by <a
				href="http://www.freecsstemplates.org/" rel="nofollow">FreeCSSTemplates.org</a>.
			Photos by <a href="http://fotogrph.com/">Fotogrph</a>.
		</p>
	</div>

	<!-- Fin de la pagina web -->

</body>
</html>
