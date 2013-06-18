/**
 * 
 */
package service.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import repositories.CatalogosRepository;

import models.GeneroModel;

/**
 * @author emma
 *
 */
@Path("/Generos")
public class GenerosController {

	@Path("/updates")
	@GET
	@Produces(MediaType.TEXT_XML)
	public List<GeneroModel> getUpdates(
			@QueryParam("timestamp") String pTimeFrom){
		CatalogosRepository repo = new CatalogosRepository();
		List<GeneroModel> generos = new ArrayList<GeneroModel>();
		repo.getGenerosFrom( generos, pTimeFrom );
		return generos;		
	}
	
}
