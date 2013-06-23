/**
 * 
 */
package service.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.QueryParam;


import logic.LogicFactory;
import models.RecomendacionModel;

/**
 * @author emma
 *
 */
@Path("/Recomendaciones")
public class RecomendacionesController {
	
	@Path("/updates")
	@GET
	@Produces(MediaType.TEXT_XML)
	public List<RecomendacionModel> handleGetRecomendations(
			@QueryParam("Username") String pUsername,
			@QueryParam("TimeOrigin") String pTimeOrigin){
		
		LogicFactory logic = new LogicFactory();
		ArrayList<RecomendacionModel> list =new ArrayList<RecomendacionModel>();
		list.add(new RecomendacionModel());
		return list;
	}
	
	@Path("/solicitar")
	@POST
	@Consumes("application/xml")
	@Produces(MediaType.TEXT_PLAIN)
	public Response solicitarRecomendacion( RecomendacionModel pRecomendacion ){
		LogicFactory logic = new LogicFactory();
		logic.createBuzonLogic().addRecomendacion(pRecomendacion);
		return null;
	}
	
}
