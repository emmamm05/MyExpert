/**
 * 
 */
package controllers;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import logic.Login;
import logic.RecommendationBL;
import models.UserModel;

import com.sun.jersey.api.view.Viewable;

/**
 * @author emma
 *
 */
@Path("/Buzon")
public class BuzonController{

	@Context
	UriInfo uriInfo;
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public Response getBuzonPage(
			@QueryParam("UUID") String pUUID ){
		
		UserModel user = Login.getLoggedUser(pUUID);
		return Response.ok( new Viewable( "/Buzon", user.getBuzon() ) ).build();		
	}
	
	@Path("/VerRecomendacion")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public Response getRecomendacion(
			@QueryParam("UUID") String pUUID,
			@QueryParam("Id")  int pId){
		
		UserModel user = Login.getLoggedUser(pUUID);
		return Response.ok( new Viewable( "/ResponderSolicitud", user.getBuzon().get(pId) ) ).build();	
	}
	
	@Path("/AddRecomendacion")
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_HTML)
	public Response addRecomendacion(
			@FormParam("Descripcion") String pDescripcion,
			@QueryParam("UUID") String pUUID,
			@QueryParam("Id") String pId
			){
		
//		RecommendationBL logic = new RecommendationBL();
//		User user = Login.getLoggedUser(pUUID);
//		if (user.getBuzon().get(pId) != null){
//			user.getBuzon().get(pId).setAnswered(true);
//		}

		UriBuilder builder = uriInfo.getBaseUriBuilder();
		builder.path("/Perfil");
		builder.queryParam("UUID", pUUID);
		
		return Response.seeOther(builder.build()).build();
	}
}
