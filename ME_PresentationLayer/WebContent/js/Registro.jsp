<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	margin-left: 190px;
}
.auto-style4 {
	margin-left: 30px;
}
.auto-style6 {
	margin-left: 53px;
}
.auto-style7 {
	margin-left: 110px;
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
				<li><a href="logInMyExpert.html" accesskey="4" title="">Volver</a></li>
			</ul>
		</div>
	</div>
</div>

<!-- Fin de encabezado de la pagina web -->

<!-- Pare media de la pagina web -->

<div id="footer-wrapper">
	<div id="footer-content">
		<div>
			<form action="Registro/newUser" method="post" style="height: 365px; width: 459px;" class="auto-style1">
				<table>
					<tr>
						<td style="width: 134px">Usuario:</td><td>
						<input name="Username" type="text" class="auto-style4" style="width: 230px" /></td>
					</tr>
					<tr>
						<td style="width: 134px">Contraseña:</td><td>
						<input name="Password" type="password" class="auto-style4" style="width: 230px" /></td>
					</tr>
					<tr>
						<td style="width: 134px">Repetir contraseña:</td><td>
						<input name="RepeatPassword" type="password" class="auto-style4" style="width: 230px" /></td>
					</tr>
					<tr>
						<td style="width: 134px">Email:</td><td>
						<input name="Email" type="text" class="auto-style4" style="width: 230px" /></td>
					</tr>
					<tr>
						<td style="width: 134px">Rol de usuario:</td>
						<td><div id="rolUsuario" class="auto-style6">
							<ul>
								<li>Usuario<input name="RolUser" type="radio" value="RolUser"/></li>
								<li>Administrador<input name="RolAdmin" type="radio" value="RolAdmin" /></li>
								<li>Encargado de planilla<input name="RolPlan" type="radio" value="RolPlan" /></li>
							</ul>
						</div></td>
					</tr>
					<tr>
						<td style="width: 134px"></td>
						<td><div>
							<input class="auto-style7" name="resgistro" type="submit" value="Registrarse" />
						</div></td>
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
