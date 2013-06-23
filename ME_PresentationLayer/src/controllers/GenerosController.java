/**
 * 
 */
package controllers;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Produces;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import autentificacion.BasicAuth;

import com.sun.jersey.api.view.Viewable;
import java.net.URI;

import logic.LogicFactory;
import logic.Login;
import models.GeneroModel;
import models.UsuarioModel;

import repositories.RepositorioTitulos;
import repositories.RepositorioUsuarios;

/**
 * @author emma
 *
 */
@Path("/Generos")
public class GenerosController {
	
	@Context
	UriInfo mUriInfo;
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public Response getGenerosView(
			@QueryParam("UUID") String pUUID,
			@QueryParam("pagina") int pNumPagina
			){
	
		LogicFactory logic = new LogicFactory();
		List<GeneroModel> generos = 
				logic.createCatalogosLogic().getAllGeneros();
		
		
		return Response.ok( new Viewable(
				Messages.getString("Pages.ListaGenero"), 
				generos ) ).build() ;
	}
	
	@Path("/Add")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public Response getAddGeneroView(
			@QueryParam("UUID") String pUUID){		
		
		return Response.ok( new Viewable(
				Messages.getString("Pages.AgregarGenero") ) ).build() ;	
	}
	
	@Path("/Edit")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public Response getEditGeneroView(
			@QueryParam("Codigo") String pCodigo,
			@QueryParam("UUID") String pUUID){		
		LogicFactory logic = new LogicFactory();
		GeneroModel genero = new GeneroModel();
		genero.setCodigo(pCodigo);
		logic.createCatalogosLogic().getGenero(genero);
		return Response.ok( new Viewable(
				Messages.getString("Pages.EditarGenero"),genero ) ).build() ;	
	}	
	
	@Path("/Save")
	@POST
	@Produces(MediaType.TEXT_HTML)
	public Response getEditarGeneroView(
			@QueryParam("Codigo") String pCodigo,
			@QueryParam("UUID") String pUUID,
			@FormParam("Nombre") String pNombre,
			@FormParam("Descripcion") String pDescripcion){
		
		UsuarioModel usuario = BasicAuth.getUser(pUUID);
		LogicFactory logic = new LogicFactory();
		GeneroModel genero = new GeneroModel();
		genero.setCodigo(pCodigo);
		genero.setNombre(pNombre);
		genero.setDescripcion(pDescripcion);
		logic.createCatalogosLogic().editGenero(genero, usuario.getUser());
		
		URI location = mUriInfo.getBaseUriBuilder()
				.path("/Generos")
				.queryParam("UUID", pUUID)
				.build();
		return Response.seeOther(location).build();
		
//		return Response.ok( new Viewable(
//				Messages.getString("Pages.AgregarGenero"),genero ) ).build() ;	
	}
	
	@Path("/Add")
	@POST
	@Produces(MediaType.TEXT_HTML)
	public Response addNewGenero(
			@FormParam("Nombre") String pNombre,
			@FormParam("Descripcion") String pDescripcion,
			@QueryParam("UUID") String pUUID){
		

		UsuarioModel usuario = BasicAuth.getUser(pUUID);
		
		LogicFactory logic = new LogicFactory();
		GeneroModel genero = new GeneroModel();
		genero.setNombre(pNombre);
		genero.setDescripcion(pDescripcion);
		genero.setCodigo(pNombre);
				
		logic.createCatalogosLogic().addGenero(genero, usuario.getUser());
		
		
		URI location = mUriInfo.getBaseUriBuilder()
				.path("/Generos")
				.queryParam("UUID", pUUID)
				.build();
		return Response.seeOther(location).build();
	}
	
	@Path("/Deshabilitar")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public Response deshabilitarGenero(
			@QueryParam("Codigo") String pCodigo,
			@QueryParam("UUID") String pUUID){
		
		LogicFactory logic = new LogicFactory();
		logic.createCatalogosLogic()
			.deshabilitarGenero(pCodigo);
		
		URI location = mUriInfo.getBaseUriBuilder()
				.path("/Generos")
				.queryParam("UUID", pUUID)
				.build();
		return Response.seeOther(location).build();
	}
	
	@Path("/Habilitar")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public Response habilitarGenero(
			@QueryParam("Codigo") String pCodigo,
			@QueryParam("UUID") String pUUID){
		
		LogicFactory logic = new LogicFactory();
		logic.createCatalogosLogic()
			.habilitarGenero(pCodigo);
		
		URI location = mUriInfo.getBaseUriBuilder()
				.path("/Generos")
				.queryParam("UUID", pUUID)
				.build();
		return Response.seeOther(location).build();
	}
	
}
