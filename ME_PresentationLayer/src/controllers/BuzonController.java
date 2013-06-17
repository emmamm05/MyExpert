/**
 * 
 */
package controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import logic.Login;
import models.User;

import com.sun.jersey.api.view.Viewable;

/**
 * @author emma
 *
 */
@Path("/Buzon")
public class BuzonController{
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public Response getBuzonPage(
			@QueryParam("UUID") String pUUID ){
		
		User user = Login.getLoggedUser(pUUID);
		return Response.ok( new Viewable( "/Buzon", user.getBuzon() ) ).build();		
	}
}
