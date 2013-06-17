/**
 * 
 */
package service.controllers;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.QueryParam;


import logic.RecommendationBL;
import models.Recomendacion;

/**
 * @author emma
 *
 */
@Path("/Recomendaciones")
public class RecomendacionesController {
	
	@Path("/updates")
	@GET
	@Produces(MediaType.TEXT_XML)
	public List<Recomendacion> handleGetRecomendations(
			@QueryParam("Username") String pUsername,
			@QueryParam("TimeOrigin") String pTimeOrigin){
		RecommendationBL recomendationsBL = new RecommendationBL();
		return recomendationsBL.getNewRecommendations(pUsername, pTimeOrigin);	
	}
	
}
