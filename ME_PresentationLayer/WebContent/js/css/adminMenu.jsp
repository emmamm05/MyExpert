<c:choose>
<c:when test="${param.current==1}">
	<li class="current_page_item" ><a href="/ME_PresentationLayer/rest/Titulo?UUID=<%= request.getParameter("UUID") %>"  title="">Busqueda de titulos</a></li>
</c:when>
<c:otherwise>
	<li><a href="/ME_PresentationLayer/rest/Titulo?UUID=<%= request.getParameter("UUID") %>" title="">Busqueda de titulos</a></li>
</c:otherwise>
</c:choose>

<c:choose>
<c:when test="${param.current==2}">
	<li class="current_page_item" ><a href="/ME_PresentationLayer/rest/Generos?UUID=<%= request.getParameter("UUID") %>" title="">Lista generos</a></li>
</c:when>
<c:otherwise>
	<li><a href="/ME_PresentationLayer/rest/Generos?UUID=<%= request.getParameter("UUID") %>" title="">Lista generos</a></li>
</c:otherwise>
</c:choose>

<c:choose>
<c:when test="${param.current==3}">
	<li class="current_page_item" ><a href="/ME_PresentationLayer/rest/Titulo/Add?UUID=<%= request.getParameter("UUID") %>" title="">Crear titulo</a></li>
</c:when>
<c:otherwise>
	<li><a href="/ME_PresentationLayer/rest/Titulo/Add?UUID=<%= request.getParameter("UUID") %>" title="">Crear titulo</a></li>
</c:otherwise>
</c:choose>

<c:choose>
<c:when test="${param.current==4}">
	<li class="current_page_item" ><a href="#" accesskey="5" title="">Cargar calificacion</a></li>
</c:when>
<c:otherwise>
	<<li><a href="#" accesskey="5" title="">Cargar calificacion</a></li>
</c:otherwise>
</c:choose>

<c:choose>
<c:when test="${param.current==5}">
	<li class="current_page_item" ><a href="/ME_PresentationLayer/rest/Perfil?UUID=<%= request.getParameter("UUID") %>" title="">Perfil</a></li>
</c:when>
<c:otherwise>
	<li><a href="/ME_PresentationLayer/rest/Perfil?UUID=<%= request.getParameter("UUID") %>" title="">Perfil</a></li>
</c:otherwise>
</c:choose>

<c:choose>
<c:when test="${param.current==6}">
	<li class="current_page_item" ><a href="/ME_PresentationLayer/rest/Login" title="">Salir</a></li>
</c:when>
<c:otherwise>
	<li><a href="/ME_PresentationLayer/rest/Login" title="">Salir</a></li>
</c:otherwise>
</c:choose>