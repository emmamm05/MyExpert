/**
 * 
 */
package service.controllers;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import repositories.RepositorioTitulos;

import logic.CatalogosLogic;
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
			@QueryParam("Timestamp") String pStringTimestamp){
		CatalogosLogic wsLogic = new CatalogosLogic();
		if (pStringTimestamp==null){
			return null;
		}
		Timestamp timestamp = Timestamp.valueOf(pStringTimestamp);
		List<GeneroModel> generos = wsLogic.getGeneros(timestamp);
		return generos;		
	}
	
	@Path("/all")
	@GET
	@Produces(MediaType.TEXT_XML)
	public List<GeneroModel> getAll(){
		CatalogosLogic wsLogic = new CatalogosLogic();
		List<GeneroModel> generos = wsLogic.getAllGeneros();
		return generos;		
	}
	
}
