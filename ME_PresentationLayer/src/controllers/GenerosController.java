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

import models.Genero;

import repositories.CatalogosRepository;

/**
 * @author emma
 *
 */
@Path("/Generos")
public class GenerosController {
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public Response getGenerosView(
			@QueryParam("pagina") int pNumPagina
			){
		CatalogosRepository repo = new CatalogosRepository();
		List<Genero> generos = new ArrayList<Genero>();
		repo.getCantidadGeneros();
		repo.getGeneros( generos , 1 );
		return null;
	}
}
