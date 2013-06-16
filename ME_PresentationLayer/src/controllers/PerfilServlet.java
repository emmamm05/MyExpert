/**
 * 
 */
package controllers;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import models.UserModel;

import com.sun.jersey.api.view.Viewable;

/**
 * @author emma
 *
 */

@Path("/Perfil")
public class PerfilServlet {

	  @POST
	  @Produces(MediaType.TEXT_HTML)
	  public Response showPerfilPage(  ){
			return Response.ok(new Viewable("Perfil" )).build();
	  }	
	
	
}
