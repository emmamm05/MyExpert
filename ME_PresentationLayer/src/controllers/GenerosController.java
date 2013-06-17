/**
 * 
 */
package controllers;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Produces;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.sun.jersey.api.view.Viewable;

import logic.Login;
import models.Genero;
import models.User;

import repositories.CatalogosRepository;
import repositories.UserRepository;

/**
 * @author emma
 *
 */
@Path("/Generos")
public class GenerosController {
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public Response getGenerosView(
			@QueryParam("UUID") String pUUID,
			@QueryParam("pagina") int pNumPagina
			){
		User user = Login.getLoggedUser(pUUID);
		CatalogosRepository repo = new CatalogosRepository();
		List<Genero> generos = new ArrayList<Genero>();
		repo.getCantidadGeneros();
		repo.getGeneros( generos , 1 );
		
		return Response.ok( new Viewable(
				Messages.getString("Pages.ListaGenero"), 
				generos ) ).build() ;
	}
}
