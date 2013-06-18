<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
	margin-left: 253px;
}
.auto-style5 {
	margin-left: 60px;
}
.auto-style6 {
	margin-left: 20px;
}
.auto-style7 {
	margin-left: 106px;
}
.auto-style8 {
	margin-left: 557px;
}
</style>
</head>
<body>
<div id="header-wrapper">
	<div id="header">
		<div id="logo">
			<h1><img src="http://localhost:8080/ME_PresentationLayer/images/myexpert_512.png" alt=""/></h1>
		</div>
	</div>
</div>
<div id="footer-wrapper">
	<div id="footer-content">
		<div>
			<form id="input" action="Login" class="auto-style1" method="post" style="height: 226px; width: 392px">
				<p><b>${it.message}</b></p>
				<p style="width: 351px" id="tituloSeccion">Iniciar Sesión</p>
				<p></p>
				<table>
					<tr>
						<td>Usuario:</td><td>
						<input class="auto-style5" name="Username" style="width: 213px" type="text" /></td>
					</tr>
					<tr>
						<td>Contraseña:</td><td><input class="auto-style5" name="Password" style="width: 213px" type="password" /></td>
					</tr>
					<tr>
						<td></td><td><input name="accederButton" type="submit" value="Iniciar Sesión" class="auto-style7"/></td>
					</tr>
				</table>
			</form>
			<p class="auto-style8" style="width: 86px"><a href="Registro" rel="subsection">Registrarse</a></p>
		</div>
	</div>
</div>
<div id="footer">
	<p>Copyright (c) 2012 Sitename.com. All rights reserved. Design by <a href="http://www.freecsstemplates.org/" rel="nofollow">FreeCSSTemplates.org</a>. Photos by <a href="http://fotogrph.com/">Fotogrph</a>.</p>
</div>
</body>
</html>
