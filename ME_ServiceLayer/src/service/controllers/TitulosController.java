/**
 * 
 */
package service.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import repositories.CatalogosRepository;

import models.ResennaModel;
import models.TituloModel;

/**
 * @author emma
 *
 */
@Path("/Titulos")
public class TitulosController {

	@Path("/updates")
	@GET
	@Produces(MediaType.TEXT_XML)
	public List<TituloModel> getUpdates(
			@QueryParam("username") String pUsername,
			@QueryParam("timestamp") String pTimestamp){
		CatalogosRepository repo = new CatalogosRepository();
		List<TituloModel> titulos = new ArrayList<TituloModel>();
		repo.getTitulosFrom(titulos, pTimestamp);
		return titulos;
	}
	
	@Path("/resenna")
	@GET
	@Produces(MediaType.TEXT_XML)
	public ResennaModel getResenna(){
		
		CatalogosRepository repo = new CatalogosRepository();
		ResennaModel resenna = new ResennaModel();
		repo.getRessennaCompleta(resenna);
		return resenna;		
	}
	
}
