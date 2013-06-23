<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

	<li><a href="/ME_PresentationLayer/rest/Perfil?UUID=<%= request.getParameter("UUID") %>" accesskey="1" title="">Perfil</a></li>
	<li><a href="/ME_PresentationLayer/rest/Buzon?UUID=<%= request.getParameter("UUID") %>" accesskey="2" title="">Buzón</a></li>
	<li><a href="/ME_PresentationLayer/rest/Titulo?UUID=<%= request.getParameter("UUID") %>" accesskey="3" title="">Búsqueda de títulos</a></li>
	<li><a href="/ME_PresentationLayer/rest/Login" accesskey="4" title="">Salir</a></li>